package entreprise;


    public class ManutentionR extends Manutention implements Risque{
    
    public ManutentionR(String matricule, String nom, String prenom, short age, String date_entree,double heur) {
        super(matricule, nom, prenom, age, date_entree,heur);
    }

    @Override
    double calculerSalaire() {
        return super.calculerSalaire() + prime; //To change body of generated methods, choose Tools | Templates.
    }
    
    
   }
   

