package arvore;

public class Arvore implements Tree {
    No raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(int dados) {
        raiz = inserirRecursivo(raiz, dados);
    }

    private No inserirRecursivo(No raiz, int dados) {
        // primeiro inserir, será na raiz
        if (raiz == null) {
            return new No(dados);
        }

        // raiz já possui dados
        if (dados < raiz.dados) { // inserir na esquerda
            raiz.esquerda = inserirRecursivo(raiz.esquerda, dados);
        } else if (dados > raiz.dados) { // inserir na direita
            raiz.direita = inserirRecursivo(raiz.direita, dados);
        }
        return raiz;
    }

    // Método para percorrer a árvore em ordem (in-order traversal)
    public void inorder() {
        System.out.print("[ ");
        inorderRecursivo(raiz);
        System.out.println("]");
    }

    // método recursivo que percorre a arvore
    private void inorderRecursivo(No raiz) {
        if (raiz != null) {
            inorderRecursivo(raiz.esquerda);
            System.out.print(raiz.dados + " ");
            inorderRecursivo(raiz.direita);
        }
    }

    public boolean pesquisar(int data) {
        return pesquisarRec(raiz, data);
    }

    private boolean pesquisarRec(No root, int data) {
        if (root == null) {
            return false;
        }

        if (data == root.dados) {
            return true;
        } else if (data < root.dados) {
            return pesquisarRec(root.esquerda, data);
        } else {
            return pesquisarRec(root.direita, data);
        }
    }

    public int tamanho() {
        return tamanho(raiz);
    }

    private int tamanho(No no) {
        if (no == null) {
            return 0;
        } else {
            int tamEsq = tamanho(no.esquerda);
            int tamDir = tamanho(no.direita);
            return tamEsq + tamDir + 1;
        }
    }

    public int menor() {
        return menorRecursivo(raiz);
    }

    public int menorRecursivo(No raiz) {
        if (raiz.esquerda != null) {
            return menorRecursivo(raiz.esquerda);
        }
        else{
            return raiz.dados;
        }
    }
    public int maior(){
        return maiorRecusivo(raiz);
    }
    public int maiorRecusivo(No raiz){
        if (raiz.direita != null){
            return maiorRecusivo(raiz.direita);
        }
        else {
            return raiz.dados;
        }
    }
}
