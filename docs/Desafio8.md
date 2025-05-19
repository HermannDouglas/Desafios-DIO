# Desafio 8 - Consulta de Funcionários por Departamento

## Descrição

Você está desenvolvendo um sistema de recursos humanos para uma empresa. O sistema precisa consultar os funcionários de um determinado departamento. Cada funcionário tem um nome, departamento e salário. Crie um programa que leia os dados dos funcionários e retorne a lista de funcionários de um departamento específico.

## Entrada

- Um número inteiro `n` representando a quantidade de funcionários.
- Para cada funcionário, serão fornecidos:
  - `nome`: uma string representando o nome do funcionário.
  - `departamento`: uma string representando o departamento do funcionário.
  - `salario`: um número decimal representando o salário do funcionário.
- Uma string `departamento_consulta` representando o departamento a ser consultado.

## Saída

Uma `String` contendo todos os funcionários do departamento consultado, cada um em uma linha no formato:

```
Nome: <nome> - Salario: <salario>
```

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada**                                                                                                                              | **Saída**                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| 2<br> Marcos<br> TI<br> 2500.50<br> Debora<br> RH<br> 3000.00<br> RH                                                                     | Nome: Debora - Salario: 3000.00                                    |
| 3<br> Alice<br> Vendas<br> 3500.00<br> Bob<br> TI<br> 2800.00<br> Carlos<br> Vendas<br> 3200.00<br> Vendas                               | Nome: Alice - Salario: 3500.00<br> Nome: Carlos - Salario: 3200.00 |
| 4<br> Ana<br> TI<br> 3000.00<br> Pedro<br> Marketing<br> 2500.00<br> Maria<br> TI<br> 2600.00<br> Joao<br> Financeiro<br> 3200.00<br> TI | Nome: Ana - Salario: 3000.00<br> Nome: Maria - Salario: 2600.00    |
