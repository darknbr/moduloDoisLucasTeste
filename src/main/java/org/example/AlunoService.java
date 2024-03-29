package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class AlunoService {

    public List<String> procurar(){

        String caminho = AlunoService.class.getClassLoader()
                .getResource("alunos.txt")
                .getPath();

        try {
            List<String> alunos = Files.readAllLines(Path.of(caminho));
            return alunos;
        }catch (IOException ioException){
            return Collections.emptyList();
        }
    }
}
