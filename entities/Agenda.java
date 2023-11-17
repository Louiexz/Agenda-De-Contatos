package entities;

import java.util.ArrayList;
import java.util.List;


class Agenda implements IAgenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equals(nome));
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}

