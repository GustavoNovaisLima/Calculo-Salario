import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // O primeiro passo é a entrada de dados//
        double horatrabalhada = 0;
        double salariohora = 0;
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("Digite aqui as horas trabalhadas");
        horatrabalhada = sc.nextDouble();
        }while(horatrabalhada < 0);//Se o cliente digitar uma hora trabalhada negativa, irá pedir novamente//

        System.out.println("Digite o salario por HORA");
        salariohora = sc.nextDouble();

         //Se as horas trabalhadas for <= 40, o salario bruto sera horas * salario por hora//
         //Se as horas trabalhadas for > 40, o salario sera : salario hora extra + salario por 40 horas//

         double salariobruto = 0;

         if(horatrabalhada <= 40){
            salariobruto = (horatrabalhada * salariohora);
         }
         else{
            double horaextra = horatrabalhada - 40;
            salariobruto = 40 * salariohora + horaextra * salariohora  * 1.5;
         }

         System.out.println("O seu salario bruto é de " + salariobruto);
        

    }
}
