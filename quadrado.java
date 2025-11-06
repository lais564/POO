public class quadrado {
     
        /*
         Toda classe terá atributos e métodos
         atributos são as características(variável)
         método são as ações (funções)
         Classificamos esses métodos de acordo com as suas características:
         Método Construtor: Quando for instanciado um novo objeto, ele será 'construído' conforme definido no método construtor
         Método get e set:
         get(pegar) -> utilizado para ver qual o valor atual do atributo.
         set (colocar) -> insere/altera o valor do atributo
         Métodos próprios: Métodos que criamos para dar mais ações para a nossa classe.
        */
        //Atributos da classe quadrado: 
        double lado;
        double area;
        double perimetro;

        //métodos
        //métodos construtor:
        public quadrado(double lado){
            this.lado = lado;
            calculararea();
        }
        //métodos próprios
        //calcular separado
        public void calculararea(){
            this.area = this.lado * this.lado;
        }
        public double calcularconstrutor(){
            return this.lado * this.lado;
        }
        public void calcularperimetro(){
            this.perimetro = this.lado * 4;
        }
        public void imprimir(){
            System.out.println("lado: " + this.lado);
            System.out.println("area: " + this.area);
            System.out.println("perimetro: " + this.perimetro);
       }
    }
