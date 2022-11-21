import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        double suma = 0;
        int contador = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        do {
            String linea = sc.next().trim();
            linea = linea.replace(',', '.');

            if (linea.equals("00")) {
                sair = true;
            } else {
                double num = Double.parseDouble(linea);
                suma += num;
                contador++;
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }

        } while (sair == false);
        if(contador == 0){
            System.out.println("No hay datos");
        }else{ 
            System.out.println("Min: " + String.format("%.2f", min));
            System.out.println("Max: " + String.format("%.2f", max));
            System.out.println("Suma: " + String.format("%.2f", suma));
            System.out.println("Media: " + String.format("%.2f", suma/contador));
        }
       
        sc.close();

    }
}