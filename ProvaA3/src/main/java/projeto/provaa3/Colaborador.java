package projeto.provaa3;
//Colaborador faz Herança com Usuario 
public class Colaborador extends Usuario {
    
   public Colaborador(String nome, String cpf, String email, String login, String senha) {

        super(nome, cpf, email, Perfil.COLABORADOR, login, senha);

    }
    
}
