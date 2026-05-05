
package projeto.provaa3;

import java.util.Scanner;

public class ProvaA3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Inicio do Cadastrado de Usuários
        System.out.println("----CADASTRO DE USUARIOS----");
        

    System.out.println("Nome do gerente:");
        String nome = sc.nextLine();

    System.out.println("CPF:");
        String cpf = sc.nextLine();

    System.out.println("Email:");
        String email = sc.nextLine();

    System.out.println("Login:");
        String login = sc.nextLine();

    System.out.println("Senha:");
        String senha = sc.nextLine();
        // Criando o gerente com os dados informados
    Gerente gerente = new Gerente(nome, cpf, email, login, senha);
        
        System.out.println("Nome do projeto:");
        String nomeProjeto = sc.nextLine();
       
        
        
        System.out.println("Descricao:");
        String descricao = sc.nextLine();

        System.out.println("Data de inicio:");
        String dataInicio = sc.nextLine();

        System.out.println("Data de termino:");
        String dataFim = sc.nextLine();

        // Escolha do status do projeto
        System.out.println("Escolha o status:");
        System.out.println("1 - Planejado");
        System.out.println("2 - Em andamento");
        System.out.println("3 - Concluido");
        System.out.println("4 - Cancelado");
        
       int op = Integer.parseInt(sc.nextLine());

      
       // Convertendo a opção escolhida para o tipo StatusProjeto
        StatusProjeto status;

        switch (op) {
            case 1:
                status = StatusProjeto.PLANEJADO;
                break;
            case 2:
                status = StatusProjeto.EM_ANDAMENTO;
                break;
            case 3:
                status = StatusProjeto.CONCLUIDO;
                break;
            case 4:
                status = StatusProjeto.CANCELADO;
                break;
            default:
                status = StatusProjeto.PLANEJADO;
        }

        // Criando o projeto e associando ao gerente
        Projeto projeto = new Projeto(nomeProjeto, descricao, dataInicio, dataFim, status, gerente);

        // Exibindo o projeto
        projeto.exibirProjeto();
        // ---- CADASTRO DE EQUIPE ----
System.out.println("\n---- CADASTRO DE EQUIPE ----");

System.out.println("Nome da equipe:");
String nomeEquipe = sc.nextLine();

System.out.println("Descricao da equipe:");
String descEquipe = sc.nextLine();

// Criando a equipe
Equipe equipe = new Equipe(nomeEquipe, descEquipe);

// Adicionando o gerente como membro automaticamente
equipe.adicionarMembro(gerente);

// Perguntar se deseja adicionar mais membros
System.out.println("Quantos membros deseja adicionar?");
int qtd = Integer.parseInt(sc.nextLine());

// Loop para cadastrar cada membro da equipe
for (int i = 0; i < qtd; i++) {

    System.out.println("\nMembro " + (i + 1));

    System.out.println("Nome:");
    String nomeUser = sc.nextLine();

    System.out.println("CPF:");
    String cpfUser = sc.nextLine();

    System.out.println("Email:");
    String emailUser = sc.nextLine();
    
    // Escolha do perfil do usuário
    System.out.println("Escolha o perfil:");
    System.out.println("1 - Administrador");
    System.out.println("2 - Gerente");
    System.out.println("3 - Colaborador");

    int opPerfil = Integer.parseInt(sc.nextLine());

    Perfil perfil;
    
    // Convertendo a opção escolhida para o tipo Perfil
    switch (opPerfil) {
        case 1:
            perfil = Perfil.ADMINISTRADOR;
            break;
        case 2:
            perfil = Perfil.GERENTE;
            break;
        case 3:
            perfil = Perfil.COLABORADOR;
            break;
        default:
            perfil = Perfil.COLABORADOR;
    }

    System.out.println("Login:");
    String loginUser = sc.nextLine();

    System.out.println("Senha:");
    String senhaUser = sc.nextLine();

    // Criando o usuário e adicionando na equipe
    Usuario user = new Usuario(nomeUser, cpfUser, emailUser, perfil, loginUser, senhaUser);

    // Ligando a equipe ao projeto criado
    equipe.adicionarMembro(user);
}
// Vincular equipe ao projeto
equipe.adicionarProjeto(projeto);


// Exibir tudo
System.out.println("\n===== DADOS DA EQUIPE =====");
equipe.mostrarEquipe();

        sc.close();
    }
        
    }
        
    
        
        
    
    
