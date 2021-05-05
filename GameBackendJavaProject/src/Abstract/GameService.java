package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	void Add(Game game);
	void Sale(Game game, Gamer gamer);
	void CampaignSale(Game game, Gamer gamer,Campaign campaign);
	void Update(Game game);

}
