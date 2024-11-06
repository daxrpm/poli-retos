public class Figura {
    private final int n_posicion; 

    public Figura(int nivel) {
        this.n_posicion = nivel;
    }


    public  void g4_imprimeTodasFiguras(){
        System.out.println("Figura 1:");
        figura1();
        System.out.println("");
    }
    
    public  void figura1(){
        String caracter = "*";
            for(int fila = 0; fila < n_posicion; fila++)
            {
                for(int columna = 0; columna < n_posicion; columna++)
                {
                    if(fila==0||columna==0||fila==n_posicion-1||columna==n_posicion-1)
                    System.out.print(caracter);
                    else
                    System.out.print(" ");
                System.out.print(" ");
                }System.out.println();
            }
    }
    }
