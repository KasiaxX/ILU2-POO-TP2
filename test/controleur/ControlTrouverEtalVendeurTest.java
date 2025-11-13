package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {
	private Village village;
	private Chef chef;
	private Gaulois gaulois;
	private Etal etal;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	@BeforeEach
	public void BeforeEach() {
		village = new Village("VillageK", 25, 5);
		chef = new Chef("Korkal", 10, village);
		village.setChef(chef);
		
		gaulois = new Gaulois("Pink", 6);
		village.ajouterHabitant(gaulois);
		
		
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
	}

	@Test
	void testControlTrouverEtalVendeur() {
		assertNotNull(village);
	}

	//???
	@Test
	void testTrouverEtalVendeur() {
		assertNull(controlTrouverEtalVendeur.trouverEtalVendeur(gaulois.getNom())); 	
	}

}
