package entreprise;
import java.util.Date;

public abstract class Employe {
     
    protected String matricule;
    protected String nom;
    protected String prenom;
    protected short age;
    protected String date_entree;

    public Employe(String matricule, String nom, String prenom, short age, String date_entree) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date_entree = date_entree;
    }
    
    abstract double calculerSalaire();

    public String getNom() {
        return "L 'Employe " + nom + " " + prenom;
    }
  
}
    

