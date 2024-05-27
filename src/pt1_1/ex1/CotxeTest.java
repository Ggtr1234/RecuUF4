package pt1_1.ex1;

public class CotxeTest {
    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe("BMW M3","7421CNR");
        Cotxe cotxe1 = new Cotxe("Audi R8","1234DHF");

        System.out.println("Matricula cotxe: " + cotxe.getMatricula() + " Model: " + cotxe.getModel());
        System.out.println("Matricula cotxe1: " + cotxe1.getMatricula() + " Model: " + cotxe1.getModel());

        System.out.println("Modificacion de cotxe1");

        cotxe1.setMatricula("PruebaDeModif");
        cotxe1.setModel("ModelMODIFICADO");

        System.out.println("Matricula cotxe1: " + cotxe1.getMatricula() + " Model: " + cotxe1.getModel());

    }
}
