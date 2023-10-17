package arvore;

public class App {
    public static void main(String[] args) throws Exception {
        Tree tree = new Arvore();

        // Inserindo elementos na árvore
        tree.inserir(50);
        tree.inserir(30);
        tree.inserir(20);
        tree.inserir(40);
        tree.inserir(70);
        tree.inserir(60);
        tree.inserir(80);

//         Percorrendo a árvore em ordem
        System.out.println("Árvore binária em ordem:");
        tree.inorder();

        System.out.println(tree.pesquisar(42));

        System.out.println(tree.tamanho());

        System.out.println("O menor número da árvore é: " + tree.menor());

        System.out.println("O maior número é: " + tree.maior());
    }
}
