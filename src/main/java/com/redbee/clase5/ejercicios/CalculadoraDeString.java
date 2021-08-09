package com.redbee.clase5.ejercicios;

public class CalculadoraDeString {

    public static int calcular(String operacion) {
        int resultado = 0;
        int operador;

        if(operacion != null && !operacion.isBlank()){
            if(operacion.length() == 1){
                resultado = Integer.parseInt(operacion);
            }
            else {
                operador =  identificarOperador(operacion);
                int operando1 = Integer.parseInt(String.valueOf(operacion.charAt(0)));
                int operando2 = Integer.parseInt(String.valueOf(operacion.charAt(2)));
                resultado = getResultado(resultado, operador, operando1, operando2);

            }

        }

        return resultado;
    }

    private static int getResultado(int resultado, int operador, int operando1, int operando2) {
        switch (operador){
            case '+': //suma
                resultado = operando1 + operando2;
                break;
            case '*':
                resultado = operando1 * operando2;
                break;
            case '-':
                resultado = operando1 - operando2;
                break;
            case '/':
                resultado = operando1 / operando2;
                break;
        }
        return resultado;
    }

    public static int identificarOperador(String operacion){

        return operacion.chars().min().orElse(0);
    }
}
