class TrieNode {
    char valor;
    TrieNode[] filhos; // 26 letras do alfabeto
    boolean fimPalavra;

    public TrieNode(char valor) {
        this.valor = valor;
        this.filhos = new TrieNode[26]; // restrição: só letras minúsculas a-z
        this.fimPalavra = false;
    }
}

public class Trie {
    private TrieNode raiz;

    public Trie() {
        raiz = new TrieNode(' '); // nó raiz vazio
    }

    // Inserção
    public void inserir(String palavra) throws Exception {
        TrieNode atual = raiz;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c < 'a' || c > 'z') throw new Exception("Somente letras minúsculas de a-z são permitidas.");
            int indice = c - 'a';

            if (atual.filhos[indice] == null) {
                atual.filhos[indice] = new TrieNode(c);
            }
            atual = atual.filhos[indice];
        }
        atual.fimPalavra = true;
    }

    // Busca
    public boolean buscar(String palavra) throws Exception {
        TrieNode atual = raiz;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c < 'a' || c > 'z') throw new Exception("Entrada inválida.");
            int indice = c - 'a';

            if (atual.filhos[indice] == null) {
                return false;
            }
            atual = atual.filhos[indice];
        }
        return atual.fimPalavra;
    }

    // Remoção
    public boolean remover(String palavra) throws Exception {
        return remover(raiz, palavra, 0);
    }

    private boolean remover(TrieNode no, String palavra, int profundidade) throws Exception {
        if (no == null) return false;

        if (profundidade == palavra.length()) {
            if (!no.fimPalavra) return false;
            no.fimPalavra = false;
            return isVazio(no.filhos);
        }

        char c = palavra.charAt(profundidade);
        int indice = c - 'a';
        if (remover(no.filhos[indice], palavra, profundidade + 1)) {
            no.filhos[indice] = null;
            return !no.fimPalavra && isVazio(no.filhos);
        }
        return false;
    }

    private boolean isVazio(TrieNode[] filhos) {
        for (int i = 0; i < 26; i++) {
            if (filhos[i] != null) return false;
        }
        return true;
    }
}
