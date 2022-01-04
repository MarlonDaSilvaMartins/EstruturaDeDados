package br.com.estruturadedados.mapexemplo;
import br.com.estruturadedados.carro.Carro;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

/* Map = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos no list = +-403ms
 * Busca de um elemento = 20ms O(1)
 * Inserção de um elemento no meio da coleção = 1ms O(1) //sobreescreveu o valor
 * Inserção no inicio e no final da coleção = ?ms O(?) e ?ms O(?) // nao tem comeco e fim
 * Remoção de todos elementos da coleção = 5ms O(n)
 * Remoção de um elemento no meio da coleção = 0ms O(1)
 * */

public class MapExemplo {
    Map<String, Carro> m = new HashMap<String, Carro>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private int r1, r2;

    public void preencherMap(){
        for(int i = 0; i < 1000000; i++){
            r1 = g.nextInt(2);
            r2 = g.nextInt(3);

            if(i < 10){
                chassi = "000000"+(i+1);
            }else if(i < 100){
                chassi = "00000"+(i+1);
            }else if(i < 1000){
                chassi = "0000"+(i+1);
            }else if(i < 10000){
                chassi = "000"+(i+1);
            }else if(i < 100000){
                chassi = "00"+(i+1);
            }else if(i < 1000000){
                chassi = "0"+(i+1);
            }else{
                chassi = ""+(i+1);
            }
            Carro c = new Carro(marca,modelo[r1],cor[r2],chassi);

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

    public void inserirInicio(String marca, String modelo, String cor, String chassi){
        Carro c = new Carro(marca,modelo,cor,chassi);
        m.put(chassi,c);

        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirMeio(String marca, String modelo, String cor, String chassi){
        Carro c = new Carro(marca,modelo,cor,chassi);
        m.put(chassi,c);

        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirFim(String marca, String modelo, String cor, String chassi){
        Carro c = new Carro(marca,modelo,cor,chassi);
        m.put(chassi,c);

        System.out.println("Valor inserido com sucesso!");
    }

    public void removerTudo(){
        m.clear();
        System.out.println("Valores removido com sucesso!");
    }

    public void removerMeio(String chave){
        m.remove(chave);
        System.out.println("Valor removido com sucesso!");
    }
}
