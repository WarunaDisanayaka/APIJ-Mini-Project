package com.Main.ChatServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatImplementation extends UnicastRemoteObject implements Chat {

    public List<Message> newMessage = new ArrayList<>();

    public Message newmsg = new Message();

    public ChatImplementation() throws RemoteException{
        super();
    }

    @Override
    public void subscribe() throws RemoteException {

    }

    @Override
    public boolean is_subscribe() throws RemoteException {
        return false;
    }

    @Override
    public void sendMessage(Message msg) throws RemoteException {

    }

    @Override
    public Message broadcast() throws RemoteException {
        return null;
    }

    @Override
    public void saveToFile() throws RemoteException {

    }

    @Override
    public String test(String text) throws RemoteException {
        System.out.println(text);
        return text;
    }
}
