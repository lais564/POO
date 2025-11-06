import java.util.ArrayList;

public class agenda2 {
    private ArrayList<Contato> contato = new ArrayList<>();

    public void armazenarContato(Contato contato) {
        this.contato.add(contato);
    }

    public void removerContato(Contato contato) {
        this.contato.remove(contato);
    }

    public int encontrarContato(String nome) {
        for (int i = 0; i < contato.size(); i++) {
            if (contato.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o contato não for encontrado
    }

    public void imprimirContatos() {
        for (Contato contato : contato) { // para cada contato na lista de contatos
            contato.imprimeInformacoes();
            System.out.println("");
        }
        System.out.println("======FIM======");
    }

    public void imprimeContato(int posicao){
        this.contato.get(posicao).imprimeInformacoes();
    }
}