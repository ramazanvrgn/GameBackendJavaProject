import java.rmi.RemoteException;

import Abstract.GameService;
import Abstract.GamerService;
import Adepters.MernisAdapter;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Gamer gamer1=new Gamer(1,"Aslan","kahraman",1997,"1111111111");
		Game game1 = new Game(1,"MyGame","Strateji",150);
		Campaign campaign1 = new Campaign(1,"ilk çýkýþ",20);
		
		GamerService gamerManager= new GamerManager(new MernisAdapter());
		//gamerManager.Add(gamer1);
		
		GameService gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.sale(game1, gamer1);
		gameManager.campaignSale(game1, gamer1, campaign1);
		
		
		

	}

}
