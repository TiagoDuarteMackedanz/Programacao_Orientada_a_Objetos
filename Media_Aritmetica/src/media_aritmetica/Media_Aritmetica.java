package media_aritmetica;
public class Media_Aritmetica {

    public static void main(String[] args) {
        double nota1 = 8, nota2 = 9.5; 
        double resultado = 0;
        
        System.out.println("***Media Aritmetica***");
                resultado = (nota1+nota2)/2;
                System.out.print("Media Aritmetica: ");
                System.out.println(resultado);
                
        System.out.println("***Nota Ponderada***");
                System.out.println("Peso 2 e 3");
                resultado = (nota1+nota2)/(2+3);
                System.out.println(resultado);
    }
    
}