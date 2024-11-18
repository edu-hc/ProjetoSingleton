package org.sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GPS gps = GPS.getInstancia();

        System.out.println("### Sistema de GPS Simulado ###");
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar Localização");
            System.out.println("2. Redefinir Coordenadas");
            System.out.println("3. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Localização Atual: " + gps.consultarLocalizacao());
                    break;

                case 2:
                    gps.resetarCoordenadas();
                    System.out.println("Coordenadas redefinidas para o padrão.");
                    break;

                case 3:
                    System.out.println("Encerrando o sistema de GPS. Até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
