package calculo_imc;
public class Calculo_IMC {

    public static void main(String[] args) {
    int peso = 23;
    
        if (peso < 20){
            System.out.println(peso);
            System.out.println("Condicao: Magro"); 
            }
        else if (peso >= 20 && peso < 25){
            System.out.println(peso);
            System.out.println("Condicao: Normal");
                }
        else if (peso >= 25 && peso < 29){
            System.out.println(peso);
            System.out.println("Condicao: Acima do Peso");
                }
        else if (peso >= 29 && peso < 30){
            System.out.println(peso);
            System.out.println("Condicao: Obeso");
                }
        else if (peso >= 30){
            System.out.println(peso);
            System.out.println("Condicao: Muito Obeso");
                }
        else {
           System.out.println(peso);
           System.out.println("Peso Abaixo do Normal");
                }    
    }
    
}
