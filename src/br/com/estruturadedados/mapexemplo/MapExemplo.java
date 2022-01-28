package br.com.estruturadedados.mapexemplo;
import br.com.estruturadedados.carro.Carro;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

/* Map = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-403ms
 * Busca de um elemento = 20ms
 * Inserção de um elemento no meio da coleção = 1ms //sobreescreveu o valor
 * Inserção no inicio e no final da coleção = ?ms e ?ms // nao tem comeco e fim
 * Remoção de todos elementos da coleção = 5ms
 * Remoção de um elemento no meio da coleção = 0ms
 * */

public class MapExemplo {
    Map<String, Carro> map = new HashMap<String, Carro>();

    private Random random = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;
    private int random1, random2;

    public void preencher(){
        for(int i = 0; i < 1000000; i++){
            random1 = random.nextInt(2);
            random2 = random.nextInt(3);
            chassi = ""+(i+1);
            data = LocalDate.of(2022, 1, 10);
            Carro carro = new Carro(marca,modelo[random1],cor[random2],chassi,data);

            map.put(chassi,carro);
        }
    }//preencherList

    public void mostrar(){
        System.out.println(map);
    }//mostrarList

    public Carro buscar(String chassi){
        Carro resultado = new Carro();
        try{
            resultado = map.get(chassi);
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
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            map.put(chassi,carro);

            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirMeio(String marca, String modelo, String cor, String chassi,LocalDate data){
        try{
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            map.put(chassi,carro);

            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirFim(String marca, String modelo, String cor,LocalDate data){
        try{
            chassi = ""+(map.size()+1);
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            map.put(chassi,carro);

            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            map.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(String chave){
        try{
            map.remove(chave);
            System.out.println("Valor removido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
