import arrays.*;
import loading.*;
import figuras.*;
import series.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nivel/tamaño: ");
        int nivel = sc.nextInt();
        SerieNumerica serieNumerica = new SerieNumerica(nivel);
        serieNumerica.g4_imprimeTodasSeries();
        Arrays arrays = new Arrays(nivel);
        arrays.g4_imprimirTodosArrays();
        Loading loading = new Loading();
        loading.g4_imprimirTodosLoading();
        Figuras figuras = new Figuras(nivel);
        figuras.g4_imprimirTodasFiguras();

    }
}
