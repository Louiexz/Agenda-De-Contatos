package repositorio;

import dados.Contato;

public interface IAgenda {
	
	public void adicionarContato(Contato contato);
	
	public void removerContato(String nome);
	
	public Contato buscarContato(String nome);
	
	public void listarContatos();
}
