package com.talkflow.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ChatServerInterface extends Remote {
    void sendMessage(Message message) throws RemoteException;
    void joinChatRoom(ChatClientInterface client, String chatRoomId) throws RemoteException;
    void leaveChatRoom(ChatClientInterface client, String chatRoomId) throws RemoteException;
}
