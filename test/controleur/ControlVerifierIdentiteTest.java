package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	private Village village;
	private Chef chef;
	private Gaulois gaulois;
	private ControlVerifierIdentite controlVerifierIdentite;

	@BeforeEach
	public void BeforeEach() {
		village = new Village("VillageK", 20, 5);
		chef = new Chef("Korkal", 10, village);
		village.setChef(chef);
		controlVerifierIdentite = new ControlVerifierIdentite(village);

	}

	@Test
	void testControlVerifierIdentite() {
		assertNotNull(controlVerifierIdentite, "Control ne renvoit pas NULL");
	}

	@Test
	void testVerifierIdentite() {
		//assertNotNull(controlVerifierIdentite.verifierIdentite(chef.getNom()));
		assertTrue(controlVerifierIdentite.verifierIdentite(chef.getNom()));
		
	}
}
