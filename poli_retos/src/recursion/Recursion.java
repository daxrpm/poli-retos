package recursion;

public class Recursion {
    private final int a;
    private final int b;

    public Recursion(int valor1, int valor2) {
        this.a = valor1;
        this.b = valor2;
    }

    public void g4_imprimeTodasRecursiones() {
        System.out.println("Factorial:");
        recursionfactorial();
        System.out.println("");
        System.out.println("Suma:");
        recursionsuma();
        System.out.println("Multiplicación:");
        recursionmultiplicacion();
        System.out.println("Potencia:");
        recursionpotencia();
        System.out.println("Conteo Progresivo:");
        recursionconteoprogresivo();
        System.out.println("Conteo Regresivo:");
        recursionconteoregresivo();
        System.out.println("");
    }

    public void recursionfactorial() {
        System.out.println("El factorial de " + a + " es: " + factorial(a));
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void recursionsuma() {
        System.out.println("La suma de " + a + " y " + b + " es: " + suma(a, b));
    }

    public int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return suma(a + 1, b - 1);
        }
    }

    public void recursionmultiplicacion() {
        System.out.println("La multiplicacion de " + a + " y " + b + " es: " + multiplicacion(a, b));
    }

    public int multiplicacion(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacion(a, b - 1);
        }
    }

    public void recursionpotencia() {
        System.out.println("La potencia de " + a + " y " + b + " es: " + potencia(a, b));
    }

    public int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * potencia(a, b - 1);
        }
    }

    public void recursionconteoprogresivo() {
        System.out.println("Conteo progresivo hasta " + a + ":");
        conteoProgresivoHasta(a);
        System.out.println("");
    }

    public void conteoProgresivoHasta(int n) {
        if (n <= 0) {
            return;
        } else {
            conteoProgresivoHasta(n - 1);
            System.out.print(n + " ");
        }
    }

    public void recursionconteoregresivo() {
        System.out.println("Conteo regresivo desde " + b + ":");
        conteoRegresivo(b);
        System.out.println("");
    }

    public void conteoRegresivo(int n) {
        if (n < 0) {
            return;
        } else {
            System.out.print(n + " ");
            conteoRegresivo(n - 1);
        }
    }
}
