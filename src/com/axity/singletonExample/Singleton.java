package com.axity.singletonExample;

public final class Singleton {

    /**
     * Codigo original de https://refactoring.guru/design-patterns/singleton/java/example
     */

    //Se crea instancia privada
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // Se emula un inicio lento
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        //Solo se crea una instancia de singleton cuando no existe alguna previa
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}