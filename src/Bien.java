public class Bien extends Annonce {

	private Boolean disponobilite;

	public Bien(String description, String nom, TypeAnnonce type) {
		super(description, nom, type);
		disponobilite = Boolean.TRUE;
	}
}