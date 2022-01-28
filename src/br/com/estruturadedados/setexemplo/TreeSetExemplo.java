package br.com.estruturadedados.setexemplo;
import br.com.estruturadedados.carro.Carro;

import java.time.LocalDate;
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
    Set<Carro> set = new TreeSet<>();

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
            Carro carro = new Carro(marca, modelo[random1], cor[random2], chassi,data);
            set.add(carro);
        }
    }//preencherList

    public void mostrar(){
        System.out.println(set);
    }//mostrarList

    public Carro buscar(String chassi){
        Carro resultado = new Carro();
        try{
            for(Carro valor : set){
                if(valor.getChassi().equals(chassi)){
                    resultado = valor;
                }
            }
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

    public void inserirInicio(String marca, String modelo, String cor,LocalDate data){
        try{
            chassi = "1";
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            set.add(carro);
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
            set.add(carro);
            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirFim(String marca, String modelo, String cor,LocalDate data){
        try{
            chassi = ""+(set.size()+1);
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            set.add(carro);
            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            set.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(String chassi){
        try{
            for(Carro valor : set){
                if(valor.getChassi().equals(chassi)){
                    if(set.remove(valor)){
                        System.out.println("Valor removido com sucesso!");
                    }break;
                }
            }
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}//class
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
