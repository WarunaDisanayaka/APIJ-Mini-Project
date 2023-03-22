/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing.server;

import java.rmi.*;
/**
 *
 * @author warunapradeep
 */
public class ChatServer extends UnicastRemoteObject implements ChatServerIF {
    private static final long serialVersionUID = 1L;
    private  ArrayList<ChatClientIF>chatClients;
    protected ChatServer()throws RemoteException{
        chatClients =new

    }

    public void registerChatClient(ChatClientIF chatClient)throws RemoteException{

    }

    void broadcastMessage(String message)throws RemoteException{

    }



}
