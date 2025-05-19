# Desafio 10 - Consulta de Produtos em Estoque

## Descrição

Você está desenvolvendo um sistema básico de gerenciamento de inventário para uma loja. No sistema, os produtos e suas quantidades são armazenados em um `HashMap`. Você precisa criar uma função que, dado o nome de um produto digitado pelo usuário, verifique a quantidade disponível em estoque e retorne uma mensagem apropriada.

A função deve:

1. Receber o nome de um produto do usuário.
2. Consultar um `HashMap` de produtos com suas quantidades.
3. Se o produto estiver no estoque e a quantidade for maior que zero, retornar `"Produto disponivel: X em estoque."`, onde X é a quantidade em estoque.
4. Se o produto estiver no estoque, mas a quantidade for zero, retornar `"Produto indisponivel."`.
5. Se o produto não estiver no estoque, retornar `"Produto nao encontrado."`.

## Entrada

`String`: Nome do produto.

## Saída

`String`: `"Produto disponivel: X em estoque."`, `"Produto indisponivel."` ou `"Produto nao encontrado."`.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada  | Saída                              |
| -------- | ---------------------------------- |
| Switch   | Produto disponivel: 10 em estoque. |
| Servidor | Produto disponivel: 5 em estoque.  |
| Monitor  | Produto nao encontrado.            |
