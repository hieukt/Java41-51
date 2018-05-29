/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai41;

/**
 *
 * @author Lenovo-PC
 */
public class Cat extends Animal {

    public void thongTinCat() {
        tuoi = 12;
        noi_sinh_song = "HaNoi";
        dia_chi = "VN";
    }

    @Override
    protected void diLai() {
        super.diLai(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void daoChoi() {
        super.daoChoi(); //To change body of generated methods, choose Tools | Templates.
    }

}
