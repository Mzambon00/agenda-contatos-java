import java.util.List;
import java.util.Scanner;

public class ExcluirContato {

    public void excluir(List<Contato> contatos, Scanner scanner) {
        System.out.print("Digite o ID do contato para excluir: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Contato c : contatos) {
            if (c.getId() == id) {
                contatos.remove(c);
                System.out.println("Contato excluído!");
                return;
            }
        }

        System.out.println("Contato não encontrado.");
    }
}
