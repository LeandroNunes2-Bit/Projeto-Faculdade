package projeto.provaa3;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
     private String nomeEquipe;
    private String descricao;
    private List<Usuario> membros;
    private List<Projeto> projetos;

    // Construtor
   public Equipe(String nomeEquipe, String descricao) {
    this.nomeEquipe = nomeEquipe;
    this.descricao = descricao;
    this.membros = new ArrayList<>();
    this.projetos = new ArrayList<>();
}

    // Adicionar membro
    public void adicionarMembro(Usuario usuario) {
        membros.add(usuario);
    }

    // Remover membro
    public void removerMembro(Usuario usuario) {
        membros.remove(usuario);
    }

    // Adicionar projeto
    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    // Exibir dados da equipe
    public void mostrarEquipe() {

        System.out.println("Equipe: " + nomeEquipe);
        System.out.println("Descricao: " + descricao);

        System.out.println("\n== MEMBROS ==");
        for (Usuario u : membros) {
            u.mostrarDados(); // usa seu método
        }

        System.out.println("\n== PROJETOS ===");
        for (Projeto p : projetos) {
            System.out.println("Projeto: " + p.getNome());
        }
    }

}
   