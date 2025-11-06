public class atv {
   
   public static void main(String[] args) {
   tv tv = new tv(1);

        tv.ligar();
        tv.informacoesTV();
        
        tv.aumentarVolume();
        tv.proximoCanal();
        tv.informacoesTV();

        tv.escolhercanal(6);
        tv.informacoesTV();

        tv.listarCanais();

        tv.desligada();
      
   }
}
