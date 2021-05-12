package service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {
	public static void main(String[] arge) throws MalformedURLException{
		try {
			LocateRegistry.createRegistry(1424);
			BanqueServiceImpl od = new BanqueServiceImpl();
			// affichier la refirance
			System.out.println(od.toString());
			//publier la refirance on utilise la method naiming
			Naming.rebind("rmi://localhost:1423/BK", od);
		
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}


