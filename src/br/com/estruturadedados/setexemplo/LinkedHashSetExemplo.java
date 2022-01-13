package br.com.estruturadedados.setexemplo;
import br.com.estruturadedados.carro.Carro;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/* LinkedHashSet = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-698ms
 * Busca de um elemento = 45ms
 * Inserção de um elemento = 1ms
 * Remoção de todos elementos da coleção = 5ms
 * Remoção de um elemento no meio da coleção = 31ms
 * */

public class LinkedHashSetExemplo {
    Set<Carro> s = new LinkedHashSet<>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;
    private int r1, r2;

    public void preencherSet(){
        for(int i = 0; i < 1000000; i++){
            r1 = g.nextInt(2);
            r2 = g.nextInt(3);
            chassi = ""+i;
            data = LocalDate.of(2022, 1, 10);
            Carro c = new Carro(marca,modelo[r1],cor[r2],chassi,data);

            s.add(c);
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

    public void inserirInicio(String marca, String modelo, String cor, String chassi,LocalDate data){
        Carro c = new Carro(marca,modelo,cor,chassi,data);
        s.add(c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirMeio(String marca, String modelo, String cor, String chassi,LocalDate data){
        Carro c = new Carro(marca,modelo,cor,chassi,data);
        s.add(c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirFim(String marca, String modelo, String cor,LocalDate data){
        chassi = ""+(s.size());
        Carro c = new Carro(marca,modelo,cor,chassi,data);
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
