package pt1_1.ex1;

public class Cotxe {
    private String model;
    private String matricula;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cotxe(String model, String matricula) {
        this.model = model;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "model='" + model + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
