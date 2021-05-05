package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerCheckService {
	boolean CheckRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;

}
