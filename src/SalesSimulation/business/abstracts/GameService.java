package SalesSimulation.business.abstracts;

import java.util.List;

import SalesSimulation.entities.concretes.Library;

public interface GameService {
	void add(Library library);
	void delete(Library library);
	void update(Library library);
	void addMultiple(List<Library> library);
}
