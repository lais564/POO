public class Contato {

    //atributos
        private String _nome;
        private String _email;
        private String _telefone;

    public Contato(String __nome, String _email, String _telefone) {
        this._nome = __nome;
        this._email = _email;
        this._telefone = _telefone;
    }



    public String getNome() {
        return _nome;
    }

    public void setNome(String __nome) {
        this._nome = __nome;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getTelefone() {
        return _telefone;
    }

    public void setTelefone(String _telefone) {
        this._telefone = _telefone;
    }

    public void imprimeInformacoes(){
        System.out.println("_nome: " + this._nome);
        System.out.println("_email: " + this._email);
        System.out.println("_telefone: " + this._telefone);
    }
            
        }
        
