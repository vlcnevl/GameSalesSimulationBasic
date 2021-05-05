package SalesSimulation.business.concretes;

import java.util.ArrayList;
import java.util.List;
import SalesSimulation.business.abstracts.*;
import SalesSimulation.entities.concretes.*;


public class UserManager implements UserService{

	private CheckUserService _userCheckService;
	private List<Library> _games;
	
	public UserManager(CheckUserService userCheckService)
	{
		this._userCheckService = userCheckService;
		this._games = new ArrayList<Library>();
	}
	
	@Override
	public void add(User user) throws Exception {
		if (_userCheckService.checkUser(user)) {
			System.out.println(user.getUserName()+" Added user");
		} else {
			throw new Exception("Not a valid person");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName()+" Deleted user");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName()+" Updated user");

		
	}

	@Override
	public void getLibrary(User user) {
		System.out.println(user.getUserName()+"'s Games ");
		for(Library game:_games) {
			System.out.println(" * "+game.getGameName());
		}
		
	}

	@Override
	public void addGames(User user, Library game) {
		this._games.add(game);
		System.out.println(user.getUserName()+" Added your library "+
		game.getGameName());
		
	}
	
	

	
}
