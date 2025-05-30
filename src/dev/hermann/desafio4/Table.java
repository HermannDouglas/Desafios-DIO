package dev.hermann.desafio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Table {

    private Map<Integer, String> table;

    public Table() {
        this.table = new HashMap<>();
    }

    // Método insert para adicionar elementos à tabela:
    public void insert(int id, String name) {
        if (table.containsKey(id)) {
            System.out.println("ID já existe. Atualizando o nome.");
        }
        table.put(id, name);
    }

    public void display() {
        for (String name : table.values()) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            int id = scanner.nextInt();
            scanner.nextLine();

            String name = scanner.nextLine();
            table.insert(id, name);
        }

        table.display();
        scanner.close();
    }
}