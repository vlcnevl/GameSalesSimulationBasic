package SalesSimulation.business.concretes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import SalesSimulation.business.abstracts.CampaignService;
import SalesSimulation.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	
	public CampaignManager()
	{
		
	}
	@Override
	public void add(Campaign campaign) {
		System.out.println("Added Campaign " + campaign.getDescription());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated Campaign " + campaign.getDescription());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted Campaign " + campaign.getDescription());
		
	}

	@Override
	public boolean checkCampaign(Campaign campaign) {
		LocalDateTime localDateTime= LocalDateTime.now();
		return campaign.getFinishDate().after(Date.from( localDateTime.atZone
				( ZoneId.systemDefault()).toInstant()));
	}

	
}
