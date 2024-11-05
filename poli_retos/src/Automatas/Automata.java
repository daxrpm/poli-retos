package Automatas;

import java.util.Scanner;

public class Automata {
    public static boolean g4_validate1(String input) {
        int state = 0;

        for (char ch : input.toCharArray()) {
            switch (state) {
                case 0:
                    if (ch == 'a') {
                        state = 0;
                    } else if (ch == 'b') {
                        state = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (ch == 'c') {
                        state = 2;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    return false;
            }
        }
        return state == 2;
    }

    public static boolean g4_validate2(String input) {
        int state = 0;

        for (char ch : input.toCharArray()) {
            switch (state) {
                case 0:
                    if (ch == 'a') {
                        state = 1;
                    } else if (ch == 'c') {
                        state = 3;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (ch == 'b') {
                        state = 2;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (ch == 'b') {
                        state = 2;
                    } else if (ch == 'c') {
                        state = 3;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    if (ch == 'a') {
                        state = 4;
                    } else {
                        return false;
                    }
                    break;
                case 4:
                    return false;
            }
        }
        return state == 2 || state == 4;
    }

    public static boolean g4_validate3(String input) {
        int state = 0;
        boolean hasValidChar = false;

        for (char ch : input.toCharArray()) {
            switch (state) {
                case 0:
                    if (ch == 'a') {
                        state = 1;
                        hasValidChar = true;
                    } else if (ch == 'b') {
                        state = 2;
                        hasValidChar = true;
                    } else if (ch == 'c') {
                        state = 3;
                        hasValidChar = true;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (ch == 'a') {
                        state = 1;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (ch == 'b') {
                        state = 2;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    if (ch == 'c') {
                        state = 3;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return hasValidChar; // Acepta si al menos un carácter válido fue encontrado
    }

    public static boolean g4_validate4(String input) {
        int state = 0;
    
        for (char ch : input.toCharArray()) {
            switch (state) {
                case 0:
                    if (ch == '1') {
                        state = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (ch == '1') {
                        state = 1;
                    } else if (ch == '0') {
                        state = 2;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (ch == '0') {
                        state = 2; 
                    } else if (ch == '1') {
                        state = 3; 
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    if (ch == '1') {
                        state = 3; 
                    } else {
                        return false; 
                    }
                    break;
            }
        }
        return state == 1 || state == 2 || state == 3; 
    }
    public static boolean g4_validate5(String input) {
        return input.matches("-?\\d+\\.\\d+");
    }
    public static boolean g4_validate6(String input) {
        int estado = 0;

        for (int i = 0; i < input.length(); i++) {
            char caracterActual = input.charAt(i);

            switch (estado) {
                case 0:
                    if (Character.isLetter(caracterActual)) {
                        estado = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (Character.isLetter(caracterActual) || Character.isDigit(caracterActual) || caracterActual == '_' || caracterActual == '$') {
                        estado = 1;
                    } else if (caracterActual == '=') {
                        estado = 2;
                    } else if (caracterActual == ';' || caracterActual == ',') {
                        estado = 3;
                    } else {
                        return false;
                    }
                    break;
                case 2:
                    if (Character.isDigit(caracterActual)) {
                        estado = 4;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    if (caracterActual == ';' || caracterActual == ',') {
                        estado = 3;
                    } else {
                        return false;
                    }
                    break;
                case 4:
                    if (caracterActual == ';' || caracterActual == ',') {
                        estado = 3;
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return estado == 1 || estado == 3 || estado == 4;
    }
    public static boolean g4_validate7(String input) {
        input = input.trim();
        
        if (input.endsWith("(")) {
            input = input.substring(0, input.length() - 1).trim();
        }

        switch (input) {
            case "for":
            case "if":
            case "else":
            case "ifelse":
            case "foreach":
                return true;
            default:
                return false;
        }
    }
    public static boolean g4_validate8(String input) {
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tieneCaracterEspecial = true;
            }
        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("GRUPO NUMERO 4 || EJERCICIOS AUTOMATAS: ");
        
        System.err.println("EJERCICIO A01: ");
        System.out.print("Para la cadena (a*b+c) || Ingrese una cadena para validar: ");
        String input1 = scanner.nextLine(); 

        if (g4_validate1(input1)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }

        System.err.println("EJERCICIO A02: ");
        System.out.print("Para la cadena (ab+ca) || Ingrese una cadena para validar: ");
        String input2 = scanner.nextLine();

        if (g4_validate2(input2)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }

        System.err.println("EJERCICIO A03: ");
        System.out.print("Para la cadena (a+/b+/c+) || Ingrese una cadena para validar: ");
        String input3 = scanner.nextLine();

        if (g4_validate3(input3)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }
        System.err.println("EJERCICIO A04: ");
        System.out.print("Para la cadena (1+/0+1*) || Ingrese una cadena para validar: ");
        String input4 = scanner.nextLine();

        if (g4_validate4(input4)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }
        System.err.println("EJERCICIO A05: ");
        System.out.print("Ingrese un número decimal para validar: ");
        String input5 = scanner.nextLine();

        if (g4_validate5(input5)) {
            System.out.println("Es decimal");
        } else {
            System.out.println("No es un decimal");
        }

        System.err.println("EJERCICIO A06: ");

        System.out.print("Ingrese una declaración de variable para validar: ");
        String input6 = scanner.nextLine();
        
        if (g4_validate6(input6)) {
            System.out.println("La cadena ingresada es valida.");
        } else {
            System.out.println("La cadena ingresada es invalida. ");
        }
        System.out.println("EJERCICIO A07: ");
        System.out.print("Ingresa una declaración(Palabras admitidas: for , if , else , ifelse , foreach., ademas se admiten variantes como if( o if (   ):");
        String int7 = scanner.nextLine();
        
        if (g4_validate7(int7)) {
            System.out.println("La declaración es válida.");
        } else {
            System.out.println("La declaración no es válida.");
        }

        System.out.print("Ingresa una cadena para validar, asegúrate de incluir al menos una letra mayúscula, una letra minúscula, un número y un carácter especial: ");
        String int8 = scanner.nextLine();

        if (g4_validate8(int8)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }

        scanner.close(); 
    }
}
