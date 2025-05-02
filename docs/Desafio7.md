# Desafio 7 - Gerenciamento de Funcionários

## Descrição

Você está desenvolvendo um sistema de banco de dados para gerenciar funcionários de uma empresa. Cada funcionário tem um **ID**, **nome** e **cargo**. Crie um programa que adicione funcionários a uma "tabela" (lista) e liste todos os funcionários ordenados pelo **ID**.

## Entrada

1. Um número inteiro `n` representando a quantidade de funcionários.
2. Para cada funcionário, serão fornecidos dois dados:
   - **nome**: uma string representando o nome do funcionário.
   - **cargo**: uma string representando o cargo do funcionário.

## Saída

Uma string contendo todos os funcionários listados em ordem crescente de **ID**, cada um em uma linha no formato:

```
"ID: Nome - Cargo"
```

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada                                                                   | Saída                                                                      |
| ------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| 2<br>Mariana<br>Desenvolvedora<br>Samuel<br>Analista                      | 1: Mariana - Desenvolvedora<br>2: Samuel - Analista                        |
| 3<br>Simone<br>Gerente<br>Victor<br>Desenvolvedor<br>Ana<br>Analista      | 1: Simone - Gerente<br>2: Victor - Desenvolvedor<br>3: Ana - Analista      |
| 3<br>Patricia<br>Coordenadora<br>Fabio<br>Arquiteto<br>Marcelo<br>Gerente | 1: Patricia - Coordenadora<br>2: Fabio - Arquiteto<br>3: Marcelo - Gerente |
