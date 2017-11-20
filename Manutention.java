package entreprise;


    
    public class Manutention extends Employe{
dfdfdf
    protected double nbreHeure;
    
    public Manutention(String matricule, String nom, String prenom, short age, String date_entree,double heur) {
        super(matricule, nom, prenom, age, date_entree);
        nbreHeure = heur;
    }

    @Override
    double calculerSalaire() {
        return nbreHeure*65;
    }
  public void setnbreHeure(double nbreHeure){
      this.nbreHeure=nbreHeure;
  }
}