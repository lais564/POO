import java.util.ArrayList;

public class tv {
    private boolean ligada;
    private int volume;
    private ArrayList<canal> canal;
    private int canalAtual;
    private int numeroTV;

    public tv(int numerotv) {
        this.numeroTV= numerotv;
        this.ligada = true;
        this.volume = 10; 
        this.canal = new ArrayList<>();
        this.canalAtual = 0;
    }

    public void adicionarCanal(canal c) {
        canal.add(c);
    }

    public void ligar() {
        ligada = true;
        System.out.println("TV " + numeroTV + " ligada!");
    }

    public void desligada() {
        ligada = false;
        System.out.println("TV " + numeroTV + " desligada!");
    }

    public void aumentarVolume() {
        if(ligada && volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if(ligada && volume > 0) {
            volume--;
        }
    }

    public void proximoCanal() {
        if(ligada && !canal.isEmpty()) {
            canalAtual = (canalAtual + 1) % canal.size();
        }
    }

    public void canalAnterior() {
        if(ligada && !canal.isEmpty()) {
            canalAtual = (canalAtual - 1 + canal.size()) % canal.size();
        }
    }

    public void escolhercanal(int numero) {
        if(ligada) {
            for(int i=0; i<canal.size(); i++) {
                if(canal.get(i).getnumero() == numero) {
                    canalAtual = i;
                    return;
                }
            }
            System.out.println("Canal não encontrado!");
        }
    }

    public void listarCanais() {
        for(canal c : canal) {
            System.out.println(c);
        }
    }

    public void informacoesTV() {
        if(ligada) {
            System.out.println("TV: " + numeroTV);
            System.out.println("Volume: " + volume);
            System.out.println("Canal atual: " + canal.get(canalAtual));
        } else {
            System.out.println("TV está desligada.");
        }
    }
}

