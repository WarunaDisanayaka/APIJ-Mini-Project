package com.talkflow.server;


import com.talkflow.common.ChatServerInterface;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            ChatServerInterface chatServer = new ChatServerController();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/ChatServer", chatServer);
            System.out.println("Server started.");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}