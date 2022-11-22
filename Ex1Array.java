import java.util.Arrays;
import java.util.Scanner;

public class Ex1Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame o número de nombres a introducir: ");
        int i = sc.nextInt();
        String[] nomes = new String[i];

        for(int j = 0; j< nomes.length;j++){
            System.out.println("\nNome: ");
            nomes[j] = sc.next();
        }
        System.out.println("\nO array será:\n");
        listar(nomes);
        System.out.println("\nO array ordenado será:\n");
        Arrays.sort(nomes);
        listar((nomes));

        System.out.println("Introduza un nome para facer unha búsqueda de posición, se existe: ");
        int pos = Arrays.binarySearch(nomes, sc.next());
        System.out.println("O nome introducido está na posición " + pos);
        sc.close();
    }

    public static void listar(String[] nomes){
        for(String nome:nomes){
            System.out.println(nome);
        }
    }
}