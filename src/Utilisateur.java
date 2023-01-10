import java.util.ArrayList;

public class Utilisateur implements Listener{

	private String nom;
	private String email;
	private String mdp;
	private ArrayList<Annonce> listeDemandes = new ArrayList<>();
	private ArrayList<Annonce> listePrestations = new ArrayList<>();

	public void addAnnonce(Annonce annonce){
		switch (annonce.getTypeAnnonce()){
			case demande -> listeDemandes.add(annonce);
			case proposition -> listePrestations.add(annonce);
		}
	}

	public String getNom() {
		return nom;
	}

	public String getEmail() {
		return email;
	}

	public String getMdp() {
		return mdp;
	}

	public ArrayList<Annonce> getListeDemandes() {
		return listeDemandes;
	}

	public ArrayList<Annonce> getListePrestations() {
		return listePrestations;
	}

	public Utilisateur(String nom, String email, String mdp) {
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
	}

	@Override
	public void onEvent(int Event) {

	}
}