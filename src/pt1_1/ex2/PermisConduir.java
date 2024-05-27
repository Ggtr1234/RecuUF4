package pt1_1.ex2;

public class PermisConduir {
    private String nom;
    private String tipusPermis;
    private int punts;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipusPermis() {
        return tipusPermis;
    }

    public void setTipusPermis(String tipusPermis) {
        this.tipusPermis = tipusPermis;
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public PermisConduir(String nom, String tipusPermis, int punts) {
        this.nom = nom;
        this.tipusPermis = tipusPermis;
        this.punts = punts;
    }

    public void imprimirPermis(){
        System.out.println("Nom: " + nom + " TipusPermis: " + tipusPermis + " Punts: " + punts);
    }

    public void restarPunts(int resta){
        int result = getPunts() - resta;
        setPunts(result);
    }

    @Override
    public String toString() {
        return "PermisConduir{" +
                "nom='" + nom + '\'' +
                ", tipusPermis='" + tipusPermis + '\'' +
                ", punts=" + punts +
                '}';
    }
}
