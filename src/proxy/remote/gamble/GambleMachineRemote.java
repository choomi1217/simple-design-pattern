package proxy.remote.gamble;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GambleMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public String getState() throws RemoteException;
}
