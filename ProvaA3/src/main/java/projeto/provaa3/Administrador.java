package projeto.provaa3;
//Administrador que faz herança com Usuario 
public class Administrador extends Usuario{

    public Administrador(String nome, String cpf, String email, String login, String senha) {

        super(nome, cpf, email, Perfil.ADMINISTRADOR, login, senha);

    }


   
    
        
    
}
