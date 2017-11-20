package entreprise;


    public class ProductionR extends Production implements Risque{
    
    public ProductionR(String matricule, String nom, String prenom, short age, String date_entree,int unite_produite) {
        super(matricule, nom, prenom, age, date_entree,unite_produite);
    }
          @Override      
            double calculerSalaire(){
            return super.calculerSalaire() + prime;
            
        }
    }
   
  

