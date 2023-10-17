package arvore;

public interface Tree {

    public void inserir(int dados);

    public void inorder();

    public boolean pesquisar(int data);

    public int tamanho();

    public int menor();

    public int maior();

}
