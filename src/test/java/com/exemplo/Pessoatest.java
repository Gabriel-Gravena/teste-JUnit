package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class Pessoatest {

    @Test
    void CalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("gabriel", LocalDate.of(2000,1,1));
        Assertions.assertEquals(25, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("gabriel", LocalDate.of(2000,1,1));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("joao", LocalDate.now());
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }


}
