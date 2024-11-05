public class Figura {
    private final int t; 

    public Figura(int n) {
        this.t = n;
    }


    public  void g4_imprimeTodasFiguras(){
        System.out.println("Figuras:");
        figura10();
        System.out.println("");
        figura11();
        System.out.println("");
        figura12();
        System.out.println("");
        figura13();
        System.out.println("");
        figura14();
        System.out.println("");
        figura15();
        System.out.println("");
        figura16();
        System.out.println("");
        figura17();
        System.out.println("");
        figura18();
        System.out.println("");
    }
    
    public  void figura10(){
        int espacios=0;
        for (int c=1; c<=t; c++){
            for (int f=0; f<espacios; f++){
                System.out.print(" ");
            }
            if (espacios>0){
                System.out.print("| ");
            }
            if (c%2==0){
                System.out.println("_-_");
            } else {
                System.out.println("_+_");
            }
            espacios+=6;
        }
    }

    public  void figura11() {
        int espacios = 0;
        for (int f = 1; f <= t; f++) {
            for (int c = 0; c < espacios; c++) {
                System.out.print(" ");
            }
            System.out.print(" | ");
            for (int s = 0; s < f; s++) {
                System.out.print("_ ");
            }
            System.out.println();
            espacios += 4;
        }
    }

    public  void figura12() {
        for (int i = t; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public  void figura13() {
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public  void figura14() {
        for (int line = 0; line < t; line++) {
            for (int i = 0; i < t - line; i++) {
                System.out.print("   ");
            }
            int value = 1;
            for (int i = 0; i <= line; i++) {
                System.out.print("   " + value + " ");
                value = value * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }

    public  void figura15() {
        for (int line = 0; line < t; line++) {
            int value = 1;
            for (int i = 0; i <= line; i++) {
                System.out.print(value + " ");
                value = value * (line - i) / (i + 1);
            }
            System.out.println();
        }
    }

    public  void figura16() {
        int espaciosExteriores = 0; 
        int espaciosInteriores = (t - 1) * 6; 
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < espaciosExteriores; j++) {
                System.out.print(" ");
            }
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
            if (i < t - 1) {
                for (int j = 0; j < espaciosInteriores; j++) {
                    System.out.print(" ");
                }
                if (i % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println(); 
            espaciosExteriores += 3;
            espaciosInteriores -= 6;
        }
        espaciosExteriores -= 3;
        espaciosInteriores += 6;
        for (int i = t - 2; i >= 0; i--) {
            espaciosExteriores -= 3;
            espaciosInteriores += 6;
            for (int j = 0; j < espaciosExteriores; j++) {
                System.out.print(" ");
            }
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
            if (i > 0) {
                for (int j = 0; j < espaciosInteriores; j++) {
                    System.out.print(" ");
                }
                if (i % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public  void figura17() {
        int espaciosExteriores = 0; 
        int espaciosInteriores = (t - 1) * 6; 
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < espaciosExteriores; j++) {
                System.out.print(" ");
            }
            if (i % 2 == 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            if (i < t - 1) {
                for (int j = 0; j < espaciosInteriores; j++) {
                    System.out.print(" ");
                }
                if (i % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println(); 
            espaciosExteriores += 3;
            espaciosInteriores -= 6;
        }
        espaciosExteriores -= 3;
        espaciosInteriores += 6;
        for (int i = t - 2; i >= 0; i--) {
            espaciosExteriores -= 3;
            espaciosInteriores += 6;
            for (int j = 0; j < espaciosExteriores; j++) {
                System.out.print(" ");
            }
            if (i % 2 == 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            if (i > 0) {
                for (int j = 0; j < espaciosInteriores; j++) {
                    System.out.print(" ");
                }
                if (i % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public  void figura18() {
        int[][] triangulo = new int[t][t];
        triangulo[0][0] = 2;
        for (int i = 1; i < t; i++) {
            triangulo[i][0] = 1; 
            triangulo[i][i] = 2; 
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}