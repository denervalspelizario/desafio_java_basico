import java.util.Scanner;

public class DesafioEscopoEstruturaControle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++) {
            nomes[i] = sc.nextLine();
            if (i == 2 || i == 6 || i == 8) {
                System.out.println(nomes[i]);
            }
        }
    }

}
