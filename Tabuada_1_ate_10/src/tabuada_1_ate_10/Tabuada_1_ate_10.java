package tabuada_1_ate_10;

public class Tabuada_1_ate_10 {
    
    public static void main(String[] args) {
        int i = 1, mult = 1, resultado = 0;
        
        for (i = 1; i < 11; i++) {
            System.out.print("Tabuada do ");
            System.out.println(i);
            for (mult = 1; mult < 11; mult++){
                resultado = i*mult;
                System.out.println(resultado); 
        }
    }
    }  
}
