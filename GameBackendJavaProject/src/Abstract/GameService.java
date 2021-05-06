package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	void add(Game game);
	void sale(Game game, Gamer gamer);
	void campaignSale(Game game, Gamer gamer,Campaign campaign);
	void update(Game game);

}
