 public class TestaIf {

        public static void main(String[] args) {

            double salario = 2800.0;

            if (salario >= 1900.0 && salario <= 2800.0) {
                    System.out.println("o valor do IR é de: 7,5%. Totalizando: 142,00 ");}
            if (salario >= 2800.1 && salario <= 3751.0) {
                    System.out.println("o valor do IR é de: 15%. Totalizando: 350,00");}
            if (salario >= 3751.1 && salario <= 4664.0){
                    System.out.println("o valor do IR é de: 22,5%. Totalizando: 636,00");}
        }
 }
