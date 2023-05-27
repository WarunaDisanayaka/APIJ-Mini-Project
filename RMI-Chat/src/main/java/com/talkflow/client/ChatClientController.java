package com.talkflow.client;
import com.talkflow.common.ChatClientInterface;
import com.talkflow.common.Message;
import com.talkflow.server.ChatService;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatClientController extends UnicastRemoteObject implements ChatService {
    private List<ChatClientInterface> clients;

    public ChatClientController() throws RemoteException {
        super();
        clients = new ArrayList<>();
    }

    @Override
    public void sendMessage(Message message) throws RemoteException {
        synchronized (clients) {
            for (ChatClientInterface client : clients) {
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

    public void registerClient(ChatClientInterface client) throws RemoteException {
        synchronized (clients) {
            clients.add(client);
        }
    }

    public void unregisterClient(ChatClientInterface client) throws RemoteException {
        synchronized (clients) {
            clients.remove(client);
        }
    }
}