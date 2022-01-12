package br.com.estruturadedados.setexemplo;
import br.com.estruturadedados.carro.Carro;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* Set = representa grupos de elementos sem duplicatas, é utilizado quando não precisar ter nenhum dado duplicado na coleção.
 * tempo de insercao de 1 milhao de elementos = +-774ms
 * Busca de um elemento = 114ms O(n)
 * Inserção de um elemento no meio da coleção = ?ms O(1) //
 * Inserção no inicio e no final da coleção = ?ms O(?) e 1ms O(1) //peguei o valor do size() e inseri com o numero do chassi maior que o ultimo adicionado
 * Remoção de todos elementos da coleção = 5ms O(n)
 * Remoção de um elemento no meio da coleção = 43ms O(n)
 * */

public class SetExemplo {
    Set<Carro> s = new HashSet<>();

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
            chassi = ""+i;

            Carro c = new Carro(marca,modelo[r1],cor[r2],chassi);

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

    public void inserirInicio(String marca, String modelo, String cor, String chassi){
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
        chassi = ""+(s.size());
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
