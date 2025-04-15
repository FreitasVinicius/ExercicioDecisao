import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CompararPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String produto = scanner.nextLine();

        System.out.println("Digite o preço do produto na primeira loja:");
        double preco1 = scanner.nextDouble();
        System.out.println("Digite o preço do produto da segunda loja:");
        double preco2 = scanner.nextDouble();

        if(preco1 < preco2){
            System.out.printf("O produto %s é mais barato na primeira loja.", produto);
        }else{
            System.out.printf("O produto %s é mais barato na segunda loja.",produto);
        }
        scanner.close();
    }
    }