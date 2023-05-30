package com.Main.ChatServer.server;

import com.Main.ChatServer.Chat;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class client {

    public Chat chatInterface=null;

    Scanner input = new Scanner(System.in);

    public void runClient(String name, int portid){
        String chat = "";

        int port = 40000+portid;

        try {

            chatInterface = (Chat) Naming.lookup("rmi://192.168.8.103:"+port+"/"+name);

        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        new client().runClient("chat1", 1);

    }

}
