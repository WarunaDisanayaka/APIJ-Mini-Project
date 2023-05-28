package ChatClient.chatclient;

import ChatClient.chat.ChatInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import ChatClient.Home;

public class ChatClient {
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2099);
            ChatInterface chat = (ChatInterface)registry.lookup("chatServer");  //getting a remote reference
            new Home(chat); //pass the reference as a parameter
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
