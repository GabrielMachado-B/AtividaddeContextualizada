package com.exemplo.Atividade1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenciaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma cadeia de caracteres: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencia = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            frequencia.put(caracter, frequencia.getOrDefault(caracter, 0) + 1);
        }

        System.out.println("Relatório de frequência de caracteres:");
        for (Map.Entry<Character, Integer> entry : frequencia.entrySet()) {
            char caracter = entry.getKey();
            int quantidade = entry.getValue();
            System.out.println("'" + caracter + "' - " + quantidade + " vez(es)");
        }
    }
}
