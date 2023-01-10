import java.util.ArrayList;
import java.util.EventObject;

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

	public ArrayList<Annonce> getAnnonces(){
		ArrayList<Annonce> listeAnnonces = listeDemandes;
		listeAnnonces.addAll(listePrestations);
		return listeAnnonces;
	}

	public void afficherAnnonces(){
		ArrayList<Annonce> listeAnnonces = getAnnonces();
		for (Annonce annonce : listeAnnonces) {
			System.out.println(annonce);
		}
	}

	public Utilisateur(String nom, String email, String mdp) {
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
	}


	@Override
	public void onEvent(EventObject event) {

	}
}