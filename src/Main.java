import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double totalSoma = 0;
        int quantidade = 0;

        while(true){
            System.out.println("Digite a nota");
            double nota = sc.nextDouble();
            totalSoma += nota;
            quantidade++;

            System.out.println("Deseja continuar? (S/N)");
            String resposta = sc.next();
            if(resposta.equalsIgnoreCase("N")){
                break;
            }
        }
        sc.close();
        double media = calculoMedia(totalSoma, quantidade);
        System.out.printf("Media: %.2f", media);
    }

    public static double calculoMedia(double totalSoma, int quantidade){
        return totalSoma/quantidade;
    }

}