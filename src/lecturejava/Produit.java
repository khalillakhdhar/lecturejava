package lecturejava;

public class Produit {
	private String titre,description;
	private double prix;
	private int quantite;
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit(String titre, String description, double prix, int quantite) {
		super();
		this.titre = titre;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Produit [titre=" + titre + ", description=" + description + ", prix=" + prix + ", quantite=" + quantite
				+ "]";
	}
	
	
	
	
	

}
