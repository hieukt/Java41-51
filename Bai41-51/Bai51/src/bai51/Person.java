/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai51;

/**
 *
 * @author Lenovo-PC
 */
public class Person {

    private String ten;
    private String ho;

    public void setHoTen(String ten, String ho) {
        this.ten = ten;
        this.ho = ho;
    }

    public String getHoTen() {
        return this.ho + " " + this.ten;
    }
}
