package ChatServer.chat;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatImpl extends UnicastRemoteObject implements ChatInterface, Serializable {
    List<String> users = new ArrayList<>();
    List<Message> messages = new ArrayList<>();
    public ChatImpl() throws RemoteException {
        super();
    }


    @Override
    public boolean login(String username) throws RemoteException {
        boolean flag = false;
        for (String user : users) {
            if (username.equals(user)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            users.add(username);
            Message message = new Message();
            message.setUsername(username);
            message.setMsg(" joined the conversation ");
            message.setType("join");
            message.setDate(new Date());
            messages.add(message);

            return true;
        }else{
            return false;
        }
    }

    @Override
    public void logout(String username) throws RemoteException {

    }

    @Override
    public List<Message> getAllMessages() throws RemoteException {
        for(Message m : messages){
            System.out.println(m.getUsername() + " " + m.getMsg());
        }
        return messages;
    }

    @Override
    public List<String> getAllUsers() throws RemoteException {
        for(String u : users){
            System.out.println(u);
        }
        return users;
    }

    public void sendMessage(Message message) throws RemoteException {

    }
}
