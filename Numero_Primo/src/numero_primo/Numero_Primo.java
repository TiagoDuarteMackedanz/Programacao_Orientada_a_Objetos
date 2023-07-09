package numero_primo;
public class Numero_Primo {
    
    public static void main(String[] args) {
        int numero = 2, i;
        boolean primo = true;
        
        if (numero <= 1) {
            primo = false;
        } 
        else {
            for (i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        
        if (primo) {
            System.out.println(numero + " Numero Primo");
        } 
        else {
            System.out.println(numero + " Nao e Numero Primo");
        }
    }
}