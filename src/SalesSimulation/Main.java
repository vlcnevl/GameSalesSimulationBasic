package SalesSimulation;

import java.util.Date;


import SalesSimulation.business.abstracts.CampaignService;
import SalesSimulation.business.abstracts.GameService;
import SalesSimulation.business.abstracts.UserService;
import SalesSimulation.business.concretes.CampaignManager;
import SalesSimulation.business.concretes.GameManager;
import SalesSimulation.business.concretes.SalesManager;
import SalesSimulation.business.concretes.UserManager;
import SalesSimulation.core.MernisAdapter;
import SalesSimulation.entities.concretes.Campaign;
import SalesSimulation.entities.concretes.Library;
import SalesSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		
		UserService userService = new UserManager(new MernisAdapter());
		User user = new User(1,"jesper","1","Velican","Evli","15604039660",1998);
		userService.add(user);
		
		GameService gameService= new GameManager();
		Library theWitcher = new Library(1,"The Witcher 3 ",150);
		Library forzaHorizon = new Library(2,"Forza Horizon 4",250);
		Library battlefield = new Library(3,"Battlefield 1",280);
		gameService.add(theWitcher);
		gameService.add(battlefield);
		gameService.add(forzaHorizon);

		CampaignService campaignService= new CampaignManager();
		Campaign christmasSale=new Campaign(1,"Christmas sale",10,new Date(2021,5,8));
		campaignService.add(christmasSale);
		
		SalesManager salesManager= new SalesManager(userService,campaignService);
		salesManager.sale(theWitcher, user, christmasSale);
		
		
		userService.getLibrary(user);
	}

}
