import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("quantos jogos o time disputou? ");
        int totalJogos = entrada.nextInt();

        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;
        int pontos = 0;
        int golsMarcadosTotal = 0;
        int golsSofridosTotal = 0;

        int i = 1;

        while (i <= totalJogos) {
            System.out.println("\n--- Jogo " + i + " ---");

            System.out.print("gols do time: ");
            int golsMarcados = entrada.nextInt();

            System.out.print("gols do adversario: ");
            int golsSofridos = entrada.nextInt();

            golsMarcadosTotal += golsMarcados;
            golsSofridosTotal += golsSofridos;

            if (golsMarcados > golsSofridos) {
                vitorias++;
                pontos += 3;
                i++;
            } else if (golsMarcados == golsSofridos) {
                empates++;
                pontos += 1;
                i++;
            } else {
                derrotas++;
                i++;
            }
        }

        int saldoGols = golsMarcadosTotal - golsSofridosTotal;

        double aproveitamento = (pontos / (totalJogos * 3.0)) * 100;

        System.out.println("\nresumo da campanha:");
        System.out.println("vitorias: " + vitorias);
        System.out.println("empates: " + empates);
        System.out.println("derrotas: " + derrotas);
        System.out.println("pontos: " + pontos);
        System.out.println("saldo de gols: " + saldoGols);
        System.out.printf("pproveitamento: %.2f%%\n", aproveitamento);

        entrada.close();
    }
}

// feito pelo Renan de oliveira jussiani