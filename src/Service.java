import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Service extends Annonce {

	private Map<LocalDate, LocalDate> disponibilite = new HashMap<>();

	public Map<LocalDate, LocalDate> getDisponibilite() {
		return disponibilite;
	}

	public void addDisponibilite(LocalDate dateDebut, LocalDate dateFin){
		disponibilite.put(dateDebut,dateFin);
	}

	public void setDisponibilite(Map<LocalDate, LocalDate> disponibilite) {
		this.disponibilite = disponibilite;
	}

	public Service(String description, String nom, TypeAnnonce type) {
		super(description, nom, type);
		LocalDate dateDebut = java.time.LocalDate.now();
		LocalDate dateFin = dateDebut.plus(7, ChronoUnit.DAYS);
		addDisponibilite(dateDebut,dateFin);
	}
}