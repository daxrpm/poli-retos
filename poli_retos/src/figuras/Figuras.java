package figuras;

public class Figuras {

    public int LADO = 5;

    public Figuras(int LADO) {
        this.LADO = LADO;
    }

    public static void figura1(int lado) {
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

    public static void figura2(int lado) {
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

    public static void figura3(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void figura4(int lado) {
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

    public void g4_imprimirTodasFiguras() {
        figura1(LADO);
        figura2(LADO);
        figura3(LADO);
        figura4(LADO);
    }

}
