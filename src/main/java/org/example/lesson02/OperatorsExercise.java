package org.example.lesson02;

public class OperatorsExercise {
    public static void main(String[] args) {

        // TODO 1: ສ້າງຕົວແປ int ຊື່ num1 = 17 ແລະ num2 = 5
        int num1 = 17;
        int num2 = 5;


        // TODO 2: print ຜົນລວມ (+), ຜົນຕ່າງ (-), ຜົນຄູນ (*) ຂອງ num1 ແລະ num2
        System.out.println("ຜົນລວມ (+) ຂອງ num1 ແລະ 2: " + (num1 + num2));
        System.out.println("ຜົນຕ່່າງ (-) ຂອງ num1 ແລະ 2: " + (num1 - num2));
        System.out.println("ຜົນຄູນ (*) ຂອງ num1 ແລະ 2: " + (num1 * num2));

        // TODO 3: print ຜົນຫານ num1/num2 ແບບ double (ຕ້ອງໄດ້ທົດສະນິຍົມ ບໍ່ແມ່ນຕັດ)
        double divideResult = (double) num1 / num2;
        System.out.println("ຜົນຫານແບບທົດສະນີຍົມ (/) ຂອງ num1 ແລະ 2: " + divideResult);



        // TODO 4: ໃຊ້ % ກວດວ່າ num1 ເປັນເລກຄູ່ ຫຼື ເລກຄີກ, ເກັບຜົນໄວ້ໃນຕົວແປ boolean ຊື່ isEven ແລ້ວ print
        boolean isEven = num1 % 2 == 0;
        System.out.println("num1 ເປັນເລກຄູ້" + isEven);

        // TODO 5: ສ້າງຕົວແປ int score = 75
        // ຖ້າ score >= 50 → ຕົວແປ boolean passed = true, ບໍ່ດັ່ງນັ້ນ false
        // (ໃຊ້ comparison operator, ຍັງບໍ່ຕ້ອງໃຊ້ if-else, ໃຊ້ >= ຕົງໆກັບ boolean ໄດ້ເລີຍ)
        int score = 75;
        boolean passed = score >= 50;
        System.out.println("ຜົນການສອບເສັງຜ່ານ: " + passed);


        // TODO 6: ສ້າງ boolean isRaining = true ແລະ hasUmbrella = false
        // ຄຳນວນ boolean canGoOut = !isRaining || hasUmbrella  (ອອກໄປໄດ້ຖ້າບໍ່ຝົນຕົກ ຫຼື ມີຄັນຮົ່ມ)
        // print ຜົນອອກມາ
        boolean isRaining = true;
        boolean hasUmbrella = false;

        boolean canGoOut = !isRaining || hasUmbrella;
        System.out.println("ສາມາດອອກໄປນອກໄດ້ບໍ: " + canGoOut);

    }
}
