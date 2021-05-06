package Concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) throws NumberFormatException, RemoteException {
		if (gamerCheckService.CheckRealPerson(gamer)) {
			System.out.println("Kullan�c� eklendi : "+ gamer.getFirstName() + " " + gamer.getLastName());
		}
		
		else {
			throw new Error("Kullan�c� eklenemedi");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi : "+ gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi : "+ gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
