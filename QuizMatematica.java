import  java.util.Random;
import java.util.Scanner;

public class QuizMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int acertos = 0;

        System.out.println("🤡 bem vindo ao Quiz de Somar! Acerte 3 para vencer");
        while(acertos < 3){
            int num1= random.nextInt(  10) + 1;
            int num2 = random.nextInt( 10) + 1;
            int resposta = num1 + num2;

            System.out.println("Quanto é " + num1 + " + " + num2 + "?");
            int res = scanner.nextInt();

            if (res == resposta) {
                acertos++;
                System.out.println("Correto! Faltam " + (3 - acertos));
            } else {
                System.out.println("Errado! Tente novamente");
            }
        }

        System.out.println("Parabéns! Você venceu o desfio.");
    }
}
