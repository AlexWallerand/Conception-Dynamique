public class AnnonceFactory {

	public Annonce creerAnnonce(TypeAnnonce typeAnnonce, String typePrestation, String description, String nom) {
		Annonce annonce = null;
		switch (typePrestation) {
			case "service" -> annonce = new Service(description, nom, typeAnnonce);
			case "bien" -> annonce = new Bien(description, nom, typeAnnonce);
		}
		return annonce;
	}
}