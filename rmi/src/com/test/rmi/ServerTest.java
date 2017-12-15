package com.test.rmi;  
  
import java.rmi.AlreadyBoundException;  
import java.rmi.RemoteException;  
import java.rmi.registry.LocateRegistry;  
import java.rmi.registry.Registry;  
  
public class ServerTest {  
      
    private static Registry registry = null;  
      
    public static Registry getInstance() throws RemoteException {  
        try {  
            return registry == null ? (registry = LocateRegistry  
                    .createRegistry(1099)) : registry;  
        } catch (RemoteException e) {  
            throw e;  
        }  
    }  
      
    private ServerTest() {  
    }  
      
    public static void main(String[] args) throws InterruptedException {  
        try {  
            MyServer server = new MyServer();  
            getInstance().bind("server", server);  
        } catch (RemoteException e) {  
            e.printStackTrace();  
        } catch (AlreadyBoundException e) {  
            e.printStackTrace();  
        }  
        System.err.println("server bind end");  
    }  
}  