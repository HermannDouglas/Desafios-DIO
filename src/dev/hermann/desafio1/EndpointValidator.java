package dev.hermann.desafio1;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EndpointValidator {
    public static String validateEndpoint(String endpoint) {
        // Verifique se o endpoint fornecido segue o formato padrão de endpoint de API:
        Pattern pattern = Pattern.compile("^/api/\\w+(/\\w+)*$");
        if (pattern.matcher(endpoint).matches()) {
            return "Endpoint valido.";
        } else {
            return "Endpoint invalido.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
    }
}