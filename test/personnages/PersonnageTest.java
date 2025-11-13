package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonnageTest {
	Gaulois gaulois;
	String nom;
	int force;
	

	@BeforeEach
	public void beforeEach() {
		gaulois = new Gaulois("LilPack", 5);
		this.nom = gaulois.getNom();
		this.force = gaulois.getForce();
	}

	@Test
	void testPersonnage() {
		assertNotNull(nom);
		assertNotNull(force);
	}

	@Test
	void testGetForce() {
		assertEquals(5, gaulois.getForce());
	}

	@Test
	void testGetNom() {
		assertEquals("LilPack", gaulois.getNom());
	}

	@Test
	void testToString() {
		assertEquals("Gaulois [nom=LilPack, force=5, effetPotion=1]", gaulois.toString());
	}

	@Test
	void testPrendreParole() {
		assertEquals("LilPack : ", gaulois.getNom() + " : ");
	}

}
