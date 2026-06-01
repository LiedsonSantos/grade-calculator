
import java.util.Locale;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("Digite o nome do aluno: ");
            String nomeAluno = sc.next();

            System.out.println("===digite 3 notas do aluno===");

            System.out.println("Digite nota 1/3");
            double nota1 = sc.nextDouble();

            System.out.println("Digite nota 2/3");
            double nota2 = sc.nextDouble();

            System.out.println("Digite nota 3/3");
            double nota3 = sc.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

             if (media < 5) {
                System.out.printf("O aluno %s está reprovado com média: %.2f%n", nomeAluno, media);
            } else if (media >= 5 && media < 7) {
                System.out.printf("O aluno %s está de recuperação com média: %.2f%n", nomeAluno, media);
            } else if (media >= 7) {
                 System.out.printf("O aluno %s está aprovado com média: %.2f%n" + nomeAluno + media);
             }
        }
    }
}