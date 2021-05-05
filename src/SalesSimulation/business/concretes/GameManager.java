package SalesSimulation.business.concretes;

import java.util.List;

import SalesSimulation.business.abstracts.GameService;
import SalesSimulation.entities.concretes.Library;

public class GameManager implements GameService{
	public GameManager()
	{
		
	}

	@Override
	public void add(Library library) {
		System.out.println("Game added from library " + library.getGameName()); 
	}

	@Override
	public void delete(Library library) {
		System.out.println("Game deleted from library " + library.getGameName()); 
		
	}

	@Override
	public void update(Library library) {
		System.out.println("Game updated from library " + library.getGameName()); 
		
	}

	@Override
	public void addMultiple(List<Library>library) {
		for(Library libraries : library)
		{
			System.out.println("Game added from library " + libraries.getGameName()); 

		}
	}

}
