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
public class Employee extends Person {

    private double luong;

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public void thongTin() {
        System.out.println("Class con");
    }
}
