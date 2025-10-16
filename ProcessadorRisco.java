//import java.util.Scanner;

public class ProcessadorRisco {
    public static void main(String[] args) {
        //java.util.Scanner scanner = new java.util.Scanner(System.in);

        int notasRisco[] = {15,20,25,30,35,40,45,50,55,60,65,70,75,80,95};
        int somaPonderada = 0, somaPesos = 0, peso =0;
        double mediaPonderada = 0.0;
        int contadorOtimistas = 0, contadorAlarmantes = 0;

        for (int i = 0; i < notasRisco.length; i++) {
            if (i <= 4) {
                peso = 3;
            } else {
                peso = 1;
            }
            somaPonderada = somaPonderada + notasRisco[i] * peso;
            somaPesos = somaPesos + peso;
        }

        mediaPonderada = (double) somaPonderada / somaPesos;
        
        for (int nota : notasRisco) {   
            if (nota <= 20) {
                contadorOtimistas++;
            }
            if (nota >= 90) {
                contadorAlarmantes++;
            }
        }

        System.out.println("Processamento da Análise de Risco:");
        System.out.println("-----------------------------------");
        System.out.printf("Média Ponderada das Notas de Risco: %.2f\n", mediaPonderada);
        System.out.println("Número de analistas Otimistas(Nota <= 20): " + contadorOtimistas);
        System.out.println("Número de analistas Alarmantes(Nota >= 90): " + contadorAlarmantes);
        System.out.print("Parecer final: ");


        if (mediaPonderada > 70) {
            System.out.println("Alto Risco: Venda ou reajuste de portfólio recomendado.");
        } else if (mediaPonderada >= 40 && mediaPonderada <= 70) {
            System.out.println("Risco Moderado: Acompanhar de perto, mas manter os ativos.");
        } else {
            System.out.println("Baixo Risco: Excelente momento para capitalização.");
        }
        
        //scanner.close();


    }
        
}
