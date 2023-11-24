package repositorio;

import java.util.ArrayList;
import java.util.List;
import dados.Contato;


<<<<<<<< HEAD:Agenda de Contatos/src/repositorio/Agenda.java
public class Agenda implements IAgenda {
========
class Agenda {
>>>>>>>> 71e58d33b6e3d048c96fd511177c3d1eb94644f6:Agenda de Contatos/src/entities/Agenda.java
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

