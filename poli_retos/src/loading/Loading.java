package loading;

public class Loading {
    private void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("El hilo fue interrumpido");
        }
    }

    private void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private void loading1() {
        String[] simbolos = { "/", "-", "\\", "|" };
        String[] loader = new String[4];
        loader[0] = " ";
        loader[2] = " ";
        int contador = 0, contador2 = 0;
        while (contador <= 100) {
            loader[1] = simbolos[contador2];
            loader[3] = Integer.toString(contador) + "%";
            contador++;
            if (contador2 == 3) {
                contador2 = 0;
            } else {
                contador2++;
            }
            for (int i = 0; i < 4; i++) {
                System.out.print(loader[i]);
            }
            delay(100);
            clearConsole();
        }
    }

    private void loading2() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un caracter para la barra de carga: ");
        char cargaChar = scanner.next().charAt(0);
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            int numChars = (contador * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < numChars; i++) {
                barra.append(cargaChar);
            }
            for (int i = numChars; i < longitudBarra; i++) {
                barra.append(" ");
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
        scanner.close();
    }

    private void loading3() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un caracter para desplazar: ");
        char cargaChar = scanner.next().charAt(0);
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i == contador % longitudBarra) {
                    barra.append(cargaChar);
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
        scanner.close();
    }

    private void loading4() {
        String[] signos = { "o0o", "0o0" };
        int contador = 0;
        int signoIndex = 0;

        while (contador <= 100) {
            System.out.print(signos[signoIndex] + " " + contador + "%");
            delay(100);
            clearConsole();
            contador++;
            signoIndex = (signoIndex + 1) % signos.length;
        }
    }

    private void loading5() {
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            int numChars = (contador * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < numChars; i++) {
                barra.append("=");
            }
            if (numChars < longitudBarra) {
                barra.append(">");
                for (int i = numChars + 1; i < longitudBarra; i++) {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
    }

    private void loading6() {
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i == contador % longitudBarra) {
                    barra.append("<=>");
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
    }

    private void loading7() {
        String[] signos = { "\\", "|", "/", "-" };
        int longitudBarra = 20;
        int contador = 0;
        int signoIndex = 0;

        while (contador <= 100) {
            int numChars = (contador * longitudBarra) / 100;
            StringBuilder barra = new StringBuilder("[");
            for (int i = 0; i < numChars; i++) {
                barra.append("=");
            }
            if (numChars < longitudBarra) {
                barra.append(signos[signoIndex]);
                for (int i = numChars + 1; i < longitudBarra; i++) {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
            signoIndex = (signoIndex + 1) % signos.length;
        }
    }

    private void loading8() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre y apellidos: ");
        String nombreCompleto = scanner.nextLine();
        int longitudBarra = 20;
        int contador = 0;

        while (contador <= 100) {
            int numChars = (contador * nombreCompleto.length()) / 100;
            StringBuilder barra = new StringBuilder("[");
            barra.append(nombreCompleto.substring(0, numChars));
            for (int i = numChars; i < longitudBarra; i++) {
                barra.append(" ");
            }
            barra.append("] ").append(contador).append("%");
            System.out.print(barra.toString());
            delay(100);
            clearConsole();
            contador++;
        }
        scanner.close();
    }

    public void g4_imprimirTodosLoading() {
        loading1();
        loading2();
        loading3();
        loading4();
        loading5();
        loading6();
        loading7();
        loading8();

    }
}
// loading nueve 
package loadings;
import java.util.Scanner;

public class g4_loadingNueve {
    private String nombreCompleto;
    public g4_loadingNueve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        this.nombreCompleto = scanner.nextLine();
        scanner.close();

        try {
            mostrarCarga();
        } catch (InterruptedException e) {
            System.err.println("La animación fue interrumpida.");
        }
    }

    private void mostrarCarga() throws InterruptedException {
        System.out.println(); 

        int longitud = nombreCompleto.length();
        
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(nombreCompleto.charAt(i));
            int porcentaje = (i + 1) * 100 / longitud;
            System.out.print(" " + porcentaje + "%");
            System.out.println(); 
            Thread.sleep(1000); 
        }
    }
}
// loading diez
package loadings;
import java.util.Scanner;

public class g4_loadingDiez {
    
    public g4_loadingDiez() {
        double tamañoArchivo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del archivo en kB: ");
        tamañoArchivo = scanner.nextDouble();
        scanner.close();

        if (tamañoArchivo < 10 || tamañoArchivo > 100) {
            System.out.print("Ingrese un tamaño entre 10 y 100 kB");
            return;
        }
        System.out.printf("Downloading ArchivoYarl-win_amd64.whl (%.1f kB)%n", tamañoArchivo);
        mostrarBarraDeProgreso(tamañoArchivo);
    }

