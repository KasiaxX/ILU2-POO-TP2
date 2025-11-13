package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village villageK;
	private Chef chefKorkal;
	private ControlEmmenager controlEmmenager;
	
	@BeforeEach
	public void BeforeEach() {
		villageK = new Village("VillageK", 25, 5);
		chefKorkal = new Chef("Korkal", 10, villageK);
		villageK.setChef(chefKorkal);
		controlEmmenager = new ControlEmmenager(villageK);		
	}
	

	@Test
	void testControlEmmenager() {
		assertNotNull(controlEmmenager, "Control ne renvoit pas NULL");
	}

	@Test
	void testIsHabitant() {
		assertTrue(controlEmmenager.isHabitant("Korkal"));
		
		controlEmmenager.ajouterGaulois("LilPack", 5);
		assertTrue(controlEmmenager.isHabitant("LilPack"));
		
		assertFalse(controlEmmenager.isHabitant("PinkWeasel"));
	}

	@Test
	void testAjouterDruide() {
		controlEmmenager.ajouterDruide("PinkWeasel", 4, 5, 7);
		assertTrue(controlEmmenager.isHabitant("PinkWeasel"));
	}

	@Test
	void testAjouterGaulois() {
		controlEmmenager.ajouterGaulois("LilPack", 5);
		assertTrue(controlEmmenager.isHabitant("LilPack"));
	}

}
