/**
 * 
 * @author ramse
 *
 */
public class main {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Utilisation de pays
		 */
		Pays unPays;
		Capitale uneCapitale;
		Ville uneVille;
		/**
		 * 
		 */
		System.out.println(Pays.getCompteurPays());
		uneCapitale = new Capitale("Paris", 2000000, 345254);
		uneVille = new Ville("Evry", 2000, 5165);
		Ville deuxVille = new Ville("Ris-Orangis", 6546, 9756);
		Ville troisVille = new Ville("Bondoufle", 64655, 55475);
		unPays = new Pays("France", "Français", "Euro", uneCapitale);
		unPays.ajoutVille(uneVille);
		unPays.ajoutVille(deuxVille);
		unPays.ajoutVille(troisVille);
		
		
		System.out.println(unPays.toString());
		
		unPays.supprimerVille("Bondoufle");
		System.out.println("------------------");
		
		System.out.println(unPays.toString());
	}

}