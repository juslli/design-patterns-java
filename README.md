# Design Patterns em Java: Strategy

Projeto do desafio final de Padrões de Projeto (DIO), com foco no padrão **Strategy**.

## O que é o Strategy?

É um padrão que permite ter várias formas de fazer a mesma coisa e trocar entre elas sem mexer no resto do código.

## Exemplo: cálculo de frete

- `Frete`: interface (o "contrato") com o método `calcular`
- `FretePadrao`: cobra R$ 20,00 fixos
- `FreteGratis`: não cobra nada
- `Pedido`: usa qualquer `Frete` sem saber como ele calcula
- `Main`: roda o exemplo

## Como rodar

    javac *.java
    java Main

## Resultado

    Com frete padrao: 120.0
    Com frete gratis: 100.0

## Por que usar?

Para criar uma nova regra de frete, basta criar uma nova classe que implementa `Frete`. Nenhuma classe existente precisa ser alterada.
