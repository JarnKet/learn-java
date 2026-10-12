package org.example.lesson03;

public class ConditionsExercise {
    public static void main(String[] args) {

        // TODO 1: ສ້າງຕົວແປ int temperature = 35
        // ຂຽນ if-else if-else ຕັດສິນ:
        //   temperature >= 35 -> print "ຮ້ອນຫຼາຍ"
        //   temperature >= 25 -> print "ອາກາດດີ"
        //   temperature >= 15 -> print "ຄ່ອນຂ້າງເຢັນ"
        //   ຕ່ຳກວ່ານັ້ນ      -> print "ໜາວ"
        int temperature = 35;

        if (temperature >= 35) {
            System.out.println("ຮ້ອນຫຼາຍ");
        } else if (temperature >= 25) {
            System.out.println("ອາກາດດີ");
        } else if (temperature >= 15) {
            System.out.println("ຂ້ອນຂ້າງເຢັນ");
        } else {
            System.out.println("ໜາວ");
        }


        // TODO 2: ສ້າງຕົວແປ int num = 9
        // ຂຽນ if-else ກວດວ່າ num ເປັນເລກບວກ, ເລກລົບ, ຫຼື ສູນ (0)
        // ແລ້ວ print ຜົນ ("ເລກບວກ" / "ເລກລົບ" / "ເລກສູນ")
        int num = 9;

        if (num > 0) {
            System.out.println("ເລກບວກ");
        } else if (num == 0) {
            System.out.println("ເລກສູນ");
        } else {
            System.out.println("ເລກລົບ");
        }


        // TODO 3: ສ້າງຕົວແປ int month = 5 (1-12)
        // ໃຊ້ switch ກວດວ່າ month ນີ້ແມ່ນລະດູໃດ:
        //   month 3,4,5   -> "ລະດູຮ້ອນ"
        //   month 6,7,8,9,10 -> "ລະດູຝົນ"
        //   month 11,12,1,2  -> "ລະດູແຫ້ງ"
        // ຄຳແນະນຳ: switch ຮອງຮັບຫຼາຍ case ຕໍ່ກັນແບບນີ້ໄດ້:
        //   case 3:

        //   case 4:
        //   case 5:
        //       System.out.println("ລະດູຮ້ອນ");
        //       break;

        int month = 5;
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("ລະດູຮ້ອນ");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("ລະດູຝົນ");
                break;
            case 11:
            case 12:
            case 1:
            case 2:
                System.out.println("ລະດູແຫ້ງ");
                break;
            default:
                System.out.println("ບໍ່່ພົບເງື່ອນໄຂ");


        }


        // TODO 4: ສ້າງຕົວແປ int num1 = 15, num2 = 20
        // ໃຊ້ ternary operator (? :) ຫາຄ່າທີ່ "ຫຼາຍກວ່າ" ລະຫວ່າງ num1 ແລະ num2
        // ເກັບໃສ່ຕົວແປ int ຊື່ max ແລ້ວ print ອອກມາ
        int num1 = 15;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;
        System.out.println("ຄ່າໃຫ່ຍສຸດລະຫ່ວາງ num1 ແລະ num2 ແມ່ນ: " + max);


        // TODO 5 (ທ້າທາຍ): ຂຽນ loop ແບບ FizzBuzz ແບບງ່າຍໆກ່ອນ (ບໍ່ຕ້ອງໃຊ້ for loop ຕອນນີ້ ໃຊ້ຕົວເລກດຽວພໍ)
        // ສ້າງຕົວແປ int n = 15
        // ຖ້າ n ຫານ 3 ລົງຕົວ ແລະ ຫານ 5 ລົງຕົວ -> print "FizzBuzz"
        // ຖ້າ n ຫານ 3 ລົງຕົວ (ແຕ່ບໍ່ 5)        -> print "Fizz"
        // ຖ້າ n ຫານ 5 ລົງຕົວ (ແຕ່ບໍ່ 3)        -> print "Buzz"
        // ບໍ່ດັ່ງນັ້ນ                            -> print n ຕົວເລກເລີຍ

        int n = 15;

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}
