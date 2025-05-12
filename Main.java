public class Main {
    public static void main(String[] args) throws Exception {
        Trie trie = new Trie();

        trie.inserir("gato");
        trie.inserir("galo");

        System.out.println(trie.buscar("gato")); // true
        System.out.println(trie.buscar("gala")); // false

        trie.remover("galo");
        System.out.println(trie.buscar("galo")); // false
    }
}
