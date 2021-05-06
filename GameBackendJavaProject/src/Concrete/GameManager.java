package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " kullan�c�s� "+game.getName()+ " oyununu sat�n ald�.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " g�ncellendi");
		
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " eklendi.");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName()+ " kullan�c�s� "+game.getName()+" oyununu  %"+ campaign.getDiscount()+  " indirimli sat�n ald�.");
		
	}

}
