package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class GauloisTest {
	private Village villageK;
	private Gaulois gaulois;

	@BeforeEach
	public void beforeEach() {
		villageK = new Village("VillageK", 25, 5);
		gaulois = new Gaulois("LilPack", 5);
	}

	@Test
	void testToString() {
		assertEquals("Gaulois [nom=LilPack, force=5, effetPotion=1]", gaulois.toString());
	}

	@Test
	void testPrendreParole() {
		assertEquals("Le gaulois LilPack : ", gaulois.prendreParole());
	}

	@Test
	void testGaulois() {
		assertNotNull(gaulois);
	}
}
