public class PilhaArray implements Pilha {
    private int[] array;
    private int tamanho;
    private int capacidade;

    public PilhaArray(int capacidade) {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
        this.tamanho = 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean contem(int dado) {
        for (int i = 0; i < tamanho; i++) {
            if (array[1] == dado) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void inserir(int dado) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("A pilha está cheia");
        }
        array[tamanho] = dado;
        tamanho++;
    }

    @Override
    public int retirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        int elementoRemovido = array[tamanho - 1];
        tamanho--;
        return elementoRemovido;
    }

    @Override
    public void imprimir() {
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.printf("|%s|\n", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PilhaArray pilha = new PilhaArray(5);

        pilha.inserir(10);
        pilha.inserir(20);
        pilha.inserir(30);

        System.out.println("Tamanho da pilha: " +
                pilha.tamanho());
        System.out.println("A pilha está vazia? " +
                pilha.estaVazia());
        System.out.println("A pilha contem o numero 20? " +
                pilha.contem(20));

        System.out.println("Elementos na pilha: ");
        pilha.imprimir();

        int elementoRemovido = pilha.retirar();
        System.out.println("Elemento removido: " + elementoRemovido);

        pilha.imprimir();
    }
}
