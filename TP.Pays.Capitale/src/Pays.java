/**
 * 
 * @author ramse
 *
 */
public class Pays {
	//Attributs
	/**
	 * 
	 */
	private String nom;
	private String langue;
	private String monnaie;
	private static int compteurPays = 0;
	private int compteurVille;
	private Capitale saCapitale;
	private Ville lesVilles[];
	
	//Les constructeurs
	/**
	 * Constructeurs
	 */
	public Pays() {
		this.compteurVille = 0;
		lesVilles = new Ville[30];
	}
	/**
	 * 
	 * @param unNom
	 * @param uneLangue
	 * @param uneMonnaie
	 * @param uneCapitale
	 */
	public Pays(String unNom, String uneLangue, String uneMonnaie, Capitale saCapitale) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.saCapitale = saCapitale;
		lesVilles = new Ville[30];
		this.compteurVille = 0;
		compteurPays = compteurPays + 1;
	}
	/**
	 * 
	 * @param unNom
	 * @param uneLangue
	 * @param uneMonnaie
	 */
	public Pays(String unNom, String uneLangue, String uneMonnaie) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.compteurVille = 0;
		lesVilles = new Ville[30];
		compteurPays = compteurPays + 1;
	}
	/**
	 * 
	 * @param unNom
	 * @param uneLangue
	 */
	public Pays(String unNom, String uneLangue) {
		this.nom = unNom;
		this.langue = uneLangue;
		compteurPays = compteurPays + 1;
	}
	
	public static int getCompteurPays() {
		return compteurPays;
	}
	
	/**
	 * Méthodes
	 * @return
	 */
	public String getNom() {
		return this.nom.toUpperCase();
	}
	
	/**
	 * 
	 * @param unNom
	 */
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public Capitale getCapitale() {
		return this.saCapitale;
	}
	
	public void ajoutVille(Ville uneVille) {
		lesVilles[compteurVille] = uneVille;
		compteurVille = compteurVille + 1;
	}
	
	public boolean supprimerVille(String uneVille) {
		int i = getIndexVille(uneVille);
		if (i < compteurVille) {
			for (int j = i; j<compteurVille - 1; j++) {
				lesVilles[j] = lesVilles[j+1];
			}
			compteurVille--;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getIndexVille(String uneVille) {
		int i = 0;
		while (i < compteurVille && !this.lesVilles[i].getNom().equals(uneVille)) {
			i++;
		}
		if (i < compteurVille){
			return i;
		}
		else {
			return 404;
		}
		
	}
	
	/**
	 * toString
	 */
	public String toString() {
		String chaine;
		chaine = "Nom : " + this.nom + "\nLangue : " + this.langue + "\nMonnaire : "+ this.monnaie + "\nCapitale : " + this.saCapitale.toString() + "\nVilles : ";
		for(int i=0; i < compteurVille; i++ ) {
			chaine += "\n\nNom : " + this.lesVilles[i].getNom();
			chaine += "\n\nNb habitants : " + this.lesVilles[i].getnbHabitants();
			chaine += "\n\nSuperficie : " + this.lesVilles[i].getSuperficie();
		}
		return chaine;
	}
}