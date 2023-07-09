package fatorial;
public class Fatorial {

    public static void main(String[] args) {
        int numero = 5, fatorial = 1, i = 1;
        
        for (i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " e: " + fatorial);
    }   
}
