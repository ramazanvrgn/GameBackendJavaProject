package Adepters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements GamerCheckService
{


	@Override
	public boolean CheckRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()),gamer.getFirstName().toUpperCase() , 
				gamer.getLastName().toUpperCase(), gamer.getDateOfBirthYear());
		return result;
	}

}
