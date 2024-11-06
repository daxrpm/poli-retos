import arrays.*;
import loading.*;
import figuras.*;
import series.*;
import serieCaracteres.*;
import recursion.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese su nivel/tamaño/número de serie: ");
        int nivel = sc.nextInt();
        SerieNumerica serieNumerica = new SerieNumerica(nivel);
        serieNumerica.g4_imprimeTodasSeries();
        Arrays arrays = new Arrays(nivel);
        arrays.g4_imprimirTodosArrays();
        Loading loading = new Loading();
        loading.g4_imprimirTodosLoading();
        Figuras figuras = new Figuras(nivel);
        figuras.g4_imprimirTodasFiguras();
        SerieCaracteres serieCaracteres= new SerieCaracteres(n);
        serieCaracteres.g4_imprimeTodasSeriesdeCaracteres();
        System.out.println("Ingrese el primer valor para las recursiones; se tomará este valor para factorial(a) y conteo progresivo:");
        int valor1 = scanner.nextInt();
        System.out.println("Ingrese el segundo valor para las recursiones; se tomará este valor para conteo regresivo:");
        int valor2 = scanner.nextInt();
        Recursion recursion = new Recursion(valor1, valor2);
        recursion.g4_imprimeTodasRecursiones();
        System.out.println();
scanner.close();
    }
}
