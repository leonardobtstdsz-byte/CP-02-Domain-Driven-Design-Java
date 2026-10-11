# Inventario — Checkpoint 2

Disciplina: Domain Driven Design - Java  
Professor: Carlos Eduardo Machado de Oliveira  
Linguagem: Java 17 ou superior

## Objetivo

Desenvolver um programa de inventário para cadastrar produtos, consultar seus dados, calcular o valor do estoque e indicar se cada produto está ativo ou descontinuado.

## Integrantes

- Leonardo Batista de Souza
- Nome do integrante 2
- Nome do integrante 3
- Nome do integrante 4
- Nome do integrante 5

Substitua os nomes de exemplo pelos integrantes reais do grupo.

## Produtos de exemplo

| Número do item | Nome do produto | Preço unitário | Quantidade |
|---:|---|---:|---:|
| 101 | CD Jazz Classics | R$ 34,90 | 20 |
| 102 | DVD Documentário Natureza | R$ 45,50 | 12 |
| 103 | Software Editor de Imagens | R$ 129,90 | 8 |
| 104 | Livro Algoritmos em Java | R$ 79,90 | 15 |
| 105 | Produto criado pelo construtor padrão | R$ 0,00 | 0 |
| 106 | Produto criado pelo construtor padrão | R$ 0,00 | 0 |

## Tipos de dados utilizados

| Atributo | Tipo Java | Justificativa |
|---|---|---|
| Número do item | `int` | Armazena o identificador numérico do produto |
| Nome do produto | `String` | Armazena o texto do nome |
| Quantidade em estoque | `int` | Armazena unidades inteiras |
| Preço unitário | `double` | Armazena valores com casas decimais |
| Ativo | `boolean` | Indica se o produto está ativo |

## Estrutura do projeto

- `src/Produto.java`: classe que representa os produtos e seus métodos.
- `src/ProductTester.java`: classe principal, responsável pela execução e pela interação com o usuário.

## Funcionalidades

- Construtor padrão e construtor com parâmetros.
- Getters e setters dos atributos.
- Exibição dos dados com `toString()`.
- Identificação de produtos ativos e descontinuados.
- Cálculo do valor total do estoque.
- Cadastro de produtos por entrada do usuário.
- Validação da quantidade de produtos adicionais.
- Armazenamento de produtos em um array unidimensional.
- Exibição dos elementos do array com `for-each`.

## Como compilar e executar

Com o terminal aberto na raiz do projeto, execute:

```bash
mkdir -p out
javac -d out src/Produto.java src/ProductTester.java
java -cp out ProductTester
