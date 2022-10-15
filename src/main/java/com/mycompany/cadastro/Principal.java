package com.mycompany.cadastro;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        Inicial tini = new Inicial();
        Buscar tbus = new Buscar();
        Inserir tins = new Inserir();
        Remover trem = new Remover();
        
        tini.setVisible(true);
        tini.setLocationRelativeTo(null);
        
        tini.setMenu1(tini,tbus,tins,trem);
        tbus.setMenu2(tini,tbus,tins,trem);
        tins.setMenu3(tini,tbus,tins,trem);
        trem.setMenu4(tini,tbus,tins,trem);
        
    }

}
