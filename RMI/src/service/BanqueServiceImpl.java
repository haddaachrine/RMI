package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class BanqueServiceImpl extends UnicastRemoteObject implements IBanqueRemot {

	protected BanqueServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int som(int n1, int n2) throws RemoteException {
		
		return n1+n2;
	}

	@Override
	public Date getServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}
	

/*	@Override
	public double convertion(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return 11*mt;
	}

	@Override
	public Date getServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}
*/
}
