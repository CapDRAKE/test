
public class Capitale {
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	public Capitale() {
		
	}
	public Capitale(String unNom) {
		this.nom = unNom;
	}
	public Capitale(String unNom, int unNbHabitants, int uneSuperficie) {
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
	}
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public int getnbHabitants() {
		return this.nbHabitants;
	}
	public void setnbHabitants(int unNbHabitants) {
		this.nbHabitants = unNbHabitants;
	}
	
	public int getSuperficie() {
		return this.superficie;
	}
	public void setSuperficie(int uneSuperficie) {
		this.superficie = uneSuperficie;
	}
	
	public String toString() {
		String chaîne;
		chaîne = "Nom: " + getNom() + "\nNb habitants : " + getnbHabitants() + "\nSuperficie : " + getSuperficie();
		return chaîne;
	}
}
