package com.talkflow.server;
import com.talkflow.common.ChatClientInterface;
import com.talkflow.common.Message;
import com.talkflow.client.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatService extends Remote {
    void registerClient(ChatClientInterface client) throws RemoteException;
    void unregisterClient(ChatClientInterface client) throws RemoteException;
    void sendMessage(Message message) throws RemoteException;

}
