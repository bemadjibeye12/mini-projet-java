package entreprise;

public class GestionEmploi {
    
   public static void main(String[] args) {
		Personnel p = new Personnel();
		p.AjouterEmploye(new Vendeur("16B104fs","Bemadjibeye","Simeon",(short)45,"22/02/2000",25000));
		p.AjouterEmploye(new Representant("11B106fs","Nembadem","Orpha",(short)42,"16/03/2006",2900));
		p.AjouterEmploye(new Production("17B023fs","Kagmbo","Rubain",(short) 24,"11/01/2014",2500));
		p.AjouterEmploye(new Manutention("15A185fs","Allahasra","Israel",(short)23,"12/12/2007",2800));
		p.AjouterEmploye(new ProductionR("16A100fs","Nekarnodji","Thamar",(short)20,"05/09/2008",1200));
		p.AjouterEmploye(new ManutentionR("14B210fs","Nepitimbaye","Gracia",(short)18,"15/10/2008",850));

		p.calculerSalaire();
		System.out.println("Le salaire moyen dans l'entreprise est de "
				+ p.salaireMoyen() + " francs.");

	}

}
