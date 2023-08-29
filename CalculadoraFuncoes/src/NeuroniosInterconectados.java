import java.util.Scanner;

public class NeuroniosInterconectados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a entrada para o primeiro neurônio
        System.out.println("Digite a entrada para o primeiro neurônio: ");
        double entradaNeuronio1 = scanner.nextDouble();

        // Calcula a saída do primeiro neurônio
        double saidaNeuronio1 = funcaoAtivacao(entradaNeuronio1);

        // Calcula a saída do segundo neurônio usando a saída do primeiro como entrada
        double saidaNeuronio2 = funcaoAtivacao(saidaNeuronio1);

        System.out.println("Saída do primeiro neurônio: " + saidaNeuronio1);
        System.out.println("Saída do segundo neurônio: " + saidaNeuronio2);
    }

    // Função de ativação simples (exemplo)
    public static double funcaoAtivacao(double entrada) {
        return 1 / (1 + Math.exp(-entrada));
    }
}