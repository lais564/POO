public class canal {

    int numero;
    String nome;

    public canal(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

   public int getnumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }
}

