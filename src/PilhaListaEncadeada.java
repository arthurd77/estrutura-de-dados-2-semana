public class PilhaListaEncadeada implements Pilha {
    private Node topo;
    private int tamanho;

    public PilhaListaEncadeada() {
        topo = null;
        tamanho = 0;
    }

    @Override
    public int tamanho() {
        int tamanhoPilha = 0;
        Node atual = topo;
        while (atual != null) {
            tamanhoPilha++;
            atual = atual.proximo;

        }
        return tamanhoPilha;
    }

//    @Override
//    public int tamanho() {
//        return tamanho;
//    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean contem(int dado) {
        Node atual = topo;
        while (atual != null) {
            if (atual.dado == dado) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    @Override
    public void inserir(int dado) {
        Node novoNo = new Node(dado);
        novoNo.proximo = topo;
        topo = novoNo;

        tamanho++;
    }

    @Override
    public int retirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        int elementoRemovido = topo.dado;
        topo = topo.proximo;
        tamanho--;

        return elementoRemovido;
    }

    @Override
    public void imprimir() {
        Node atual = topo;

        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pilha pilha = new PilhaListaEncadeada();
        pilha.inserir(10);
        pilha.inserir(20);
        pilha.inserir(30);

        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        System.out.println("A pilha está vazia? " + pilha.estaVazia());
        System.out.println("A pilha contém o número 20? " + pilha.contem(20));
        System.out.println("Elementos na pilha: ");
        pilha.imprimir();
        int elementoRemovido = pilha.retirar();
        System.out.println("Elemento removido: " + elementoRemovido);
        pilha.imprimir();
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
    }
}
