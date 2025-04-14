import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("Maior numero:" + numero1);
        }else{
            System.out.println("Maior numero:" + numero2);
        }
        scanner.close();
    }
}