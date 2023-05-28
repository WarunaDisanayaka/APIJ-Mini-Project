package ChatServer;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChatImpl extends UnicastRemoteObject implements ChatInterface, Serializable {
    protected ChatImpl() throws RemoteException {
        super();
    }


    @Override
    public boolean login(String username) throws RemoteException {
        return false;
    }

    @Override
    public void logout(String username) throws RemoteException {

    }

    @Override
    public List<Message> getAllMessages() throws RemoteException {
        return null;
    }

    @Override
    public List<String> getAllUsers() throws RemoteException {
        return null;
    }

    public void sendMessage(Message message) throws RemoteException {

    }
}
