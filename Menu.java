import java.util.List;
import java.util.Scanner;

public class Menu {
    private String title;
    private List<String> options;

    public Menu(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    public int getSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.print("Escolha uma opção: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice > 0 && choice <= options.size()) {
            return choice;
        } else {
            System.out.println("Opção inválida");
            return -1;
        }
    }

    public void handleClienteMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Cliente:");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco);
        System.out.println("Cliente criado com sucesso: " + cliente);
        scanner.close();
    }
}
