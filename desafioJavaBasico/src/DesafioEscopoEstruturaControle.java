import java.util.Scanner;

public class DesafioEscopoEstruturaControle {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema
        for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();
            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) {
                System.out.println("Aniquilacao mutua");
            } else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("ataque")) {
                System.out.println("Aniquilacao mutua");
            } else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) {
                System.out.println("Ambos venceram");
            } else if (jogador2.equalsIgnoreCase("papel") && jogador1.equalsIgnoreCase("papel")) {
                System.out.println("Ambos venceram");
            } else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) {
                System.out.println("Jogador 1 venceu");
            } else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) {
                System.out.println("Jogador 2 venceu");
            } else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) {
                System.out.println("Jogador 1 venceu");
            } else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque")) {
                System.out.println("Jogador 2 venceu");
            } else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) {
                System.out.println("Sem ganhador");
            } else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque")) {
                System.out.println("Jogador 2 venceu");
            } else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) {
                System.out.println("Jogador 1 venceu");
            }
        }
        leitor.close();


    /*
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String[] respostas = new String[N]; // array de string
        String jogador1, jogador2;
        for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();
            if (jogador1.equals("ataque") && jogador2.equals("ataque")) {
                respostas[i] = "Aniquilacao mutua";
            } else if (jogador1.equals("papel") && jogador2.equals("papel")){
                respostas[i] = "Ambos venceram";
            }else if (jogador2.equals("papel") && jogador1.equals("papel")){
            respostas[i] = "Ambos venceram";
             }else if(jogador1.equals("pedra")&&jogador2.equals("papel")){
            respostas[i]="Jogador 1 venceu";

            }else if (jogador1.equals("papel") && jogador2.equals("pedra")) {
                respostas[i] = "Jogador 2 venceu";

            }else if (jogador1.equals("ataque") && jogador2.equals("papel")) {
                respostas[i] = "Jogador 1 venceu";

            }else if (jogador1.equals("papel") && jogador2.equals("ataque")) {
                respostas[i] = "Jogador 2 venceu";

            }else if (jogador1.equals("pedra") && jogador2.equals("pedra")) {
                respostas[i] = "Sem ganhador";

            }else if (jogador1.equals("pedra") && jogador2.equals("ataque")) {
                respostas[i] = "Jogador 2 venceu";

            }else if (jogador1.equals("ataque") && jogador2.equals("pedra")) {
                respostas[i] = "Jogador 1 venceu";
            }
        }

        System.out.println(respostas[0]);
        for (int i = 0; i < respostas.length ; i++) {
            System.out.println(respostas[i]);
        }
        leitor.close(); */
    }

}

