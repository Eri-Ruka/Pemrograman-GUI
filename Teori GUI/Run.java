package com.erie.Praktikum1.Tugas.No3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Silahkan masukkan nomor karyawan yang ingin diperiksa: ");
        System.out.println("1. Risa");
        System.out.println("2. Diluc");
        System.out.println("3. QIQI");
        System.out.print("Masukkan pilihan anda: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                Employee1 obj1 = new Employee1();
                obj1.list1();
            }
            case 2 -> {
                Employee2 obj2 = new Employee2();
                obj2.list2();
            }
            case 3 -> {
                Employee3 obj3 = new Employee3();
                obj3.list3();
            }
        }
    }
}
