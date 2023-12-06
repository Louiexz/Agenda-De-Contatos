package dados;

public class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String nome, String telefone, String email, String empresa) {
        super(nome, telefone, email);
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Tipo: Profissional, " + super.toString() + ", Empresa: " + empresa;
    }
}