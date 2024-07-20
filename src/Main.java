import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true; // criado para manter o menu ativo ate que a opção sair seja pressionada
        while (continuar) {
            exibirMenu();
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    Motor.adicionarMotor(); // adiciona motor ao estoque
                    break;
                case 2:
                    Motor.exibirMotores(); // exibe motores cadastrados
                    break;
                case 3:
                    Motor.pesquisarMotor(); // pesquisa motor desejado
                    break;
                case 4:
                    continuar = false; // encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }

    public static void exibirMenu() {
        System.out.print("\n");
        System.out.println("\nEscolha uma opção:\n");
        System.out.println("1. Adicionar um motor");
        System.out.println("2. Exibir todos os motores");
        System.out.println("3. Pesquisar um motor por ID");
        System.out.println("4. Sair\n");
        System.out.print("Opção: ");
    }
}
