package com.ejemplo;

public class JavaBasicEjT3 {
    public static void main(String[] args) {

        String junta = "";
        String[] nombres = {"", "", "", ""};
        for (int i = 0; i < nombres.length; i++){
            junta += nombres[i];
            System.out.println(nombres[i]);
        }
        System.out.println(junta);
    }
}
