# Árvore Trie para Armazenamento de Palavras

Este projeto tem como objetivo representar palavras por meio de uma estrutura de árvore multiway, utilizando a lógica da Árvore Trie, onde cada caractere ocupa um nó da árvore e os caminhos da raiz até os nós terminais representam palavras completas.

A árvore Trie foi implementada manualmente em Java, seguindo as restrições do projeto: sem uso de bibliotecas ou funções prontas, como listas, arrays dinâmicos ou estruturas abstratas. Toda a estrutura foi construída utilizando apenas `String`, `int`, `float`, `char`, `try-catch`, `throws` e `length` (apenas para `String`).

---

## Funcionamento

O sistema permite:

- Inserção de palavras letra por letra na árvore.
- Busca por palavras completas já inseridas.
- Remoção de palavras, com exclusão segura de nós não utilizados.
- (Opcional) Sugestão de palavras por prefixo (autocompletar).
- Visualização hierárquica da estrutura da Trie (via impressão ou depuração).

---

## Estrutura da Árvore Trie

A lógica da Trie funciona por prefixos:

- Cada nó representa uma letra.
- O caminho da raiz até um nó marcado como fim de palavra representa uma palavra válida.
- Quando duas ou mais palavras compartilham um prefixo, elas usam os mesmos nós até o ponto de ramificação.

---

### Exemplo visual com as palavras: "gato", "galho" e "guerra":

```
(raiz)
  |
  g
  |
  a
 / \
l   t
|    \
h     o (fim de "gato")
|
o (fim de "galho")

g
 \
  u
   \
    e
     \
      r
       \
        r
         \
          a (fim de "guerra")
```

---

## Estrutura do Código

O projeto é dividido nas seguintes classes:

### `TrieNode`
Representa um nó da Trie. Armazena um caractere, um vetor fixo de 26 filhos (para as letras a-z) e uma flag que indica se aquele nó finaliza uma palavra.

### `Trie`
Classe principal que contém os métodos de inserção, busca, remoção e (opcionalmente) sugestão de palavras com base em prefixos.

### `Main`
Classe responsável pela execução dos testes. Insere, busca e remove palavras a partir de chamadas diretas no código ou por input do usuário.

---

## Funcionalidades do Sistema

- Inserção de palavras em uma única estrutura de árvore baseada em prefixos.
- Busca precisa de palavras inteiras.
- Remoção cuidadosa de palavras sem apagar prefixos compartilhados.
- Impressão de mensagens para validar a presença ou ausência das palavras.
- Autocompletar (opcional), com sugestão de palavras que compartilham prefixos.

---

## Exemplo de Uso

```java
Trie trie = new Trie();

trie.inserir("gato");
trie.inserir("galho");

System.out.println(trie.buscar("gato")); // true
System.out.println(trie.buscar("galo")); // false

trie.remover("gato");
System.out.println(trie.buscar("gato")); // false
```

---

## Observações Importantes
A árvore Trie foi implementada manualmente, respeitando as seguintes restrições do projeto:

-Nenhum uso de listas (List, ArrayList), arrays dinâmicos, HashMap, StringBuilder, ou qualquer estrutura pronta.
-Apenas uso de tipos primitivos (char, int, boolean) e String.
-length() utilizado apenas para String, como permitido.
-Operações implementadas com laços e condições básicas.
-Estrutura 100% compatível com as exigências do projeto.

Este projeto tem como foco o aprendizado prático de estruturas de dados em Java, manipulação de árvores não-binárias e uso de prefixos como base de organização.

## Apresentação em Vídeo
O grupo elaborou um vídeo explicativo demonstrando o funcionamento do sistema, disponível no YouTube:
https://www.youtube.com/watch?v=-PxuiwHAP9s
