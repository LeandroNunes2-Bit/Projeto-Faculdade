package projeto.provaa3;
//Classe Usuario que vai ser a Herança
public class Usuario {
     protected String nomeCompleto;
    protected String cpf;
    protected String email;
    protected Perfil perfil;
    protected String login;
    protected String senha;

    // Construtor Usuário
    public Usuario(String nomeCompleto, String cpf, String email, Perfil perfil, String login, String senha) {

        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.perfil = perfil;
        this.login = login;
        this.senha = senha;

    }

   
    public void mostrarDados() {

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Perfil: " + perfil);
        System.out.println("---------------------------");

    }
}
