package org.example;

public class AlunoMain {
    public static void main(String[] args) {

        AlunoService alunoService = new AlunoService();
        alunoService.procurar().stream().forEach(System.out::println);
    }
}