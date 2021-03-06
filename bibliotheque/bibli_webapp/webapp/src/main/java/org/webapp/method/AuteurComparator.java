package org.webapp.method;

import java.util.Comparator;

import org.webservice.services.Livre;

public class AuteurComparator implements Comparator<Livre> {

public int compare(Livre p1, Livre p2) {
		
		int auteur1 = p1.getIdAuteur();
		int auteur2 = p2.getIdAuteur();
		
		return Integer.compare(auteur1, auteur2);
	}
}