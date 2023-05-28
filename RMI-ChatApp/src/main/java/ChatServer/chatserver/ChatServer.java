package ChatServer.chatserver;

import ChatServer.chat.ChatImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServer {
    public static void main(String[] args) {
        try {
            System.out.println("Starting server");
            Registry registry= LocateRegistry.createRegistry(2099);
            registry.rebind("chatServer",new ChatImpl());
            System.out.println("Server started");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
