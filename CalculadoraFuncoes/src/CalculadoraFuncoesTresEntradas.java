import java.util.Scanner;

public class CalculadoraFuncoesTresEntradas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os três pesos informados pelo usuário
        System.out.println("Digite o primeiro peso: ");
        double peso1 = scanner.nextDouble();

        System.out.println("Digite o segundo peso: ");
        double peso2 = scanner.nextDouble();

        System.out.println("Digite o terceiro peso: ");
        double peso3 = scanner.nextDouble();

        // Solicita que o usuário escolha a função
        System.out.println("Escolha a função (1 - Limite Rápido, 2 - Função Rampa, 3 - Função Sigmoide): ");
        int escolha = scanner.nextInt();

        double saida = 0.0;

        // Verifica a escolha do usuário e calcula a saída usando a função apropriada
        switch (escolha) {
            case 1:
                saida = limiteRapido(peso1, peso2, peso3);
                break;
            case 2:
                saida = funcaoRampa(peso1, peso2, peso3);
                break;
            case 3:
                saida = funcaoSigmoide(peso1, peso2, peso3);
                break;
            default:
                System.out.println("Escolha inválida");
                System.exit(0);
        }

        // Exibe a saída calculada
        System.out.println("Saída: " + saida);
    }

    // Implementação da função Limite Rápido para três entradas
    public static double limiteRapido(double peso1, double peso2, double peso3) {
        double somaPesos = peso1 + peso2 + peso3;
        return (somaPesos >= 0) ? 1 : -1;
    }

    // Implementação da função Função Rampa para três entradas
    public static double funcaoRampa(double peso1, double peso2, double peso3) {
        double somaPesos = peso1 + peso2 + peso3;
        if (somaPesos <= -1) {
            return -1;
        } else if (somaPesos >= 1) {
            return 1;
        } else {
            return somaPesos;
        }
    }

    // Implementação da função Função Sigmoide para três entradas
    public static double funcaoSigmoide(double peso1, double peso2, double peso3) {
        double somaPesos = peso1 + peso2 + peso3;
        return 1 / (1 + Math.exp(-somaPesos));
    }
}