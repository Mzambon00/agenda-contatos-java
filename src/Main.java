import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        CriarContato criar = new CriarContato();
        EditarContato editar = new EditarContato();
        ListarContatos listar = new ListarContatos();
        ExcluirContato excluir = new ExcluirContato();

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Criar contato");
            System.out.println("2 - Editar contato");
            System.out.println("3 - Listar contatos");
            System.out.println("4 - Excluir contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": criar.criar(contatos, scanner); break;
                case "2": editar.editar(contatos, scanner); break;
                case "3": listar.listar(contatos); break;
                case "4": excluir.excluir(contatos, scanner); break;
                case "0":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
