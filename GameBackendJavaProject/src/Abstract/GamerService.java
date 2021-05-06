package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerService {

	void add(Gamer gamer) throws NumberFormatException, RemoteException;
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
