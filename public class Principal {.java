public class Principal {
    import java.util.ArrayList;
import java.util.Scanner;
    public static void main(String[] args) {
        ArrayList<Canal> canais = new ArrayList<>();
        canais.add( new Canal("Globo") );
        canais.add( new Canal("SBT") );
        canais.add( new Canal("Record") );
        canais.add( new Canal("Band") );

        Tv televisao = new Tv(canais, "CUM23-05");
        int option = 0;

        System.out.println("Você ligou a TV");
        while (option != 9) {
            System.out.println("Escolha o quê deseja fazer:\n1 - Ver canal atual\n2 - Próximo canal\n3 - Canal anterior\n4 - Escolher canal\n5 - Aumentar volume\n6 - Diminuir volume\n7 - Definir volume\n8 - Ver lista de canais\n9 - Desligar");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine();
                try {
                    option = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número inteiro válido.");
                }
            }
            switch (option) {
                case 1:
                    System.out.println("Canal atual: " + televisao.mostrarCanalAtual());
                    break;
                case 2:
                    if (televisao.getCanalAtual() >= (televisao.canais.size()) - 1) {
                        System.out.println("Você já está no último canal");
                        break;
                    }
                    System.out.println("Passando para o próximo canal");
                    televisao.setCanalAtual(televisao.getCanalAtual() + 1);
                    System.out.println("Canal atual: " + televisao.mostrarCanalAtual());
                    break;
                case 3:
                    if (televisao.getCanalAtual() <= 0) {
                        System.out.println("Você já está no primeiro canal");
                        break;
                    }
                    System.out.println("Passando para o canal anterior");
                    televisao.setCanalAtual(televisao.getCanalAtual() - 1);
                    System.out.println("Canal atual: " + televisao.mostrarCanalAtual());
                    break;
                case 4:
                    System.out.print("Escolha o canal: ");
                    int canalNum = Integer.parseInt(new Scanner(System.in).nextLine());
                    if (canalNum < 0 || canalNum > televisao.canais.size()) {
                        System.out.println("Canal inválido, escolha um entre 0 a " + (televisao.canais.size()-1));
                    } else {
                        televisao.setCanalAtual(canalNum);
                        System.out.println("Canal atual: " + televisao.mostrarCanalAtual());
                    }  
                    break;
                case 5:
                    if (televisao.get_volume() >= 100) {
                        System.out.println("Volume já está no máximo");
                        break;
                    }
                    televisao.set_volume(televisao.get_volume() + 1);
                    System.out.println("Aumentando volume\nVolume atual: " + televisao.get_volume());
                    break;
                case 6:
                    if (televisao.get_volume() <= 0) {
                        System.out.println("Volume já está no mínimo");
                        break;
                    }
                    televisao.set_volume(televisao.get_volume() - 1);
                    System.out.println("Diminuindo volume\nVolume atual: " + televisao.get_volume());
                    break;
                case 7:
                    System.out.print("Escolha o volume: ");
                    int volume = Integer.parseInt(new Scanner(System.in).nextLine());
                    if (volume < 0 || volume > 100) {
                        System.out.println("Volume inválido, apenas entre 0 e 100");
                    } else {
                        televisao.set_volume(volume);
                        System.out.println("Volume atual: " + televisao.get_volume());
                    }
                    break;
                case 8:
                    System.out.println("Lista de canais:");
                    for (int i = 0; i < televisao.canais.size(); i++) {
                        System.out.println(i + " | " + televisao.canais.get(i).get_nome());
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }

    
    }
}

}