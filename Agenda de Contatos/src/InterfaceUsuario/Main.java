package InterfaceUsuario;
import java.util.Scanner;
import repositorio.Agenda;
import negocio.negocioAgenda;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\nOpções:\n");
            System.out.println("1. Adicionar contato pessoal");
            System.out.println("2. Adicionar contato profissional");
            System.out.println("3. Adicionar contato de serviço");
            System.out.println("4. Remover contato");
            System.out.println("5. Buscar contato");
            System.out.println("6. Listar contatos");
            System.out.println("7. Sair\n");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("\n");

            switch (opcao) {
                case 1:
                    negocioAgenda.adicionarContatoPessoal(scanner, agenda);
                    break;
                case 2:
                    negocioAgenda.adicionarContatoProfissional(scanner, agenda);
                    break;
                case 3:
                	negocioAgenda.adicionarContatoServico(scanner, agenda);
                    break;
                case 4:
                	negocioAgenda.removerContato(scanner, agenda); 
                    break;
                case 5:
                	negocioAgenda.buscarContato(scanner, agenda);
                    break;
                case 6:
                    negocioAgenda.listarContato(scanner, agenda);
                    break;
                case 7:
                    System.out.println("\n\nSaindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    
}