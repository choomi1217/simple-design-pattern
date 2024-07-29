import proxy.remote.MyRemote;
import proxy.remote.MyRemoteImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class App {

    public static void main(String[] args) {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            Naming.bind("RemoteHello", myRemote);
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            throw new RuntimeException(e);
        }
    }

}
