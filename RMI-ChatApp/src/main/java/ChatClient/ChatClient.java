package ChatClient;

import ChatServer.ChatInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatClient {
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2099);
            ChatInterface chat = (ChatInterface)registry.lookup("chatServer");  //getting a remote reference
//            new WelcomeView(chat);  //pass the reference as a parameter
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
