package DesafiodeCodigos;

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // Verifique se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) { // Começa do segundo elemento
            if (partes[i].trim().equals(servico)) {
                contratado = true; // Serviço encontrado
                break; // Sai do loop
            }
        }

        // Saída do resultado
        if (contratado) {
            System.out.println("Sim"); // Serviço está contratado
        } else {
            System.out.println("Nao"); // Serviço não está contratado
        }

        scanner.close();
    }
}