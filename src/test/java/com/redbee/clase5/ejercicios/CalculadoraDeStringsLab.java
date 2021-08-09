package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Crea una calculadora que sea capaz de recibir una operación matemática como input en un string y devuelva el
 * resultado de la misma. Para simplificar la implementación de la solución asumamos que la cadena ya está validada
 *
 * Requerimiento 1
 * Cuando el string esté vacío, deberá devolver 0. Por ejemplo, cuando se llame a calcular("") deberá devolver 0
 *
 * Requerimiento 2
 * Deberá manejar null. Si es llamado calcular(null) deberá devolver 0
 *
 * Requerimiento 3
 * Deberá manejar la posibilidad que introduzcan 1 solo valor. Por ejemplo si se llama a calcular("3"), entonces deberá
 * devolver el mismo valor, en este caso 3
 *
 * Requerimiento 4
 * Cuando se llame una operación de suma, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("1+3") entonces deberá devolver 4
 *
 * Requerimiento 5
 * Cuando se llame a una operación de resta, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("5-6") deberá devolver 1
 *
 */
@DisplayName("Laboratorio para ejercicio de numeros romanos")
public class CalculadoraDeStringsLab {

  /*  @Test
    void saludaALaura() {
        //give: cocinar los datos
        final var nombre = "Laura";
        final var saludoEsperado = "Hola, Laura";

        //when: testeo el requerimiento
        final var saludoActual = MyBot.saluda(List.of(nombre));

        //then: analizar el resultado
        Assertions.assertEquals(saludoEsperado, saludoActual);
    } */

    @Test
    @DisplayName("Test con string vacio")
    void testStringVacio() {
        Assertions.assertEquals(0, CalculadoraDeString.calcular(""));
    }

    @Test
    @DisplayName("Test con string null")
    void testStringNull() {
        Assertions.assertEquals(0, CalculadoraDeString.calcular(null));
    }

    @Test
    @DisplayName("Test con un solo valor")
    void testStringUnValor() {
        Assertions.assertEquals(3, CalculadoraDeString.calcular("3"));
    }

    @Test
    @DisplayName("Test suma dos valores")
    void testStringSuma() {
        Assertions.assertEquals(5, CalculadoraDeString.calcular("3+2"));
    }

    @Test
    @DisplayName("Test resta dos valores")
    void testStringResta() {
        Assertions.assertEquals(1, CalculadoraDeString.calcular("6-5"));
    }

    @Test
    @DisplayName("Test producto de dos valores")
    void testStringProducto() {
        Assertions.assertEquals(6, CalculadoraDeString.calcular("2*3"));
    }

    @Test
    @DisplayName("Test division de dos valores")
    void testStringDivision() {
        Assertions.assertEquals(3, CalculadoraDeString.calcular("6/2"));
    }

}
