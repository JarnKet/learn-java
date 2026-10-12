package org.example.lesson04;

public class LoopsExercise {
    public static void main(String[] args) {

        // TODO 1: ໃຊ້ for loop print ເລກ 1 ຫາ 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // TODO 2: ໃຊ້ for loop ຄຳນວນ "ຜົນລວມ" ຂອງເລກ 1 ຫາ 100 (1+2+3+...+100)
        // ຕ້ອງໃຊ້ຕົວແປ int sum = 0 ແລ້ວບວກເພີ່ມທຸກຮອບ loop, ສຸດທ້າຍ print sum (ຕ້ອງໄດ້ 5050)
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;

            if (i == 100) {
                System.out.println("ຜົນລວມແມ່ນ: " + sum);
                break;
            }
        }


        // TODO 3: ໃຊ້ for loop print "ຕາຕະລາງສູດຄູນແມ່ 5" (5x1=5, 5x2=10, ... 5x12=60)
        int multiply = 5;
        for (int i = 1; i <= 12; i++) {
            System.out.println(multiply + "x" + i + "=" + multiply * i);
        }

        // TODO 4: ໃຊ້ while loop ນັບຖອຍຫຼັງຈາກ 10 ຫາ 1 (10,9,8,...,1) ແລ້ວ print "ຈົບ!" ຕອນສຸດທ້າຍ
        int startCountNumber = 10;
        while (startCountNumber > 0) {
            System.out.println("ນັບຖອຍຫຼັງ: " + startCountNumber);

            startCountNumber--;


            if (startCountNumber == 0) {
                System.out.println("ຈົບ!");
                break;
            }
        }

        // TODO 5: ໃຊ້ for loop ຮ່ວມກັບ if ແລະ continue:
        // print ສະເພາະເລກຄູ່ ລະຫວ່າງ 1 ຫາ 20 (ໃຊ້ % ກວດເລກຄູ່, ຖ້າເປັນເລກຄີກ continue ຂ້າມ)
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) continue;

            System.out.println(i);
        }


        // TODO 6 (ທ້າທາຍ): ຂຽນ FizzBuzz ແບບເຕັມ! ໃຊ້ for loop ຈາກ 1 ຫາ 20:
        //   ຖ້າຫານ 3 ແລະ 5 ລົງຕົວ -> print "FizzBuzz"
        //   ຖ້າຫານ 3 ລົງຕົວ (ແຕ່ບໍ່ 5) -> print "Fizz"
        //   ຖ້າຫານ 5 ລົງຕົວ (ແຕ່ບໍ່ 3) -> print "Buzz"
        //   ບໍ່ດັ່ງນັ້ນ -> print ຕົວເລກນັ້ນເລີຍ
        // (ນີ້ຄືຄຳຖາມສຳພາດທີ່ຄົນມັກຖາມ ຝຶກໃຫ້ແໜ້ນ!)
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": " + "FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ": " + "Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": " + "Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