    private void mostrarBarraDeProgreso(double tamañoArchivo) {
        double descarga = 0.0;
        int barraLongitud = 30;
        int velocidadDescarga = 2;
        
        while (descarga < tamañoArchivo) {
            descarga = Math.min(descarga + velocidadDescarga, tamañoArchivo);
            double porcentaje = descarga / tamañoArchivo;
            int bloquesLlenos = (int) (porcentaje * barraLongitud);

            System.out.print("\r"); 
            System.out.print("_".repeat(bloquesLlenos)); 
            System.out.print(" ".repeat(barraLongitud - bloquesLlenos)); 

            System.out.printf(" %.1f / %.1f kB", descarga, tamañoArchivo);

            try {
                Thread.sleep(200); // Pausa de 200 ms
            } catch (InterruptedException e) {
                System.err.println("Error en la animación de la descarga");
            }
        }
        System.out.println("\nDescarga completa");
    }

    public static void main(String[] args) {
        new g4_loadingDiez(); 
    }
}
// loading once 
package loadings;

import java.util.Random;
import java.util.Scanner;

public class g4_loadingOnce {

    public g4_loadingOnce() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de niveles para las señales: ");
        int niveles = scanner.nextInt();
        scanner.close();

        generarSenalesSimetricas(niveles);
    }

    private void generarSenalesSimetricas(int niveles) {
        Random random = new Random();
        String ANSI_RESET = "\033[0m";
        String ANSI_COLOR = "\033[34m"; 

        int maxLength = 10; 

        int totalWidth = maxLength * 2 + 1; 

        for (int nivel = 0; nivel < niveles; nivel++) {
            int longitudSenal = random.nextInt(maxLength) + 1; 
            String senal = ANSI_COLOR + "-".repeat(longitudSenal) + "|" + "-".repeat(longitudSenal) + ANSI_RESET;
            int espaciosPorDelante = (totalWidth - (longitudSenal * 2 + 1)) / 2; 
            System.out.println(" ".repeat(espaciosPorDelante) + senal);
            ANSI_COLOR = (nivel % 2 == 0) ? "\033[32m" : "\033[34m";
        }
    }

    public static void main(String[] args) {
        new g4_loadingOnce(); 
    }
}
//loagind doce 
package loadings;

import java.util.Random;
import java.util.Scanner;

public class g4_loadingDoce {

    public g4_loadingDoce() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de barras de sonido: ");
        int numBarras = scanner.nextInt();
        scanner.close();

        mostrarBarrasDeSonido(numBarras);
    }

    private void mostrarBarrasDeSonido(int numBarras) {
        Random random = new Random();
        int maxAltura = 8;
        int[] alturas = new int[numBarras];

        for (int i = 0; i < numBarras; i++) {
            if (i == 0) {
                alturas[i] = random.nextInt(maxAltura) + 1;
            } else {
                alturas[i] = random.nextInt(maxAltura + 1);
            }
        }

        for (int fila = maxAltura; fila >= 0; fila--) {
            for (int columna = numBarras - 1; columna >= 0; columna--) {
                if (alturas[columna] > fila) {
                    System.out.print("   =   ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
            pause(300);
        }

        for (int columna = 0; columna < numBarras; columna++) {
            System.out.print("   =   ");
        }
        System.out.println();
    }

    private void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Error en la animación de las barras.");
        }
    }

    public static void main(String[] args) {
        new g4_loadingDoce();
    }
}
//loading trece
package loadings;

public class g4_loadingTrece {

    public g4_loadingTrece() {
        int desplazamientoMaximo = 20; 
        long tiempoLimite = 5000; 
        long tiempoInicio = System.currentTimeMillis(); 
        while (System.currentTimeMillis() - tiempoInicio < tiempoLimite) {
            for (int j = 0; j < desplazamientoMaximo; j++) {
                imprimirFigura(j);
                pause(100); 
            }
            for (int j = desplazamientoMaximo; j >= 0; j--) {
                imprimirFigura(j);
                pause(100); 
            }
        }

        imprimirFigura(desplazamientoMaximo / 2);
    }

    private void imprimirFigura(int desplazamiento) {
        String espacio = " ".repeat(desplazamiento);

        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println(espacio + "   \\|||/");
        System.out.println(espacio + "   (> <)");
        System.out.println(espacio + "ooO-(_)-Ooo");
    }

    private void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Error en la animación.");
        }
    }

    public static void main(String[] args) {
        new g4_loadingTrece();
    }
}

