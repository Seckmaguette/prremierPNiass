package Models;

import java.time.LocalDate;

public class Salaries extends Employe {
    private int salaireBrut;
    private int chargeSocial;
    private Boolean enPoste = true;

    public Salaries(String matricule, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, int salaireBrut, int chargeSocial) {
        super(matricule, nom, prenom, dateNaissance, dateEmbauche);
        this.salaireBrut = salaireBrut;
        this.chargeSocial = chargeSocial;
    }

    public int getSalaireBrut() {
        return salaireBrut;
    }
    public void setSalaireBrut(int salaireBrut) {
        this.salaireBrut = salaireBrut;
    }
    public int getChargeSocial() {
        return chargeSocial;
    }
    public void setChargeSocial(int chargeSocial) {
        this.chargeSocial = chargeSocial;
    }

    public Boolean getEnPoste() {
        return enPoste;
    }

    public void setEnPoste(Boolean enPoste) {
        this.enPoste = enPoste;
    }

    public int calculSalaire() throws Exception{
        if (enPoste) {
            return (salaireBrut - chargeSocial);
        }
        throw new Exception("cet employé n'est plus en poste");
    }

    @Override
    public String toString() {
        try {
            return "Salaries["+super.toString()+", "+salaireBrut+", "+chargeSocial+", "+enPoste+", "+calculSalaire()+"]";
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }
}
