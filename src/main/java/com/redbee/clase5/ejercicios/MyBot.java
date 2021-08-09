package com.redbee.clase5.ejercicios;

import java.util.List;

public class MyBot {

    public static String saluda(List<String> nombres) {
        var saludo = new StringBuilder("Hola, ");
        if (nombres != null && !nombres.isEmpty()) {
            if (nombres.size() == 1) {
                return saludaAUnaPersona(nombres, saludo);
            } else {
                return saludaAMuchaGente(nombres, saludo);
            }
        } else {
            return saludo.append("colega").toString();
        }
    }

    private static String saludaAUnaPersona(List<String> nombres, StringBuilder saludo) {
        final var nombre1 = nombres.get(0);
        if (estaEnMayusculas(nombre1)) {
            saludo.insert(0, '¡');
            saludo.append(nombre1);
            saludo.append('!');
            return saludo.toString().toUpperCase();
        }
        return saludo.append(nombre1).toString();
    }

    private static String saludaAMuchaGente(List<String> nombres, StringBuilder saludo) {
        for (int i = 0; i < nombres.size(); i ++){
            if(i == nombres.size() - 2){
                if(nombres.get(i + 1).charAt(0) == 'I'
                        || (nombres.get(i + 1).charAt(0) == 'H' && (nombres.get(i + 1).charAt(1) == 'i' || nombres.get(i + 1).charAt(1) == 'y'))
                        || (nombres.get(i + 1).charAt(0) == 'Y')){
                    saludo.append(nombres.get(i));
                    saludo.append(" e ");

                } else {
                    saludo.append(nombres.get(i));
                    saludo.append(" y ");
                }
            } else {
                saludo.append(nombres.get(i));
                if(i < nombres.size() - 1) {
                    saludo.append(", ");
                }
            }
        }
        return saludo.toString();
    }

    private static boolean estaEnMayusculas(String nombre) {
        return nombre.chars()
                .allMatch(Character::isUpperCase);
    }
}
