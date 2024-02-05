package com.talesb.exerc1;


import java.util.ArrayList;
import java.util.List;

//Crie uma thread que imprima os números de 1 a 100.
public class Main {
    public static void main(String[] args) {


        List<String> nomes = new ArrayList<String>();
        nomes.add("Tales");
        nomes.add("João");

        nomes.parallelStream().forEach(nome -> {
            //Efetuar envio para fila
        });


    }
}
