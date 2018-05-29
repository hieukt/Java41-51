/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai42;

/**
 *
 * @author Lenovo-PC
 */
public class Employee extends Person {

    String ten;
    public void thongTin(){
        this.ten = "ABC";
        System.out.println(this.ten);
        super.thongTin();
    }
}
