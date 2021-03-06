package org.application.business.impl;

import java.util.List;

import org.application.business.contract.EmpruntManager;
import org.webservice.services.Emprunt;

public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {

	@Override
	public List<Emprunt> getEmprunts() {
		// TODO Auto-generated method stub
		return getDaoFactory().getEmpruntDao().getEmprunts();	
		}
	
	@Override
	public void prolongerEmprunt(int emprunt) {
		// TODO Auto-generated method stub
		 getDaoFactory().getEmpruntDao().prolongerEmprunt(emprunt);	
		}
	
	@Override
	public List<Emprunt>getEmpruntByUserId(int idUser) {
		// TODO Auto-generated method stub
		return getDaoFactory().getEmpruntDao().getEmpruntByUserId(idUser);	
		}

	@Override
	public List<Emprunt> getEmpruntsEnCours() {
		// TODO Auto-generated method stub
		return getDaoFactory().getEmpruntDao().getEmpruntsEnCours();
	}

}
