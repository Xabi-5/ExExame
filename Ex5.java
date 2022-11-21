import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primeiro = false;
        do {
            String[] array = sc.nextLine().split(" ");
            int len = array.length;
            int pisos = 0;
            int prevNum = 0, num;
            boolean sair = false;
            
            do {
                for (int i = 0; i <= array.length - 1; i++) {
                    if (i > 0) {
                        num = Integer.parseInt(array[i]);
                        if (num < 0) {
                            sair = true;
                        } else {
                            int resta = num - prevNum;
                            if (resta < 0) {
                                resta = -resta;
                            }
                            pisos += resta;
                            prevNum = num;
                        }

                    } else if (i == 0) {
                        prevNum = Integer.parseInt(array[0]);
                        if (prevNum <0){
                            sair = true;
                            primeiro = true;
                        }
                    }
                }
            } while (sair != true);
            if(primeiro == false){
                System.out.println(pisos);
            }
            
                
        } while (primeiro != true);
        
        
    }
}
