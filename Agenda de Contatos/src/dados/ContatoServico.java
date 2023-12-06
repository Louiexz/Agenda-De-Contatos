package dados;

public class ContatoServico extends Contato {
    private String categoria;

    public ContatoServico(String nome, String telefone, String email, String categoria) {
        super(nome, telefone, email);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Tipo: Serviço, " + super.toString() + ", Categoria: " + categoria;
    }
}