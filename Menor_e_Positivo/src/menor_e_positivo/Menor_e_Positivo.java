package menor_e_positivo;
public class Menor_e_Positivo {

    public static void main(String[] args) {
        int a = -5, b = 6, c = 3, i = 0, menor;
        
        System.out.println("***Menor Numero***");
         menor = a;
         if (a > b){
             menor = b;
             System.out.print("Menor e: ");
             System.out.println(menor);
         }
         else if (a > c) {
             menor = c;
             System.out.print("Menor e: ");
             System.out.println(menor);
         }
         else {
             menor = a;
             System.out.print("Menor e: ");
             System.out.println(menor);
         }
         System.out.println("***Numeros Positivos***");
         if (a > 0){
             System.out.print("Valor A: ");
             System.out.println("Positivo");
         }
         if (b > 0){
             System.out.print("Valor B: ");
             System.out.println("Positivo");
         }
         if (c > 0){
             System.out.print("Valor C: ");
             System.out.println("Positivo");
         }
            }
        }
