package org.example.lesson01;

public class VariablesDemo {
    public static void main(String[] args) {
        int age = 20;
        double price = 15000.50;
        boolean isStudent = true;
        char grade = 'A';
        String name = "ມະລີ";

        System.out.println("ຊື່: " + name);
        System.out.println("ອາຍຸ: " + age);
        System.out.println("ລາຄາ: " + price);
        System.out.println("ເປັນນັກສຶກສາ: " + isStudent);
        System.out.println("ຄະແນນ: " + grade);

        double d = 9.7;
        int i = (int) d;
        System.out.println("d = " + d + ", (int) d = " + i);
    }
}
