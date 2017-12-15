package com.test.rmi;  
  
import java.rmi.RemoteException;  
import java.rmi.server.UnicastRemoteObject;  
  
  
public class MyServer extends UnicastRemoteObject implements IMyServer {  
    private static final long serialVersionUID = 1L;  
  
    public MyServer() throws RemoteException {  
        super();  
    }  
  
    @Override  
    public int add(int a, int b) throws RemoteException {  
        return a + b;  
    }  
  
    @Override  
    public int mul(int a, int b) throws RemoteException {  
        return a * b;  
    }  
}  