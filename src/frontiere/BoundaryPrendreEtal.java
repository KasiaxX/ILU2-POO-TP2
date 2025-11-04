package frontiere;

import controleur.ControlPrendreEtal;
import personnages.Gaulois;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private String produit =null;
	private int quantite = 0;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		
		if(!nomVendeurConnu) {
			System.out.println("Je suis désolée " + nomVendeur + "mais il faut être un habitant de notre village pour commencer ici.");
		}else {
			System.out.println("Bonjour " + nomVendeur + ", je vais regarder si je peux vous trouver un étal.");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			
			if(!etalDisponible) {
				System.out.println("Désolée " + nomVendeur + "je n'ai plus d'étal qui ne soit pas déja occupé.");
			}else {
				
				System.out.println("C'est parfait, il me reste un étal pour vous !");
				System.out.println("Il me faudrait quelques renseignements :");
				
				produit = Clavier.entrerChaine("Quel produit souhaites-vous vendre ?");
				quantite = Clavier.entrerEntier("Combien souhaitez-vous vendre ?");	
				
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, quantite);		
		
		if(numeroEtal != -1) {
			System.out.println("Le vendeur " + nomVendeur + " s'est installé à l'étal n°" + numeroEtal);
		}
	}
}
