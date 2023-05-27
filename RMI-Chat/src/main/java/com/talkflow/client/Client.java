package com.talkflow.client;
import com.talkflow.common.ChatClientInterface;
import com.talkflow.common.ChatServerInterface;
import com.talkflow.common.Message;
import com.talkflow.server.ChatServerController;
import com.talkflow.server.ChatService;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;


public class Client extends UnicastRemoteObject implements ChatClientInterface {
    private String username;
    private String chatRoomId;
    private ChatServerInterface server;

    public Client(String username, String chatRoomId, ChatServerInterface server) throws RemoteException {
        super();
        this.username = username;
        this.chatRoomId = chatRoomId;
        this.server = server;
        server.joinChatRoom(this, chatRoomId);
    }

    public void startChat() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chat started. Type 'exit' to leave the chat.");

            while (true) {
                String messageContent = scanner.nextLine();
                if (messageContent.equals("exit")) {
                    server.leaveChatRoom(this, chatRoomId);
                    break;
                }

                Message message = new Message(username, messageContent, chatRoomId);
                server.sendMessage(message);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void receiveMessage(Message message) throws RemoteException {
        System.out.println("[" + message.getSender() + "]: " + message.getContent());
    }

    @Override
    public String getUsername() throws RemoteException {
        return username;
    }

    @Override
    public String getChatRoomId() throws RemoteException {
        return chatRoomId;
    }

    public static void main(String[] args) {
        try {
            ChatServerInterface server = (ChatServerInterface) Naming.lookup("rmi://localhost/ChatServer");

            System.out.print("Enter your username: ");
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();

            System.out.print("Enter the chat room ID: ");
            String chatRoomId = scanner.nextLine();

            Client client = new Client(username, chatRoomId, server);
            client.startChat();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}