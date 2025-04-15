import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaiorEntre3Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior numero é: " + numero1);
        }
        if (numero2 > numero3){
            System.out.println("O maior numero é: " + numero2);
        }else{
            System.out.println("O maior numero é: " + numero3);
        }
        scanner.close();
    }
}