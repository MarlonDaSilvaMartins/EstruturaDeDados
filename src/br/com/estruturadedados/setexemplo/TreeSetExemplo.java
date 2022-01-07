package br.com.estruturadedados.setexemplo;
import br.com.estruturadedados.carro.Carro;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* TreeSet = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-1073ms
 * Busca de um elemento = 88ms
 * Inserção de um elemento no meio da coleção = 1ms
 * Inserção no inicio e no final da coleção = 1ms e 1ms
 * Remoção de todos elementos da coleção = 1ms
 * Remoção de um elemento no meio da coleção = 26ms
 * */

public class TreeSetExemplo {
    Set<Carro> s = new TreeSet<>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private int r1, r2;

    public void preencherSet(){
        for(int i = 0; i < 1000000; i++){
            r1 = g.nextInt(2);
            r2 = g.nextInt(3);
            if(i != 9456) {
                if (i < 10) {
                    chassi = "000000" + (i + 1);
                } else if (i < 100) {
                    chassi = "00000" + (i + 1);
                } else if (i < 1000) {
                    chassi = "0000" + (i + 1);
                } else if (i < 10000) {
                    chassi = "000" + (i + 1);
                } else if (i < 100000) {
                    chassi = "00" + (i + 1);
                } else if (i < 1000000) {
                    chassi = "0" + (i + 1);
                } else {
                    chassi = "" + (i + 1);
                }
                Carro c = new Carro(marca, modelo[r1], cor[r2], chassi);

                s.add(c);
            }
        }
    }//preencherList

    public void mostrarSet(){
        System.out.println(s);
    }//mostrarList

    public Carro buscar(String c){
        Carro resultado = new Carro();
        for(Carro valor : s){
            if(valor.getChassi().equals(c)){
                resultado = valor;
            }
        }
        return resultado;
    }//buscar

    public void inserirInicio(String marca, String modelo, String cor){
        chassi = "0000001";
        Carro c = new Carro(marca,modelo,cor,chassi);
        s.add(c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirMeio(String marca, String modelo, String cor, String chassi){
        Carro c = new Carro(marca,modelo,cor,chassi);
        s.add(c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirFim(String marca, String modelo, String cor){
        chassi = ""+(s.size()+1);
        Carro c = new Carro(marca,modelo,cor,chassi);
        s.add(c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void removerTudo(){
        s.clear();
        System.out.println("Valores removidos com sucesso!");
    }

    public void removerMeio(String c){
        for(Carro valor : s){
            if(valor.getChassi().equals(c)){
                if(s.remove(valor)){
                    System.out.println("Valor removido com sucesso!");
                }break;
            }
        }
    }
}
/*
TreeSetExemplo t = new TreeSetExemplo();
t.inserirMeio("Fiat","Palio","Preto","0000004");
t.inserirMeio("Fiat","Siena","Branco","0000006");
t.inserirMeio("Fiat","Siena","Preto","0000002");
t.inserirMeio("Fiat","Palio","Vermelho","0000003");
t.inserirMeio("Fiat","Siena","Branco","0000001");
t.inserirMeio("Fiat","Palio","Prata","0000005");
long tempoInicio = System.currentTimeMillis();
t.mostrarSet();
*/
