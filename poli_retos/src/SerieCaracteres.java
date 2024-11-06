public class SerieCaracteres {
    private final int n;

    public SerieCaracteres(int nivel) {
        this.n = nivel;
    }

    public  void g4_imprimeTodasSeriesdeCaracteres () {
        System.out.println("Series:");
        System.out.println("Secuencia 1: ");
        secuenciac1();
        System.out.println("");
        System.out.println("Secuencia 2: ");
        secuenciac2();
        System.out.println("");
        System.out.println("Secuencia 3: ");
        secuenciac3();
        System.out.println("");
        System.out.println("Secuencia 4: ");
        secuenciac4();
        System.out.println("");
        System.out.println("Secuencia 5: ");
        secuenciac5();
        System.out.println("");
        System.out.println("Secuencia 6: ");
        secuenciac6();
        System.out.println("");
        System.out.println("Secuencia 6.1: ");
        secuenciac6_1();
        System.out.println("");
        System.out.println("Secuencia 7: ");
        secuenciac7();
        System.out.println("");
        System.out.println("Secuencia 8: ");
        secuenciac8();
        System.out.println("");
        System.out.println("Secuencia 9: ");
        secuenciac9();
        System.out.println("");
    }

    public  void secuenciac1 () {
        String signo_suma="+";
        String signo_resta="-";
        for (int i = 0; i < n; i++) 
        {
            if (i%2==0)
            System.out.print(signo_suma);
            else
            System.out.print(signo_resta);
        }
    }

    public  void secuenciac2 () {
        String signo_suma="+";
        int F1=1;
        int F2=0;
        int F0;
        if (n>=1)
            System.out.print(signo_suma+" ");
        for (int i = 0; i < n; i++) {
            F0=F1+F2;
        for (int x = 1; x <= F0; x++) 
            System.out.print(signo_suma);
            F2 = F1;
            F1 = F0;
            System.out.print(" ");
        }
    }
    
    public  void secuenciac3 () {
        String signo_suma = "+";
        int contador_nprimo=0;
        int i=2;
        while (contador_nprimo<n && i<=10000)
            {
            boolean primo =true;
            int j=2 ;           
            while ( j < i) 
                {
                if(i%j==0){
                    primo = false;
                    j=i;
                }else{
                    j++;}
                }
            if(primo)
                {
                for (j = 1; j <=i; j++)
                    System.out.print(signo_suma);
                contador_nprimo++;
                System.out.print(" ");
                }
            i++;
            }
    }
    
    public  void secuenciac4 () {
        String cadenaCaracteres = "+-*/";
        for(int i = 0; i <= n-1; i++) 
            {
            char caracter = cadenaCaracteres.charAt(i % cadenaCaracteres.length());
            System.out.print (caracter+" ");
            }
    }
    
    public  void secuenciac5 () {
        String cadenaCaracteres = "\\|/-|";
        for(int i = 0; i <= n-1; i++) 
            {
            char caracter = cadenaCaracteres.charAt(i % cadenaCaracteres.length());
            System.out.print (caracter+" ");
            }
    }
    
    public  void secuenciac6 () {
        for(char i = 0; i <= n; i++) 
            {
            char letra=(char) (97+(i-26*(i/26)));
            System.out.print (letra + " ");
            }
    } 

    public  void secuenciac6_1 () {
        String signo_suma = "+";
        for(char i = 0; i <= n; i++) 
            {
            char letra=(char) (97+(i-26*(i/26)));
                if(letra%2==1)
                {
                System.out.print(letra + " ");
                }else{
                    System.out.print(signo_suma + " ");
                if(signo_suma=="-")
                signo_suma="+";
                else
                signo_suma="-";
                    }
            }
    } 

    public  void secuenciac7 () {
        for(char i = 0; i <= n; i++) 
            {
            char letra=(char) (97+(i-26*(i/26)));
            for (int j = 0; j < (i+1)*2; j++)
                System.out.print (letra);
            System.out.print(" ");
            }
    } 

    public  void secuenciac8 () {
        for(char i = 0; i <= n; i++) 
            {
            char letra=(char) (97+(i-26*(i/26)));
            for (int j = 1; j < (i+1)*2; j++)
                System.out.print (letra);
            System.out.print(" ");
            }
    }

    public  void secuenciac9 () {
        int F1=1;
        int F2=0;
        int F0;
        if (n>=1)
        System.out.print("a ");
        if (n>=2)
        System.out.print("b ");
        for(char i = 2; i <= n; i++) 
            {
                F0=F1+F2;
                char letra=(char) (97+(i-26*(i/26)));
                for (int j = 1; j <=F0; j++)
                    System.out.print (letra);
                F2=F1;
                F1=F0;
            System.out.print(" ");
            }
    }
}
