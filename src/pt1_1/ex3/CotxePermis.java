package pt1_1.ex3;

import jdk.jfr.internal.tool.Main;
import pt1_1.ex1.Cotxe;
import pt1_1.ex2.PermisConduir;

import java.util.Scanner;

public class CotxePermis {
    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe("BMW M4","1234ASF");
        PermisConduir permisConduir = new PermisConduir("German","B",14);
        CotxePermis main = new CotxePermis();
        Scanner sc = new Scanner(System.in);
        main.menu();
        int opcio = sc.nextInt();
        while (opcio!=0){

            switch (opcio){
                case 0:
                    System.out.println("Sortint");
                    break;
                case 1:
                    try{
                        System.out.println("Model actual\n " + cotxe);
                        System.out.println("Introdueix model de cotxe nou");
                        sc.nextLine();
                        String modelNou = sc.nextLine();
                        cotxe.setModel(modelNou);
                        System.out.println("Introdueix matricula");
                        String matricula = sc.nextLine();
                        cotxe.setMatricula(matricula);
                        System.out.println("Model modificat\n" + cotxe);
                        break;
                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                        break;
                    }
                case 2:
                    try{
                        System.out.println("Permis Actual: " + permisConduir);
                        System.out.println("Introdueix nou nom:");
                        sc.nextLine();
                        String nom = sc.nextLine();
                        permisConduir.setNom(nom);
                        System.out.println("Introdueix nou Tipus de permis: ");
                        String tipus = sc.nextLine();
                        permisConduir.setTipusPermis(tipus);
                        System.out.println("Introdueix nous punts");
                        int punts = sc.nextInt();
                        permisConduir.setPunts(punts);
                        System.out.println("Permis modificat: " + permisConduir);
                        break;
                    }catch (Exception e){
                        System.out.println("Error: " + e.getMessage());
                        break;
                    }
                case 3:
                    System.out.println("Cotxe: " + cotxe + "\nPermis: " + permisConduir);
            }
            main.menu();
            opcio = sc.nextInt();
        }
    }

    public void menu(){
        System.out.println("-------Menu-------" +
                "\n1) modificar info cotxe" +
                "\n2) modificar info permis" +
                "\n3) mostrar info" +
                "\n0) sortir programa");
    }

}
