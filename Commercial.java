package entreprise;

abstract class Commercial extends Employe {
	private double chiffreAffaire;

	public Commercial(String matricule,String nom,String prenom, short age, String date_entree,
			   double chiffreAffaire) {
		super(matricule,nom,prenom,age, date_entree);
		this.chiffreAffaire = chiffreAffaire;
	}

	public double getChiffreAffaire()
		{
			return chiffreAffaire;
		}
    
        
}
