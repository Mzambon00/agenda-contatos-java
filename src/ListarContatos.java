import java.util.List;

public class ListarContatos {

    public void listar(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        System.out.println("=== Lista de contatos ===");
        for (Contato c : contatos) {
            System.out.printf("ID: %d | Nome: %s | Telefone: %s%n", c.getId(), c.getNome(), c.getTelefone());
        }
    }
}
