package dev.hermann.desafio9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizacaoSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios.add(new Funcionario(nome, departamento, salario));
        }

        double aumento = scanner.nextDouble();

        for (int i = 0; i < funcionarios.size(); i++) {
            // Código para atualizar os salários dos funcionários completo
            // 1. Obtenha o funcionário atual da lista.
            // 2. Calcule o novo salário: novoSalario = salario * (1 + aumento / 100).
            // 3. Imprima o nome e o novo salário do funcionário no formato: "Nome: X - Novo // Salario: Y".
            // 4. Certifique-se de que o novo salário seja impresso com duas casas decimais.
            Funcionario funcionario = funcionarios.get(i);
            double novoSalario = funcionario.salario * (1 + aumento / 100);
            System.out.printf("Nome: %s - Novo Salario: %.2f%n", funcionario.nome, novoSalario);

        }

        scanner.close();
    }
}

class Funcionario {
    String nome;
    String departamento;
    double salario;

    Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
}