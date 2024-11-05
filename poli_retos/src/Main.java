import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        while (true) { 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño para las Figuras y Series Numéricas");
        int n = scanner.nextInt() ; 
        
        Figura figura = new Figura(n);
        figura.g4_imprimeTodasFiguras();

        SerieNumerica serieNumerica= new SerieNumerica(n);
        serieNumerica.g4_imprimeTodasSeries();
        System.out.println(" ");
        }
    
    }

}