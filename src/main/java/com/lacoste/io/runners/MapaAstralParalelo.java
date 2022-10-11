package com.lacoste.io.runners;

import com.lacoste.io.model.Pessoa;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MapaAstralParalelo {
    private MapaAstralParalelo() {
    }private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String RESOURCES_PATH = PROJECT_PATH.concat("/src").concat("/main").concat("/resources");

    public static void main() {
        Path grupoTxtPath = Paths.get(RESOURCES_PATH, "grupo.txt");
        var pessoas = FileIO.lerArquivoPessoas(grupoTxtPath);

        List<Thread> threads = null;

        for (Pessoa pessoa: pessoas) {
            var mapa = new FileIO(pessoa);
            new Thread(mapa, pessoa.getNome()).start();
        }
    }
}
