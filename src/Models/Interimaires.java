package Models;

import java.time.LocalDate;

public class Interimaires extends Employe {
    private static int tauxHoraire;
    private int nbrHeure;
    private static int tauxHoraireSup;
    private int nbrHeureSup;

    public Interimaires(String matricule, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, int nbrHeure, int nbrHeureSup) {
        super(matricule, nom, prenom, dateNaissance, dateEmbauche);
        this.nbrHeure = nbrHeure;
        this.nbrHeureSup = nbrHeureSup;
    }

    public static int getTauxHoraire() {
        return tauxHoraire;
    }
    public static void setTauxHoraire(int tauxHoraire) {
        Interimaires.tauxHoraire = tauxHoraire ;
    }
    public int getNbrHeure() {
        return nbrHeure;
    }
    public void setNbrHeure(int nbrHeure) {
        this.nbrHeure = nbrHeure;
    }
    public static int getTauxHoraireSup() {
        return tauxHoraireSup;
    }
    public static void setTauxHoraireSup(int tauxHoraireSup) {
        Interimaires.tauxHoraireSup = tauxHoraireSup;
    }
    public int getNbrHeureSup() {
        return nbrHeureSup;
    }
    public void setNbrHeureSup(int nbrHeureSup) {
        this.nbrHeureSup = nbrHeureSup;
    }

    public int calculSalaire(){
        return (tauxHoraire * nbrHeure) + (tauxHoraireSup * nbrHeureSup);
    }

    @Override
    public String toString() {
        return "Interimaire["+super.toString()+", "+nbrHeureSup+", "+nbrHeure+"]";
    }
}
