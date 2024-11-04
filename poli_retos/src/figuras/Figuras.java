package figuras;

public class Figuras {

    public int LADO = 5;

    public Figuras(int LADO) {
        this.LADO = LADO;
    }

    public static void excerciceA01(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void excerciceA02(int lado) {
        String[] signos = { "*", "+" };
        int contador = 0;
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print(signos[contador] + " ");

                    if (contador == 0) {
                        contador = 1;
                    } else {
                        contador = 0;
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void excerciceA03(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void excerciceA04(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (j < lado - i - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }

    public void g4_drawFigures() {
        excerciceA01(LADO);
        excerciceA02(LADO);
        excerciceA03(LADO);
        excerciceA04(LADO);
    }

}
