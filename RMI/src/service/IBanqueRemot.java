package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IBanqueRemot extends Remote {
	public int som (int n1 ,int n2 ) throws RemoteException;
	public Date getServerDate()throws RemoteException;

}
