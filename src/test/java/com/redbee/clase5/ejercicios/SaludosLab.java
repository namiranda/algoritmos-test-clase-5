package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Requerimiento 1
 * Escribe un método saluda(nombre) que interpole el nombre en un saludo simple. Por ejemplo, cuando nombre es "Laura",
 * el método deberá devolver "Hola, Laura".
 *
 * Requerimiento 2
 * Deberá manejar la posibilidad de null. Por ejemplo, cuando nombre sea null, entonces deberá devolver "Hola, colega"
 *
 * Requerimiento 3
 * Manejando gritos. Cuando el nombre esté escrito completo en mayúsculas, entonces deberá devolverle el grito al usuario.
 * Por ejemplo, cuando nombre sea "AIXA", entonces deberá devolver "¡HOLA, AIXA!"
 *
 * Requerimiento 4
 * Manejando dos nombres como entrada. Cuando nombre sea un arreglo de dos nombres, entonces deberá devolver un saludo
 * a ambas personas. Por ejemplo, si nombre es ["Laura", "Aixa"] entonces deberá devolver "Hola, Laura y Aixa"
 *
 * Requerimiento 5
 * Manejando varios nombres. Cuando nombre sea un arreglo de más de dos nombres, entonces deberá devolver un saludo
 * todas las personas. Por ejemplo, si nombre es ["Laura", "Aixa", Diegui] entonces deberá devolver
 * "Hola, Laura, Aixa y Diego"
 */
@DisplayName("Laboratorio para ejercicio de saludos")
public class SaludosLab {

    @Test
    void saludaALaura() {
        //give: cocinar los datos
        final var nombre = "Laura";
        final var saludoEsperado = "Hola, Laura";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaANull() {
        //give: cocinar los datos
        final var saludoEsperado = "Hola, colega";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(null);

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaAGritos() {
        //give: cocinar los datos
        final var nombre = "AIXA";
        final var saludoEsperado = "¡HOLA, AIXA!";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaADosPersonas() {
        //give: cocinar los datos
        final var nombre1 = "Laura";
        final var nombre2 = "Aixa";
        final var saludoEsperado = "Hola, Laura y Aixa";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre1, nombre2));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaAListaVacia() {
        //give: cocinar los datos
        final var saludoEsperado = "Hola, colega";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of());

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaGramaticalmenteCorrecto() {
        //give: cocinar los datos
        final var nombre1 = "Laura";
        final var nombre2 = "Ignacio";
        final var saludoEsperado = "Hola, Laura e Ignacio";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre1, nombre2));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaGramaticalmenteCorrecto2() {
        //give: cocinar los datos
        final var nombre1 = "Laura";
        final var nombre2 = "Hilario";
        final var saludoEsperado = "Hola, Laura e Hilario";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre1, nombre2));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaGramaticalmenteCorrecto3() {
        //give: cocinar los datos
        final var nombre1 = "Laura";
        final var nombre2 = "Yvone";
        final var saludoEsperado = "Hola, Laura e Yvone";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre1, nombre2));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }

    @Test
    void saludaUnaBanda() {
        //give: cocinar los datos
        final var nombre1 = "Laura";
        final var nombre2 = "Aixa";
        final var nombre3 = "Diegui";
        final var saludoEsperado = "Hola, Laura, Aixa y Diegui";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre1, nombre2, nombre3));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    }
}
