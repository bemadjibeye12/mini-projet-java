package entreprise;


public class Vendeur extends Commercial{
	private final static double POURCENT= 0.2;
	private final static int BONUS= 100;
	public Vendeur(String matricule,String nom,String prenom,short age, String date_entree,
			double chiffreAffaire) {
		super(matricule,nom,prenom, age,date_entree,chiffreAffaire);
	}

	public double calculerSalaire() {
		return (POURCENT* this.getChiffreAffaire()) + BONUS;
	}

	public String getTitre()
		{
			return "Le vendeur ";
		}

}

    

