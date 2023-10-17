package arvore;

public class No {
    int dados;
    No esquerda;
    No direita;

    public No(int dados) {
        this.dados = dados;
        // inicia as referencias como nulo
        this.esquerda = null;
        this.direita = null;
    }

}