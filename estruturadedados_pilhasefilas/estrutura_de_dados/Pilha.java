package estrutura_de_dados;
public class Pilha{
    private String[] elementos;
    private int ultimo;
    private int capacidade;

    public Pilha(){
        this.capacidade = 10;
        this.elementos = new String[this.capacidade];
        this.ultimo = -1;
    }
    public void empilhar(String elemento){
        ultimo++;
        elementos[ultimo] = elemento;
    }
    public String desempilhar(){
        if(ultimo >= 0){
            String elemento = elementos[ultimo];
            ultimo--;
            return elemento;
        }
        else{
            System.out.println("Está vazia");
            return null;
        }
    }
    public void estaVazia(){
        if(ultimo < 0){
            System.out.println("Está vazia");
        }
        else{
            System.out.println("Não está vazia");
            for (int i = ultimo; i >= 0; i--) {
            System.out.println(elementos[i]);
            }
        }
    }
}