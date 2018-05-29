/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai45;

/**
 *
 * @author Lenovo-PC
 */
public class Employee extends Person {

    private int so_nam_kinh_nghiem;

    public Employee() {
    }

    public Employee(String ten, int so_nam_kinh_nghiem) {
        super(ten);
        this.so_nam_kinh_nghiem = so_nam_kinh_nghiem;
    }

    public int getSo_nam_kinh_nghiem() {
        return so_nam_kinh_nghiem;
    }

    public void setSo_nam_kinh_nghiem(int so_nam_kinh_nghiem) {
        this.so_nam_kinh_nghiem = so_nam_kinh_nghiem;
    }

    @Override
    public double luong() {
        if (this.so_nam_kinh_nghiem < 1) {
            return super.luong() * 1.5;
        } else if (this.so_nam_kinh_nghiem >= 1 && this.so_nam_kinh_nghiem < 3) {
            return super.luong() * 2;
        } else {
            return super.luong() * 3;
        }
    }

}
