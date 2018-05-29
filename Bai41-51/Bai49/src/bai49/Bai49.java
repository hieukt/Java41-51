/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai49;

/**
 *
 * @author Lenovo-PC
 */
public class Bai49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long x = 10;
        int i = (int) x;

        Worker w = new Worker();
        Person p = new Worker();
        Employee e = new Worker();
        Object ob = new Worker();

        w.luong();
        Worker k1 = (Worker) e;
        k1.luong();
        ((Worker) p).luong();
        ((Employee) ob).toString();
    }

}
