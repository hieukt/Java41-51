/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai45;

import java.util.Scanner;

/**
 *
 * @author Lenovo-PC
 */
public class Bai45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] em = new Employee[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao thong tin 3 nhan vien: ");
        for (int i = 0; i < em.length; i++) {
            String ten_duong = sc.nextLine();
            String ten = sc.nextLine();
            int soNamKN = sc.nextInt();

            Address ad = new Address(ten_duong);
            Employee em1 = new Employee(ten, soNamKN);
            em1.setAddress(ad);

            em[i] = em1;
            sc.nextLine();
        }

        System.out.println("Thong tin nhan vien nhap vao: ");
        for (Employee em1 : em) {
            System.out.println(em1.getTen() + " " + em1.getAddress().getTen_duong() + " " + em1.luong());
        }
    }

}
