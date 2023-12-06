package negocio;

import java.util.Scanner;

import dados.Contato;
import dados.ContatoPessoal;
import dados.ContatoProfissional;
import dados.ContatoServico;
import repositorio.Agenda;

public class negocioAgenda {
	
	public static void adicionarContatoPessoal(Scanner scanner, Agenda agenda) {
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
        System.out.println("\nContato pessoal adicionado.");
    }

    public static void adicionarContatoProfissional(Scanner scanner, Agenda agenda) {
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
        System.out.println("\nContato profissional adicionado.");
    }

    public static void adicionarContatoServico(Scanner scanner, Agenda agenda) {
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
        System.out.println("\nContato de serviço adicionado.");
    }
    
    public static void removerContato (Scanner scanner, Agenda agenda ) {
    	
        System.out.print("Nome do contato a ser removido: ");
        String nomeRemover = scanner.nextLine();
        agenda.removerContato(nomeRemover);
        System.out.println("\nContato removido.");
    	
    }
    
    public static void buscarContato (Scanner scanner, Agenda agenda) {
    	
    	System.out.print("Nome do contato a ser buscado: ");
        String nomeBuscar = scanner.nextLine();
        Contato contatoEncontrado = agenda.buscarContato(nomeBuscar);
        if (contatoEncontrado != null) {
            System.out.println("\n\nContato encontrado: " + contatoEncontrado);
        } else {
            System.out.println("\n\nContato não encontrado.");
        }
    	
    }
    
    public static void listarContato (Scanner scanner, Agenda agenda) {
    	
    	System.out.println("\nLista de contatos:\n");
        agenda.listarContatos();
    }

}
