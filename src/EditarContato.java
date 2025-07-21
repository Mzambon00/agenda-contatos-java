import java.util.List;
import java.util.Scanner;

public class EditarContato {

    public void editar(List<Contato> contatos, Scanner scanner) {
        System.out.print("Digite o ID do contato para editar: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Contato c : contatos) {
            if (c.getId() == id) {
                System.out.print("Novo nome (atual: " + c.getNome() + "): ");
                String novoNome = scanner.nextLine();
                if (!novoNome.isEmpty()) {
                    c.setNome(novoNome);
                }

                System.out.print("Novo telefone (atual: " + c.getTelefone() + "): ");
                String novoTel = scanner.nextLine();
                if (!novoTel.isEmpty()) {
                    c.setTelefone(novoTel);
                }

                System.out.println("Contato atualizado!");
                return;
            }
        }

        System.out.println("Contato não encontrado.");
    }
}
