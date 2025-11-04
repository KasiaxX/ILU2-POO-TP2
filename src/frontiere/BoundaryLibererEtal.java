package frontiere;

import controleur.ControlEmmenager;
import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		//TODO a completer
		boolean vendeurReconnu = controlLibererEtal.isVendeur(nomVendeur);
		
		if(!vendeurReconnu) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !");
		}else {
			String[] donnesEtal = controlLibererEtal.libererEtal(nomVendeur);
		}
	}

}
