package villagegaulois;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import villagegaulois.Village;
import villagegaulois.Village.Marche;


class VillageTest {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private Marche marche;
	private Village villageK;
	private Gaulois gaulois;
	private Druide druide;
	int indice;
	int etalLibre;
	

	@BeforeEach
	public void beforeEach() {
		villageK = new Village("VillageK", 25, 5);
		chef = new Chef("Korkal", 10, villageK);
		villageK.setChef(chef);	
		
		gaulois = new Gaulois("LilPack", 5); 
		villageK.ajouterHabitant(gaulois);
		
		druide = new Druide("Yellowstone", 5, 6, 8);
		villageK.ajouterHabitant(druide);
		
		indice = villageK.installerVendeur(gaulois, "fleur", 4);
	}

	@Test
	void testVillage() {
		assertNotNull(villageK);
	}

	@Test
	void testGetNom() {
		assertEquals("LilPack", gaulois.getNom());
	}

	//???
//	@Test
//	void testSetChef() {  
//		assertNotNull(villageK.setChef(chef));
//	}

	@Test
	void testTrouverHabitant() {
		assertNotNull(villageK.trouverHabitant(gaulois.getNom()));
	}

	@Test
	void testDonnerVillageois() {
		String[] donnes = villageK.donnerVillageois();
		assertNotNull(donnes);	
		assertEquals("Korkal", donnes[0]);
	}

	@Test
	void testDonnerNbEtal() {
		assertEquals(5, villageK.donnerNbEtal());
	}

	@Test
	void testInstallerVendeur() {
		assertNotNull(indice);
		assertEquals(0, indice);
	}

//	@Test
//	void testPartirVendeur() {
//		fail("Not yet implemented");
//	}

	@Test
	void testRechercherEtalVide() {
		assertTrue(villageK.rechercherEtalVide());
	}

//	@Test
//	void testRechercherVendeursProduit() {
//		Gaulois[] vendeurs = 
//	}

	@Test
	void testRechercherEtal() {
		fail("Not yet implemented");
	}

	@Test
	void testDonnerEtatMarche() {
		fail("Not yet implemented");
	}

}
