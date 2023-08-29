public class SimpleNeuralNetwork {
    private double[] weights; // Pesos sinápticos da rede
    private final double learningRate = 1; // Taxa de aprendizado fixa

    public SimpleNeuralNetwork() {
        weights = new double[]{-1, -1}; // Inicialização dos pesos sinápticos com valores padrão
    }

    // Definição da função de transferência (ativação) simplificada
    private double transferFunction(double value) {
        if (value > 0) return 1; // Retorna 1 se o valor for positivo
        return 0; // Caso contrário, retorna 0
    }

    // Função de feedforward: processamento da entrada para gerar uma saída
    public double feedforward(double[] inputs) {
        double sum = 0; // Inicializa a soma ponderada
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i] * inputs[i]; // Soma ponderada dos valores de entrada multiplicados pelos pesos
        }
        return transferFunction(sum); // Retorna a saída da função de transferência (ativação)
    }

    // Treinamento usando a regra delta
    public void train(double[][] inputDataSet, double[] desiredOutputs) {
        for (int epoch = 0; epoch < 1000; epoch++) { // Realiza 1000 iterações de treinamento (épocas)
            for (int i = 0; i < inputDataSet.length; i++) {
                double calculatedOutput = feedforward(inputDataSet[i]); // Calcula a saída da rede neural
                double error = desiredOutputs[i] - calculatedOutput; // Calcula o erro entre a saída desejada e calculada
                for (int j = 0; j < weights.length; j++) {
                    weights[j] += learningRate * error * inputDataSet[i][j]; // Atualiza os pesos sinápticos usando a regra delta
                }
            }
        }
    }

    public static void main(String[] args) {
        double[][] inputs = {
                {1, 1},
                {1, 0},
                {0, 1},
                {0, 0}
        };

        double[] outputs = {
                1,
                1,
                0,
                0
        };

        SimpleNeuralNetwork snn = new SimpleNeuralNetwork(); // Criação da instância da rede neural
        snn.train(inputs, outputs); // Treinamento da rede neural usando os dados de entrada e saída desejada

        // Teste da rede neural treinada
        for (double[] input : inputs) {
            System.out.println(snn.feedforward(input)); // Executa o processo de feedforward para cada entrada e imprime a saída correspondente
        }
    }
}