package proxy.remote.monitor;

import proxy.remote.gamble.GambleMachineRemote;

import java.rmi.RemoteException;

public class GambleMonitor {
    private final GambleMachineRemote gambleMachineRemote;

    public GambleMonitor(GambleMachineRemote gambleMachineRemote) {
        this.gambleMachineRemote = gambleMachineRemote;
    }

    public void report() {
        try {
            System.out.println("Gamble Machine: " + gambleMachineRemote.getLocation());
            System.out.println("Current inventory: " + gambleMachineRemote.getCount() + " gumballs");
            System.out.println("Current state: " + gambleMachineRemote.getState());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
