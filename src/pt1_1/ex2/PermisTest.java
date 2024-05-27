package pt1_1.ex2;

public class PermisTest {
    public static void main(String[] args) {
        PermisConduir permisConduir = new PermisConduir("German", "B",14);
        PermisConduir permisConduir1 = new PermisConduir("Josep","A2",10);
        permisConduir.imprimirPermis();
        permisConduir.setTipusPermis("C");
        permisConduir1.imprimirPermis();
        permisConduir1.restarPunts(10);
        permisConduir.imprimirPermis();
        permisConduir1.imprimirPermis();


    }
}
