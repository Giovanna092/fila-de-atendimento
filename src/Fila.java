import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int p;
        System.out.println("Digite o numero de pessoas que deseja adicionar na fila");
        p = leia.nextInt();
        String[] nomes = new String[p];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome");
            nomes[i] = leia.next();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]+ " - esta na posicao: "+ (i+1));
        }


        leia.close();
    }
}
