import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        String linCar = sc.next();
        char car = linCar.charAt(0);
        boolean sair = false;
        do {
            String lin = sc.next();
            if(lin.indexOf("<END>") != -1){
                lin = lin.substring(0, lin.indexOf("<END>"));
                sair = true;
            }
            for(int i = 0; i<=lin.length()-1; i++){
                if (Character.valueOf(lin.charAt(i)).compareTo(Character.valueOf(car)) ==0){
                    contador++;
                } 
            }

        } while (sair ==false);
        System.out.println(contador);
        sc.close();
    }
    
}
