package dev.hermann.desafio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Table {

    private Map<Integer, String> table;

    public Table() {
        this.table = new HashMap<>();
        // Inserindo dados para exemplo
        table.put(1, "Alice");
        table.put(2, "Bob");
        table.put(3, "Charlie");
        table.put(4, "Debora");
        table.put(5, "Eduardo");
        table.put(6, "Fernanda");
    }

    public void insert(int key, String value) {
        table.put(key, value);
    }

    // Método update:
    // DICA: O método update deve verificar se a chave (key) existe na tabela.
    // Se existir, atualize o valor associado a essa chave com newValue.
    // Caso contrário, exiba a mensagem "ID nao encontrado.".
    // Método para atualizar um elemento da tabela
    public void update(int key, String newValue) {
        if (table.containsKey(key)) {
            table.put(key, newValue);
        } else {
            System.out.println("ID nao encontrado.");
        }
    }

    public void display() {
        for (String name : table.values()) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(scanner.nextLine().trim());
            String newName = scanner.nextLine().trim();
            table.update(id, newName);
        }

        table.display();
        scanner.close();
    }
}