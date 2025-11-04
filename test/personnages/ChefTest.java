package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ChefTest {
	private Village villageK;
	private Chef chefKorkal;
	
	@BeforeEach
	public void beforeEach() {
		villageK = new Village("VillageK", 25, 5);
		chefKorkal = new Chef("Korkal", 10, villageK);
		villageK.setChef(chefKorkal);
	}


	@Test
	void testPrendreParole() {
		assertEquals("Le chef Korkal du village VillageK : ", chefKorkal.prendreParole());
	}

	@Test
	void testChef() {
		assertNotNull(chefKorkal);
		
	}

}
