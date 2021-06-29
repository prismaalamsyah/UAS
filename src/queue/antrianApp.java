/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Prisma Alamsyah
 */
public class antrianApp {
    public static void main(String[] args){
        antrian antrian = new antrian(10);
        antrian.enqueue(50);
        antrian.display();
        System.out.println("");
        antrian.enqueue(60);
        antrian.display();
        System.out.println("");
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("Nama saya adalah Prisma Alamsyah");
        System.out.println("");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("");
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("");
        System.out.println("nilai yang paling depan = " + antrian.peek());
    }
    
}