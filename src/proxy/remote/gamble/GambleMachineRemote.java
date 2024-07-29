package proxy.remote.gamble;

import proxy.remote.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GambleMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
