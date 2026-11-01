import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int intento = 0;
        int intentosRealizados = 0;
        
        System.out.println("¡Bienvenido al juego de Adivina el Numero!");
        System.out.println("He pensado un numero entre 1 y 100. ¿Puedes adivinarlo?");
        
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            intentosRealizados++;
            
            if (intento < numeroSecreto) {
                System.out.println("Muy bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el numero en " + intentosRealizados + " intentos.");
            }
        }
        scanner.close();
    }
}