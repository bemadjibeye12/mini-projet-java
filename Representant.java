package entreprise;


class Representant extends Commercial {
    private final static double POURCENT= 0.2;
	private final static int BONUS= 800;
	public Representant(String matricule,String nom, String prenom, short age, String date_entree, double chiffreAffaire) {
		super(matricule, nom,prenom, age, date_entree, chiffreAffaire);
	}

	public double calculerSalaire() {
		return (POURCENT* getChiffreAffaire()) + BONUS;
	}

	public String getTitre()
		{
			return "Le representant ";
		}
}
