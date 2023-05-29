package com.Main.ChatServer.server;

import com.Main.ChatServer.Chat;
import com.Main.ChatServer.ChatImplementation;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.HashMap;
import java.util.Map;

public class server {
    private Map<String, Chat> chatInstances;

    public server() {
        chatInstances = new HashMap<>();
    }

    public void runServer(String name, int portid) {
        try {
            Chat chat = new ChatImplementation();

            int port = 40000+portid;

            LocateRegistry.createRegistry(port);

            Naming.rebind("rmi://localhost:" + port + "/" + name, chat);

            chatInstances.put(name, chat);

            System.out.println("Server '" + name + "' up and running on port : " + port);

        } catch (RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void stopServer(String name) {
        try {
            Chat chat = chatInstances.get(name);
            if (chat != null) {
                String[] bindings = Naming.list("rmi://localhost/");
                for (String binding : bindings) {
                    if (binding.contains(name)) {
                        Naming.unbind(binding);
                        break;
                    }
                }
                chatInstances.remove(name);
                System.out.println("Server '" + name + "' stopped.");
            } else {
                System.out.println("Server '" + name + "' is not running.");
            }
        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        server server = new server();
        server.runServer("chat1",1);
//        server.runServer("chat2",2);

    }
}
