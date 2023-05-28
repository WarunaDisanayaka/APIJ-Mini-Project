package com.Main.ChatServer.server;

import com.Main.ChatServer.Chat;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class client {

    public Chat chatInterface=null;

    public void runClient(String name, int portid){
        String chat = "";

        int port = 30000+portid;

        try {

            chatInterface = (Chat) Naming.lookup("rmi://localhost:"+port+"/"+name);

        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        new client().runClient("chat1", 1);

    }

}
