public class SerieNumerica {
    private final int n;

    public SerieNumerica(int n) {
        this.n = n;
    }

    public  void g4_imprimeTodasSeries () {
        System.out.println("Series:");
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

    public  void secuencia6 () {
        for (int i=1; i<=n; i++){
            System.out.print(i*i+", ");
        }
    }

    public  void secuencia7 () {
        int num=1;
        for (int i=1; i<=n; i++){
            System.out.print(num+", ");
            num+=3;
        }
    }
    
    public  void secuencia8 () {
        int num=3;
        for (int i=3; i<=n; i++){
            System.out.print(num+", ");
            num+=5;
        }
    }
    
    public  void secuencia9 () {
        int num=2;
        for (int i=2; i<=n; i++){
            System.out.print(num+", ");
            num+=num;
        }
    }
    
    public  void secuencia10 () {
        int num=3;
        for (int i=3; i<=n; i++){
            System.out.print(num+", ");
            num=num*3;
        }
    }
    
    public  void secuencia11 () {
        for (int i=1; i<=n; i++){
            int num=i*(i+1);
            System.out.print(num+", ");
        }
    } 
}
