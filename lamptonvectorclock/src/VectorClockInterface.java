import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VectorClockInterface extends Remote {
    int[] getClock() throws RemoteException;  
    void increment(int processId) throws RemoteException;  
    void update(int[] remoteClock, int processID) throws RemoteException;  
}