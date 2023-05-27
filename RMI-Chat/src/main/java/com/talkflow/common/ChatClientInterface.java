package com.talkflow.common;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientInterface extends Remote {
    void receiveMessage(Message message) throws RemoteException;
    String getUsername() throws RemoteException;
    String getChatRoomId() throws RemoteException;
}
