package entities;

public interface IAgenda {
	public void adicionaContato(Contato contato);

	public void removerContato(String nome);

	public Contato buscarContato(String nome);

	public void listarContatos();
}