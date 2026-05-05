package projeto.provaa3;
//Gerente faz Herança com Usuario

public class Gerente extends Usuario {
    
   public Gerente(String nome, String cpf, String email, String login, String senha) {

        super(nome, cpf, email, Perfil.GERENTE, login, senha);

    }


    // Retorna o nome do gerente
    public String getNome() {
        return nomeCompleto;
    }
    
}
