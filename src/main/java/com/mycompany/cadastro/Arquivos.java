package com.mycompany.cadastro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public class Arquivos extends IOException{
    ArrayList<Cadastro> bd = new ArrayList<Cadastro>();
    ArrayList<Estado> est = new ArrayList<Estado>();
    
    // leitura do arquivo Estados.txt
    public void ArqEstados() throws IOException{
        String arqLeitura = "Estados.txt";
        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura,StandardCharsets.ISO_8859_1)); 
        String linha = "";
        int cont = 0;
        while (linha != null) {
            linha = buffRead.readLine();
            if(linha != null){
                String vet[] = linha.split("#");
                String sigla = vet[0];
                String nome = vet[1];
                est.add(new Estado());
                est.get(cont).setSigla(sigla);
                est.get(cont).setNome(nome);
                cont++;
            }
        }
        
    }
    public Estado getEstado(String sigla){
        int index = 0;
        for(int i = 0; i < est.size(); i++){
            if(sigla.equals(est.get(i).getSigla())){
                index = i;
            }
        }
        return est.get(index);
    }
}
