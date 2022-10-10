package com.lacoste.io.runners;

import com.lacoste.io.model.Pessoa;

import java.time.LocalDateTime;

public class MapaAstralParalelo {

    private MapaAstralParalelo() {
    }

    public static void run() {
        Pessoa andressa = new Pessoa("Andressa","America/Sao_Paulo", LocalDateTime.of(1995, 5,25,17,55));
        Pessoa julio = new Pessoa("Julio","America/Sao_Paulo", LocalDateTime.of(1992, 11,6,18,30));

    }
}
