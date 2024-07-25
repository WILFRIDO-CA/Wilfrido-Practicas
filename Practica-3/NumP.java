
import java.util.Scanner;

public class NumP{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int A;
        System.out.println("Calcular si un Numero es Primo \n");
        System.out.println("Ingrese el numero para calcular: ");
    
        A= scanner.nextInt();

        if(Primo(A)){
            System.out.println("El Numero "+A+" es Primo");
        }else{
            System.out.println("El Numero "+A+" NO es Primo");
        }
        scanner.close();
    }
    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

