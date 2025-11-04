package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class DruideTest {
	private Village villageK;
	private Druide druide;
	
	@BeforeEach
	public void beforeEach() {
		villageK = new Village("VillageK", 25, 5);
		druide = new Druide("LilPinkWeasel", 4, 5, 7);
	}

	@Test
	void testPrendreParole() {
		assertEquals("Le druide LilPinkWeasel : ", druide.prendreParole());
	}

	@Test
	void testDruide() {
		assertNotNull(druide);
	}

	@Test
	void testPreparerPotion() {
		fail("Not yet implemented");
	}

	@Test
	void testBooster() {
		fail("Not yet implemented");
	}

}
