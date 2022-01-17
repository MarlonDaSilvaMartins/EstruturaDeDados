package br.com.estruturadedados.mapexemplo;
import br.com.estruturadedados.carro.Carro;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* LinkedHashMap = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-481ms
 * Busca de um elemento = 29ms
 * Inserção de um elemento = 0ms
 * Remoção de todos elementos da coleção = 15ms
 * Remoção de um elemento no meio da coleção = 0ms
 * */

public class LinkedHashMapExemplo {
    Map<String, Carro> m = new LinkedHashMap<>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;
    private int r1, r2;

    public void preencher(){
        for(int i = 0; i < 1000000; i++){
            r1 = g.nextInt(2);
            r2 = g.nextInt(3);
            chassi = ""+(i+1);
            data = LocalDate.of(2022, 1, 10);
            Carro c = new Carro(marca,modelo[r1],cor[r2],chassi,data);

            m.put(chassi,c);
        }
    }//preencherList

    public void mostrar(){
        System.out.println(m);
    }//mostrarList

    public Carro buscar(String c){
        Carro resultado = new Carro();
        try{
            resultado = m.get(c);
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }finally {
            if(resultado != null){
                return resultado;
            }else{
                return null;
            }
        }


    }//buscar

    public void inserirInicio(String marca, String modelo, String cor, LocalDate data){
        try{
            chassi = "1";
            Carro c = new Carro(marca,modelo,cor,chassi,data);
            m.put(chassi,c);

            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }

    }

    public void inserirMeio(String marca, String modelo, String cor, String chassi,LocalDate data){
        try{
            Carro c = new Carro(marca,modelo,cor,chassi,data);
            m.put(chassi,c);

            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }

    }

    public void inserirFim(String marca, String modelo, String cor,LocalDate data){
        try{
            chassi = ""+(m.size()+1);
            Carro c = new Carro(marca,modelo,cor,chassi,data);
            m.put(chassi,c);

            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            m.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(String chave){
        try{
            m.remove(chave);
            System.out.println("Valor removido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}

