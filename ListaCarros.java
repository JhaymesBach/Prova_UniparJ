import java.util.Scanner;

public class ListaCarros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de carros que você deseja inserir: ");
        int n = 0;

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("O número deve ser maior que 0.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.close();
            return;
        }

        double soma = 0.0;

        System.out.println("Agora, insira " + n + " números:");

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");

            if (scanner.hasNextDouble()) {
                double numero = scanner.nextDouble();
                soma += numero;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
                i--;
            }
        }

        double media = soma / n;

        System.out.println("A média dos números inseridos é: " + media);

        scanner.close();
    }


}
