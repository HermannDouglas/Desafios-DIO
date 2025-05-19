# Desafio 11 - Filtro de Produtos por Faixa de Preço

## Descrição

Você está desenvolvendo um sistema de inventário para uma loja. O sistema precisa filtrar produtos por faixa de preço. Cada produto tem um nome, categoria e preço. Crie um programa que leia os dados dos produtos e retorne a lista de produtos dentro de uma faixa de preço específica.

---

## Entrada

- Um número inteiro `n` representando a quantidade de produtos.
- Para cada produto, serão fornecidos:
  - `nome` (uma string representando o nome do produto)
  - `categoria` (uma string representando a categoria do produto)
  - `preco` (um número decimal representando o preço do produto)
- Dois números decimais `preco_min` e `preco_max` representando a faixa de preço.

---

## Saída

String contendo todos os produtos dentro da faixa de preço, cada um em uma linha no formato:  
**"Nome: Preco"**

---

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada                                                                                                                                                                      | Saída                                                               |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------- |
| 2<br>Roteador<br>Rede<br>250.00<br>Switch<br>Rede<br>400.00<br>100.00<br>300.00                                                                                              | Nome: Roteador - Preco: 250.00                                      |
| 3<br>Teclado<br>Periferico<br>150.00<br>Mouse<br>Periferico<br>80.00<br>Monitor<br>Periferico<br>900.00<br>100.00<br>200.00                                                  | Nome: Teclado - Preco: 150.00                                       |
| 4<br>Notebook<br>Computador<br>4500.00<br>Desktop<br>Computador<br>3000.00<br>Tablet<br>Dispositivo<br>2000.00<br>Smartphone<br>Dispositivo<br>3500.00<br>2500.00<br>4000.00 | Nome: Desktop - Preco: 3000.00<br>Nome: Smartphone - Preco: 3500.00 |

---
