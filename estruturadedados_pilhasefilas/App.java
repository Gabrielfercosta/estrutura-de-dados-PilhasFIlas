import estrutura_de_dados.EditorDeTexto;
import estrutura_de_dados.Pilha;

public class App 
{
    public static void main(String[] args) 
    {
        Pilha pilha = new Pilha();
        /*pilha.empilhar("Camada 1");
        pilha.empilhar("Camada 2");
        pilha.empilhar("Camada 3");
        pilha.empilhar("Camada 4");
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.empilhar("Camada teste");
        pilha.estaVazia();*/
        
        EditorDeTexto editor = new EditorDeTexto();
        editor.inserirTexto("Faça ou não faça, ");
        editor.mostrarTexto();
        editor.inserirTexto("tentativa não há");
        editor.mostrarTexto();
        editor.desfazer();
        editor.mostrarTexto();
        editor.refazer();
        editor.mostrarTexto();
        editor.inserirTexto(" apenas faça!");
        editor.mostrarTexto();
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();
        
        

    }
}
