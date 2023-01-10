public abstract class Annonce {

	private String description;
	private String nom;
	private TypeAnnonce typeAnnonce;

	public String getDescription() {
		return description;
	}

	public String getNom() {
		return nom;
	}

	public TypeAnnonce getTypeAnnonce() {
		return typeAnnonce;
	}


	public Annonce(String description, String nom, TypeAnnonce typeAnnonce) {
		this.description = description;
		this.nom = nom;
		this.typeAnnonce = typeAnnonce;
	}
}