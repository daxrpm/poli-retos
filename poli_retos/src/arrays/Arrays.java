package arrays;
import java.util.Scanner;
public class Arrays {
//     A01)
// Crear una array para cada palabra de su nombre e ingrese el porcentaje de
// carga para cada palabra.
// Ejemplo:
// Pancracia Carmeliana Altamirano Perez
// Ingrese el porcentaje de carga: 100 75 50 25
// Pancracia Carmeliana Altamirano Perez
// [==============>] 100% Pancracia
// [==========>    ] 75% Carmeli
// [=======>       ] 50% Altam
// [===>           ] 25% Pe
    
    public static void exerciceA01() {
        int SPACES = 15;
        Scanner sc = new Scanner(System.in);
        String name = "Ariel Dax Navarrete Freire";
        String[] names = name.split(" ");
        String[][] words = new String[4][19];
        System.out.println("Ingrese los porcentajes de carga: ");
        String porcentajes = sc.nextLine();
        String[] porcentajesStrArray = porcentajes.split(" ");
        Integer[] porcentajesArray = new Integer[porcentajesStrArray.length];
        for (int i = 0; i < porcentajesStrArray.length; i++) {
            porcentajesArray[i] = Integer.parseInt(porcentajesStrArray[i]);
        }

        for (int k = 0; k < names.length; k++) {
            for (int i = 0; i < words[k].length; i++) {
                words[k][i] = " ";
            }
            
            
            words[k][0] = "[";
            int top=0;
            for (int i = 1; i < (porcentajesArray[k]*SPACES)/100; i++) {
                words[k][i] = "=";
                top = i;
            }
            words[k][top+1] = ">";
            words[k][16] = "]";
            int numCaracteres = (names[k].length() * porcentajesArray[k]) / 100;
            String subWord = names[k].substring(0, numCaracteres);
            words[k][18] = porcentajesArray[k].toString() + "% " + subWord;   
            for (int i = 0; i < words[k].length; i++) {
                System.out.print(words[k][i]);
            }
            System.out.println();
        }
    }

}