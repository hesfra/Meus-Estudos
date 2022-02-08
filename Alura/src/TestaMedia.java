import java.util.Scanner;
public class TestaMedia {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota");
        Scanner input1 = new Scanner(System.in);
        float nota1 = input1.nextFloat();
        System.out.println("Digite a segunda nota");
        Scanner input2 = new Scanner(System.in);
        Float nota2 = input2.nextFloat();
        System.out.println("Digite a 3 nota");
        Scanner input3 = new Scanner(System.in);
        Float nota3 = input3.nextFloat();
        System.out.println("Digite a 4 nota");
        Scanner input4 = new Scanner(System.in);
        Float nota4 = input4.nextFloat();
        float media = (nota1 + nota2 + nota3 +nota4) /4;
        System.out.println("a média é: "+media);
    }
}
