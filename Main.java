import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
        Cliente cliente = new Cliente("João", "12345678900", "Rua Exemplo, 123");
        Scanner scanner = new Scanner(System.in);
        int selection;

        do {
            selection = mainMenu.getSelection();
            switch (selection) {
                case 1:
                    System.out.println("Conta foi selecionada");
                    break;
                case 2:
                    mainMenu.handleClienteMenu();
                    break;
                case 3:
                    System.out.println("Operacoes foi selecionada");
                    System.out.println("Escolha uma operacao:");
                    System.out.println("1 - Adicionar Valor");
                    System.out.println("2 - Remover Valor");
                    System.out.println("3 - Imprimir Extrato");
                    int operacao = scanner.nextInt();

                    switch (operacao) {
                        case 1:
                            System.out.print("Digite o valor para adicionar: ");
                            double valorAdicionar = scanner.nextDouble();
                            cliente.addValue(valorAdicionar);
                            break;
                        case 2:
                            System.out.print("Digite o valor para remover: ");
                            double valorRemover = scanner.nextDouble();
                            cliente.removeValue(valorRemover);
                            break;
                        case 3:
                            cliente.printAccountStatement();
                            break;
                        default:
                            System.out.println("Operacao invalida.");
                    }
                    break;
                case 4:
                    System.out.println("Sair foi selecionado");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (selection != 4);

        System.out.println("Fim");
        scanner.close();
    }
}