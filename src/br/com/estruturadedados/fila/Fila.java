package br.com.estruturadedados.fila;
//fila
public class Fila {
    private int inicio;
    private int fim;
    private int memo[];
    private int tamMax;

    public Fila(int tamMax){
        this.tamMax = tamMax;
        this.memo   = new int[tamMax];
        this.inicio = 0;
        this.fim    = 0;
    }

    public void insere(int elemento){
        if(!isFull()){
            this.memo[fim] = elemento;
            this.fim ++;
        }else{
            System.out.println("erro: fila cheia");
        }
    }

    public int remove(){
        int elemento = 0;
        if(!isEmpty()){
            elemento = this.memo[inicio];
            this.inicio++;
        }else{
            System.out.println("erro: fila vazia");
        }
        return elemento;
    }

    public boolean isFull(){
        if(this.fim == this.tamMax)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(this.inicio == this.fim)
            return true;
        else
            return false;
    }

    public void metodo(){

    }

}//class
