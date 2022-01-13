package br.com.estruturadedados.mapexemplo;
import br.com.estruturadedados.carro.Carro;

import java.time.LocalDate;
import java.util.TreeMap;
import java.util.Map;
import java.util.Random;

/* TreeMap = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-748ms
 * Busca de um elemento = 47ms
 * Inserção de um elemento = 0ms
 * Remoção de todos elementos da coleção = 0ms
 * Remoção de um elemento no meio da coleção = 0ms
 * */

public class TreeMapExemplo {
    Map<String, Carro> m = new TreeMap<>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;
    private int r1, r2;

    public void preencherMap(){
        for(int i = 1; i < 1000000; i++){
            r1 = g.nextInt(2);
            r2 = g.nextInt(3);
            chassi = ""+i;
            data = LocalDate.of(2022, 1, 10);
            Carro c = new Carro(marca,modelo[r1],cor[r2],chassi,data);

            m.put(chassi,c);
        }
    }//preencherList

    public void mostrarMap(){
        System.out.println(m);
    }//mostrarList

    public Carro buscar(String c){
        Carro resultado = new Carro();
        resultado = m.get(c);

        return resultado;
    }//buscar

    public void inserirInicio(String marca, String modelo, String cor, String chassi,LocalDate data){
        Carro c = new Carro(marca,modelo,cor,chassi,data);
        m.put(chassi,c);

        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirMeio(String marca, String modelo, String cor, String chassi,LocalDate data){
        Carro c = new Carro(marca,modelo,cor,chassi,data);
        m.put(chassi,c);

        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirFim(String marca, String modelo,String cor, LocalDate data){
        chassi = ""+(m.size());
        Carro c = new Carro(marca,modelo,cor,chassi,data);
        m.put(chassi,c);

        System.out.println("Valor inserido com sucesso!");
    }

    public void removerTudo(){
        m.clear();
        System.out.println("Valores removidos com sucesso!");
    }

    public void removerMeio(String chave){
        m.remove(chave);
        System.out.println("Valor removido com sucesso!");
    }
}

