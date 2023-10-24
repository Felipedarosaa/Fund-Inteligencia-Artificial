import java.util.Scanner;

public class SistemaEspecialista {
    public static void main(String[] args) {

        // Leitor das variáveis
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Aqui irei ajudar você a encontrar o curso ideal para você");

        System.out.println("------------------------");

        System.out.println("Primeiramente, qual o seu nome? ");
        String name = scanner.nextLine();

        // Coleta de informações do usuário
        System.out.print("Informe o seu nível de interesse em exatas (de 1 a 5): ");
        int interesseExatas = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o seu nível de interesse em humanas (de 1 a 5): ");
        int interesseHumanas = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o seu nível de interesse em biológicas (de 1 a 5): ");
        int interesseBiologicas = Integer.parseInt(scanner.nextLine());

        System.out.print("Informe o seu nível de disponibilidade para estudar (de 1 a 5): ");
        int disponibilidadeEstudo = Integer.parseInt(scanner.nextLine());

        // Encontra o curso ideal com base nas respostas do usuário
        String cursoIdeal = encontrarCursoIdeal(interesseExatas, interesseHumanas, interesseBiologicas, disponibilidadeEstudo);

        // Exibe o resultado
        System.out.println("Com base nas suas respostas, o curso ideal para você " + name + " é: " + cursoIdeal);
    }

    public static String encontrarCursoIdeal(int interesseExatas, int interesseHumanas, int interesseBiologicas, int disponibilidadeEstudo) {
        // Verifica as condições para recomendar um curso
        if (interesseExatas >= 4 && disponibilidadeEstudo >= 3) {
            return "ENGENHARIA"; // Curso recomendado: Engenharia
        } else if (interesseExatas >= 3 && disponibilidadeEstudo >= 2) {
            return "ADMINISTRAÇÃO"; // Curso recomendado: Administração
        } else if (interesseBiologicas >= 4 && disponibilidadeEstudo >= 4) {
            return "MEDICINA"; // Curso recomendado: Medicina
        } else if (interesseBiologicas >= 1 && interesseBiologicas < 4 && disponibilidadeEstudo >= 2) {
            return "ENFERMAGEM"; // Curso recomendado: Enfermagem
        } else if (interesseHumanas >= 4 && disponibilidadeEstudo >= 4) {
            return "DIREITO"; // Curso recomendado: Direito
        } else if (interesseHumanas >= 3 && disponibilidadeEstudo < 4) {
            return "PSICOLOGIA"; // Curso recomendado: Psicologia
        } else {
            return "Não foi possível identificar o curso ideal para você!"; // Nenhum curso encontrado
        }
    }
}


