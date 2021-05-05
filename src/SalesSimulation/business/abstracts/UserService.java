package SalesSimulation.business.abstracts;

import SalesSimulation.entities.concretes.*;


public interface UserService {
	void add(User user) throws Exception;
	void delete(User user);
	void update(User user);
	void getLibrary(User user);
	void addGames(User user, Library game);
}
