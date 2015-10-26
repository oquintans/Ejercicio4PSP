/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pspejercicio4;

/**
 *
 * @author oquintansocampo
 */
public class Pares extends Thread {

    int suma = 0;

    public Pares(String nom) {
        super(nom);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
                System.out.println("Suma Pares: " + suma);
            }
        }
    }
}
