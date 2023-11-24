package entities;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar contato pessoal");
            System.out.println("2. Adicionar contato profissional");
            System.out.println("3. Adicionar contato de serviço");
            System.out.println("4. Remover contato");
            System.out.println("5. Buscar contato");
            System.out.println("6. Listar contatos");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarContatoPessoal(scanner, agenda);
                    break;
                case 2:
                    adicionarContatoProfissional(scanner, agenda);
                    break;
                case 3:
                    adicionarContatoServico(scanner, agenda);
                    break;
                case 4:
                    System.out.print("Nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    System.out.println("Contato removido.");
                    break;
                case 5:
                    System.out.print("Nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoEncontrado = agenda.buscarContato(nomeBuscar);
                    if (contatoEncontrado != null) {
                        System.out.println("Contato encontrado: " + contatoEncontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Lista de contatos:");
                    agenda.listarContatos();
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarContatoPessoal(Scanner scanner, Agenda agenda) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        ContatoPessoal novoContato = new ContatoPessoal(nome, telefone, email, endereco);
        agenda.adicionarContato(novoContato);
        System.out.println("Contato pessoal adicionado.");
    }

    private static void adicionarContatoProfissional(Scanner scanner, Agenda agenda) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Empresa: ");
        String empresa = scanner.nextLine();
        ContatoProfissional novoContato = new ContatoProfissional(nome, telefone, email, empresa);
        agenda.adicionarContato(novoContato);
        System.out.println("Contato profissional adicionado.");
    }

    private static void adicionarContatoServico(Scanner scanner, Agenda agenda) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        ContatoServico novoContato = new ContatoServico(nome, telefone, email, categoria);
        agenda.adicionarContato(novoContato);
        System.out.println("Contato de serviço adicionado.");
    }
}