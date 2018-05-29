/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai47;

/**
 *
 * @author Lenovo-PC
 */
public class Bai47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee em = new Employee();
        Person p = new Employee();
        em.setTen("Hieu");
        em.setLuong(5000000);

        p.setTen("Tien");
        em.thongTin();
        p.thongTin();
    }

}
