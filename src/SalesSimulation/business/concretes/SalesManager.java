package SalesSimulation.business.concretes;

import SalesSimulation.business.abstracts.CampaignService;
import SalesSimulation.business.abstracts.SalesService;
import SalesSimulation.business.abstracts.UserService;
import SalesSimulation.entities.concretes.Campaign;
import SalesSimulation.entities.concretes.Library;
import SalesSimulation.entities.concretes.User;

public class SalesManager implements SalesService {
	
	private UserService _userService;
	private CampaignService _campaignService;
	public SalesManager(UserService userService,CampaignService campaignService)
	{
		_userService = userService;
		_campaignService = campaignService;
	}
	public SalesManager(UserService userService)
	{
		_userService = userService;
	}
	
	
	@Override
	public void sale(Library game, User user) {
		
		_userService.addGames(user,game);
	}

	@Override
	public void sale(Library game, User user, Campaign campaign) {
	
		if(_campaignService.checkCampaign(campaign))
		{
			game.setPrice(game.getPrice()- (game.getPrice()* campaign.getDiscountPercent()));
			_userService.addGames(user, game);

		}
		else
		{
			System.out.println("Campaign expired");
		}
	}

}
