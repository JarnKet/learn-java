package org.example.lesson03;

public class ConditionsDemo {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 80) {
            System.out.println("ລະດັບ A");
        } else if (score >= 60) {
            System.out.println("ລະດັບ B");
        } else if (score >= 40) {
            System.out.println("ລະດັບ C");
        } else {
            System.out.println("ຕົກ");
        }

        int age = 20;
        boolean hasTicket = true;
        if (age >= 18 && hasTicket) {
            System.out.println("ເຂົ້າຊົມໄດ້");
        } else {
            System.out.println("ເຂົ້າຊົມບໍ່ໄດ້");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("ວັນຈັນ");
                break;
            case 2:
                System.out.println("ວັນອັງຄານ");
                break;
            case 3:
                System.out.println("ວັນພຸດ");
                break;
            default:
                System.out.println("ບໍ່ຮູ້ຈັກ");
        }

        String status = (age >= 18) ? "ຜູ້ໃຫຍ່" : "ເດັກ";
        System.out.println("ສະຖານະ: " + status);
    }
}
