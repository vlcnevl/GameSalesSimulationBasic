package SalesSimulation.core;

import java.rmi.RemoteException;

import SalesSimulation.business.abstracts.CheckUserService;
import SalesSimulation.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements CheckUserService {

	private boolean result;
	@Override
	public boolean checkUser(User user) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityNumber()), user.getFirstName(), user.getLastName(), user.getDateOfBirth());			
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
