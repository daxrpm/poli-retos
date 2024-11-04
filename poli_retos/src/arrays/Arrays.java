package arrays;

import java.util.Scanner;
import java.util.Random;

public class Arrays {
    public final Integer LEVEL;
    public String NAME;

    public Arrays(int LEVEL) {
        this.LEVEL = LEVEL;
    }

    private void array1() {
        int SPACES = 15;
        Scanner sc = new Scanner(System.in);
        String[] names = NAME.split(" ");
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
            int top = 0;
            for (int i = 1; i < (porcentajesArray[k] * SPACES) / 100; i++) {
                words[k][i] = "=";
                top = i;
            }
            words[k][top + 1] = ">";
            words[k][16] = "]";
            int numCaracteres = (names[k].length() * porcentajesArray[k]) / 100;
            String subWord = names[k].substring(0, numCaracteres);
            words[k][18] = porcentajesArray[k].toString() + "% " + subWord;
            for (int i = 0; i < words[k].length; i++) {
                System.out.print(words[k][i]);
            }
            System.out.println();
        }
        sc.close();
    }

    private void array2() {
        String[][] mt = new String[LEVEL][LEVEL * 4];
        for (int i = 0; i < LEVEL; i++) {
            for (int j = 0; j < LEVEL * 4; j++) {
                if (j < LEVEL) {
                    if (i == 0 && j != 0 && j != LEVEL - 1) {
                        mt[i][j] = "*";
                    } else if (i == LEVEL / 2) {
                        mt[i][j] = "*";
                    } else if (j == 0 || j == LEVEL - 1) {
                        mt[i][j] = "*";
                    } else {
                        mt[i][j] = " ";
                    }
                } else if (j >= LEVEL * 2 && j < LEVEL * 3) {
                    if (j == LEVEL * 2 || j == LEVEL * 3 - 1) {
                        mt[i][j] = "*";
                    } else if (i == j - LEVEL * 2) {
                        mt[i][j] = "*";
                    } else {
                        mt[i][j] = " ";
                    }
                } else {
                    mt[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < LEVEL; i++) {
            for (int j = 0; j < LEVEL * 4; j++) {
                System.out.print(mt[i][j]);
            }
            System.out.println();
        }
    }

    private void array3() {
        String[][] mt = new String[LEVEL * 2][LEVEL * 2];
        String name = NAME.split(" ")[0];
        for (int i = 0; i < LEVEL * 2; i++) {
            for (int j = 0; j < LEVEL * 2; j++) {
                mt[i][j] = " ";
            }
        }
        for (int i = 2; i < LEVEL * 2; i++) {
            mt[LEVEL * 2 - 1][i] = "-";
        }
        for (int i = LEVEL * 2 - 1; i >= 0; i--) {
            String num = Integer.toString(LEVEL * 2 - i);
            mt[i][0] = num;
        }
        for (int i = 0; i < LEVEL * 2; i++) {
            mt[i][1] = "|";
        }
        System.out.println("paso");
        int contador = 1;
        for (int i = 0; i < name.length(); i++) {
            mt[(LEVEL * 2) - (contador * 2) - 1][contador + 1] = Character.toString(name.charAt(i));
            contador++;
        }

        for (int i = 0; i < LEVEL * 2; i++) {
            for (int j = 0; j < LEVEL * 2; j++) {
                System.out.print(mt[i][j]);
            }
            System.out.println();
        }

    }

    private void array4() {
        String[] names = NAME.split(" ");
        String[][] mt = new String[LEVEL * 3][LEVEL * 3];
        for (int i = 0; i < LEVEL * 3; i++) {
            for (int j = 0; j < LEVEL * 3; j++) {
                mt[i][j] = " ";
            }
        }
        int contador = 0;
        for (int i = 0; i < LEVEL * 3; i++) {
            for (int j = 0; j < names[0].length(); j++) {
                if (i == j) {
                    mt[i][j] = Character.toString(names[0].charAt(j));
                }
            }
        }
        for (int i = 0; i < LEVEL * 3; i++) {
            for (int j = LEVEL * 3 - 1; j >= LEVEL * 3 - names[2].length(); j--) {
                if (LEVEL * 3 - 1 - i == j) {
                    mt[i][j] = Character.toString(names[2].charAt(contador));
                    contador++;
                }
            }
        }
        for (int i = 0; i < LEVEL * 3; i++) {
            for (int j = 0; j < LEVEL * 3; j++) {
                System.out.print(mt[i][j]);
            }
            System.out.println();
        }

    }

    private void array5() {
        String[] names = NAME.split(" ");
        int size = NAME.replace(" ", "").length();
        String[][] mt = new String[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mt[i][j] = " ";
            }
        }

        for (String name : names) {
            for (char c : name.toCharArray()) {
                int x, y;
                do {
                    x = random.nextInt(size);
                    y = random.nextInt(size);
                } while (!mt[x][y].equals(" ") && !mt[x][y].equals(Character.toString(c)));
                if (mt[x][y].equals(Character.toString(c))) {
                    mt[x][y] = "*";
                } else {
                    mt[x][y] = Character.toString(c);
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mt[i][j]);
            }
            System.out.println();
        }
    }

    public void g4_imprimirTodosArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        NAME = sc.nextLine();
        array1();
        array2();
        array3();
        array4();
        array5();
        sc.close();
    }
}
