package org.example.lesson05;

public class ArraysExercise {
    public static void main(String[] args) {

        // TODO 1: ສ້າງ int[] ຊື່ scores = {85, 42, 67, 90, 58, 73}
        int[] scores = {85, 42, 67, 90, 58, 73};

        // TODO 2: ໃຊ້ for loop print ຄ່າທຸກຕົວໃນ scores ພ້ອມ index (ຮູບແບບ: "index 0 = 85")
        for (int i = 0; i < scores.length; i++) {
            System.out.println("index " + i + " = " + scores[i]);
        }

        // TODO 3: ຫາ "ຄ່າສູງສຸດ" ໃນ scores ດ້ວຍການ loop ທຽບເອງ (ຫ້າມໃຊ້ library ສຳເລັດຮູບ)
        // ຄຳແນະນຳ: ສ້າງຕົວແປ int max = scores[0]; ແລ້ວ loop ທຽບ ຖ້າ scores[i] > max ໃຫ້ອັບເດດ max
        // print ຜົນອອກມາ (ຕ້ອງໄດ້ 90)
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("max = " + max);

        // TODO 4: ຫາ "ຜົນລວມ" ແລະ "ຄ່າສະເລ່ຍ (average)" ຂອງ scores ທັງໝົດ
        // sum ຕ້ອງເປັນ int, ແຕ່ average ຕ້ອງເປັນ double (ຫ້າມລືມ cast!)
        int sum = 0;
        double average = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        average = (double) sum / scores.length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        // TODO 5: ນັບວ່າມີຈັກຕົວໃນ scores ທີ່ "ຜ່ານ" (>= 60) ເກັບໃສ່ຕົວແປ int passCount ແລ້ວ print
        int passCount = 0;
        int maxCondition = 60;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxCondition) {
                passCount++;
                System.out.println("Pass Number: " + scores[i]);
            }
        }

        System.out.println("passCount = " + passCount);

        // TODO 6 (ທ້າທາຍ): ສ້າງ int[][] seatMap ຂະໜາດ 3 ແຖວ 3 ຖັນ ດັ່ງນີ້:
        //   {1, 2, 3}
        //   {4, 5, 6}
        //   {7, 8, 9}
        // ໃຊ້ nested for loop print ອອກມາເປັນຕາຕະລາງ (ແຖວລະແຖວ)

        int[][] seatMap = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < seatMap.length; i++) {
            for (int j = 0; j < seatMap[i].length; j++) {
                System.out.print(seatMap[i][j] + " ");
            }

            System.out.println();
        }
    }
}
