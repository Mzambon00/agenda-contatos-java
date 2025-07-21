import java.util.List;
import java.util.Scanner;

public class CriarContato {

    public void criar(List<Contato> contatos, Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        int id = contatos.size() + 1; // simples ID incremental
        Contato novo = new Contato(id, nome, telefone);
        contatos.add(novo);

        System.out.println("Contato criado com sucesso!");
    }
}
