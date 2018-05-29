/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai43;

/**
 *
 * @author Lenovo-PC
 */
public class Bai43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee em = new Employee();
        em.setTen("Hieu");
        em.setDia_chi(null);
        
        DiaChi dc = new DiaChi();
        dc.setTen_duong("HaNoi");
        
        em.setDia_chi(dc);
        
        System.out.println(em.getTen());
        System.out.println(em.getDia_chi().getTen_duong());
    }
    
}
