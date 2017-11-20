package entreprise;

import java.util.LinkedList;
import java.util.List;

    public class Personnel {
    List<Employe> employe;

    public Personnel() {
        employe = new LinkedList();
    }
    
    void AjouterEmploye(Employe E){
        if(!employe.contains(E)){
            this.employe.add(E);
        }else{
            System.out.println("Cet employe existe deja ");
        }
    }
    
    double salaireMoyen(){
        double result = 0;
        
        for(int i=0;i<employe.size();i++){
            result+=employe.get(i).calculerSalaire();
        }
        
        return result/employe.size();
    }
    
    void calculerSalaire(){
        int taille = employe.size()-1;
        int i=0;
        while(i<=taille){
            System.out.println(employe.get(i).getNom() + " a  pour salaire " + employe.get(i).calculerSalaire());
            i++;
        }
    }
    
}

