package org.example.lesson02;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 5, b = 2;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b (int) = " + (a / b));
        System.out.println("a / b (double) = " + (a / (double) b));
        System.out.println("a % b = " + (a % b));

        boolean isEven = (a % 2 == 0);
        System.out.println("a ເປັນເລກຄູ່? " + isEven);

        int age = 20;
        boolean hasId = true;
        boolean canEnter = age >= 18 && hasId;
        System.out.println("ເຂົ້າໄດ້ບໍ່? " + canEnter);

        int result = 2 + 3 * 4;
        int result2 = (2 + 3) * 4;
        System.out.println("2 + 3 * 4 = " + result);
        System.out.println("(2 + 3) * 4 = " + result2);
    }
}
