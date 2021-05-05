package SalesSimulation.business.abstracts;

import SalesSimulation.entities.concretes.Campaign;

public interface CampaignService{
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	boolean checkCampaign(Campaign campaign);
}

