package com.lacoste.io.runners;

import com.lacoste.io.model.Pessoa;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MapaAstralParalelo {
    private MapaAstralParalelo() {
    }private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String RESOURCES_PATH = PROJECT_PATH.concat("/src").concat("/main").concat("/resources");

    public static void main() {
        Path grupoTxtPath = Paths.get(RESOURCES_PATH, "grupo.txt");
        var pessoas = FileIO.lerArquivoPessoas(grupoTxtPath);


        pessoas.stream().parallel().forEach(pessoa ->
                {
                    try {
                        FileIO.gerarRelatorioUnico(pessoa);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

    }
}
