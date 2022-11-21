import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        do{
            String[] array = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(array[0]);
            int num2 = Integer.parseInt(array[1]);
            int dif = num2-num1;
            int resultado= 0;
            
       
            if(dif <0){
                dif = -dif;
            }
            if(num1 == 0 && num2 ==0){
                sair = true;
            }
            else if(num1 > num2 && dif >49){
                num2 +=99;
                resultado = num2-num1;
                System.out.println(resultado);

            }else if(num2>num1 && dif >49){
                num1+=99;
                resultado = num1-num2;
                System.out.println(resultado);

            }else if(dif == 0){

            }else if(num1 >num2){
                resultado = num1-num2;
                System.out.println(resultado);
            }else if(num2>num1){
                resultado = num2-num1;
                System.out.println(resultado);
            }
            
        }while(sair != true);
    }
    
}
