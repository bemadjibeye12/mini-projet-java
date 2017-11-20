package entreprise;


    public class Production extends Employe{
    protected int unite_produite;

    public Production(String m, String nom, String prenom, short age, String date_entree,int unite_produite) {
        super(m, nom, prenom, age, date_entree);
        this.unite_produite = unite_produite;
    }

    @Override
    double calculerSalaire() {
     return (double) unite_produite * 5;   
    }
     public void setunite_produite(int unite_produite){
         this.unite_produite=unite_produite;
     }

    
    }