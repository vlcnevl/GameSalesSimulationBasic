package SalesSimulation.business.abstracts;

import SalesSimulation.entities.concretes.*;

public interface SalesService {
	void sale(Library game, User user);
	void sale(Library game, User user, Campaign campaign);
}
