package com.talkflow.server;
import com.talkflow.common.ChatClientInterface;
import com.talkflow.common.ChatServerInterface;
import com.talkflow.common.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatServerController extends UnicastRemoteObject implements ChatServerInterface {
    private Map<String, List<ChatClientInterface>> chatRooms;

    public ChatServerController() throws RemoteException {
        super();
        chatRooms = new HashMap<>();
    }

    @Override
    public void sendMessage(Message message) throws RemoteException {
        String chatRoomId = message.getChatRoomId();
        List<ChatClientInterface> clients = chatRooms.get(chatRoomId);
        if (clients != null) {
            synchronized (clients) {
                for (ChatClientInterface client : clients) {
                    if (!client.getUsername().equals(message.getSender())) {
                        Thread thread = new Thread(() -> {
                            try {
                                client.receiveMessage(message);
                            } catch (RemoteException e) {
                                // Handle exception (client may have disconnected)
                            }
                        });
                        thread.start();
                    }
                }
            }
        }
    }

    @Override
    public void joinChatRoom(ChatClientInterface client, String chatRoomId) throws RemoteException {
        synchronized (chatRooms) {
            List<ChatClientInterface> clients = chatRooms.computeIfAbsent(chatRoomId, k -> new CopyOnWriteArrayList<>());
            clients.add(client);
        }
    }

    @Override
    public void leaveChatRoom(ChatClientInterface client, String chatRoomId) throws RemoteException {
        synchronized (chatRooms) {
            List<ChatClientInterface> clients = chatRooms.get(chatRoomId);
            if (clients != null) {
                clients.remove(client);
                if (clients.isEmpty()) {
                    chatRooms.remove(chatRoomId);
                }
            }
        }
    }
}