package dados;

public class ContatoPessoal extends Contato {
    private String endereco;

    public ContatoPessoal(String nome, String telefone, String email, String endereco) {
        super(nome, telefone, email);
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Tipo: Pessoal, " + super.toString() + ", Endereço: " + endereco;
    }
}

