package Models;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;

    private  void calculeAge() {
        age = Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    public Employe(String matricule, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        calculeAge();
    }

    public Employe() {
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
        calculeAge();
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public String toString() {
        return "Employe["+matricule+", "+nom+", "+prenom+", "+age+", "+dateNaissance+", "+dateEmbauche+"]";
    }

    public abstract int calculSalaire() throws Exception;
}
