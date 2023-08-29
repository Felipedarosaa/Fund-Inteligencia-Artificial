import java.util.Scanner;

public class NeuroniosInterconectadosNEntradas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de neurônios: ");
        int numNeuronios = scanner.nextInt();

        double[] entradas = new double[numNeuronios];
        for (int i = 0; i < numNeuronios; i++) {
            System.out.println("Digite a entrada para o neurônio " + (i + 1) + ": ");
            entradas[i] = scanner.nextDouble();
        }

        double[] saidas = new double[numNeuronios];

        for (int i = 0; i < numNeuronios; i++) {
            if (i == 0) {
                // Para o primeiro neurônio, a entrada é a entrada do sistema
                saidas[i] = funcaoAtivacao(entradas[i]);
            } else {
                // Para os neurônios subsequentes, a entrada é a saída do neurônio anterior
                saidas[i] = funcaoAtivacao(saidas[i - 1]);
            }
        }

        for (int i = 0; i < numNeuronios; i++) {
            System.out.println("Saída do neurônio " + (i + 1) + ": " + saidas[i]);
        }
    }

    // Função de ativação simples (exemplo)
    public static double funcaoAtivacao(double entrada) {
        return 1 / (1 + Math.exp(-entrada));
    }
}