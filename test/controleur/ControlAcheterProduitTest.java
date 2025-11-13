package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAcheterProduitTest {
	private Village villageK;
	private Chef chefKorkal;
	private ControlAcheterProduit controlAcheterProduit;
	private ControlVerifierIdentite controlVerifierIdentite;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	@BeforeEach
	public void BeforeEach() {
		villageK = new Village("VillageK", 25, 5);
		chefKorkal = new Chef("Korkal", 10, villageK);
		villageK.setChef(chefKorkal);
		
		controlVerifierIdentite = new ControlVerifierIdentite(villageK);
		controlTrouverEtalVendeur  = new ControlTrouverEtalVendeur(villageK);
		controlAcheterProduit = new ControlAcheterProduit(controlVerifierIdentite, controlTrouverEtalVendeur, villageK);
	}

	@Test
	void testControlAcheterProduit() {
		fail("Not yet implemented");
	}

	@Test
	void testAcheterProduit() {
		fail("Not yet implemented");
	}

	@Test
	void testIsHabitant() {
		fail("Not yet implemented");
	}

	@Test
	void testRechercherEtalsProduit() {
		fail("Not yet implemented");
	}

}
