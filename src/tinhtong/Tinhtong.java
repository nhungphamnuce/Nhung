/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtong;

import java.util.Scanner;
public class Tinhtong {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int num1 = sc.nextInt();
 
        System.out.println("Nhập vào số thứ hai: ");
        int num2 = sc.nextInt();
 
        sc.close();
        int sum = num1 + num2;
        System.out.println("Tổng của hai số vừa nhập là: "+sum);
    }
}

