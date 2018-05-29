/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai50;

/**
 *
 * @author Lenovo-PC
 */
public class Bai50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person();
        if (p instanceof Worker) {
            ((Worker) p).luong();
        } else {
            System.out.println("Khong phai worker");
        }

        Person p2 = new Worker();
        if (p2 instanceof Worker) {
            System.out.println("Worker");
        }
        if (p2 instanceof Employee) {
            System.out.println("Employee");
        }
    }

}
