package series;

public class SerieNumerica {

    private final int n;

    public SerieNumerica(int n) {
        this.n = n;
    }

    public void g4_imprimeTodasSeries() {

        System.out.println("Series:");
        secuencia1();
        System.out.println(" ");
        secuencia2();
        System.out.println(" ");
        secuencia3();
        System.out.println(" ");
        secuencia4();
        System.out.println(" ");
        secuencia5();
        System.out.println(" ");
        secuencia6();
        System.out.println(" ");
        secuencia7();
        System.out.println(" ");
        secuencia8();
        System.out.println(" ");
        secuencia9();
        System.out.println(" ");
        secuencia10();
        System.out.println(" ");
        secuencia11();
        System.out.println(" ");
    }

    public void secuencia1() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + ", ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public void secuencia2() {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(num + ", ");
                num += 2;
            } else {
                System.out.print("0, ");
            }
        }
    }

    public void secuencia3() {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num += i;
            System.out.print(num + ", ");
        }
    }

    public void secuencia4() {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + ", ");
            num += 2;
        }
    }

    public void secuencia5() {
        int num = 2;
        for (int i = 3; i <= n; i++) {
            System.out.print(num + ", ");
            num += 3;
        }
    }

    public void secuencia6() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + ", ");
        }
    }

    public void secuencia7() {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + ", ");
            num += 3;
        }
    }

    public void secuencia8() {
        int num = 3;
        for (int i = 3; i <= n; i++) {
            System.out.print(num + ", ");
            num += 5;
        }
    }

    public void secuencia9() {
        int num = 2;
        for (int i = 2; i <= n; i++) {
            System.out.print(num + ", ");
            num += num;
        }
    }

    public void secuencia10() {
        int num = 3;
        for (int i = 3; i <= n; i++) {
            System.out.print(num + ", ");
            num = num * 3;
        }
    }

    public void secuencia11() {
        for (int i = 1; i <= n; i++) {
            int num = i * (i + 1);
            System.out.print(num + ", ");
        }
    }
}
