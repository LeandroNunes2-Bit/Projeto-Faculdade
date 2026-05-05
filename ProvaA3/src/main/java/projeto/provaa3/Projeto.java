package projeto.provaa3;

public class Projeto {
   private String nome;
   private String descricao;
   private String dataInicio;
   private String dataFim;
   private StatusProjeto status;
   private Gerente gerente;

    public Projeto(String nome, String descricao, String dataInicio, String dataFim, StatusProjeto status, Gerente gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.gerente = gerente;
    }

    public void exibirProjeto() {
        System.out.println("\n--- PROJETO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data inicio: " + dataInicio);
        System.out.println("Data fim: " + dataFim);
        System.out.println("Status: " + status);
        System.out.println("Gerente: " + gerente.getNome());
    }

    String getNome() {
       return nome;
    }
    
}
