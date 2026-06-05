package service;

import domain.Carro;

import java.util.ArrayList;

public class CarroService {
    private ArrayList<Carro> carros = new ArrayList<>();

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
    public void removerCarro(int indice){
        carros.remove(indice);
    }
    public void listarCarros(){
        if (carros.isEmpty()){
            System.out.println("Lista de Carros Vazia!");
            return;
        }
        for (int i = 0; i < carros.size(); i++) {
            System.out.println("--------------------");
            System.out.println("##### LISTA " + (i) + " #####");
            System.out.println(i + " - Nome: " + carros.get(i).getNome());
            System.out.println(i + " - Cor: " + carros.get(i).getCor());
            System.out.println(i + " - Marca: " + carros.get(i).getMarca());
            System.out.println(i + " - Tem Turbo: " + carros.get(i).getTurbo());
            System.out.println("--------------------");
        }

    }

    public int totalCarros(){
        return carros.size();
    }

    public void adicionarTurbo(int opAddTurbo){
        carros.get(opAddTurbo).setTurbo(true);
    }
}