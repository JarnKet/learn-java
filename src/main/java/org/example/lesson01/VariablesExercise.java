package org.example.lesson01;

public class VariablesExercise {
    public static void main(String[] args) {

        // TODO 1: ສ້າງຕົວແປ int ຊື່ birthYear ເກັບປີເກີດຂອງທ່ານ (ຕົວຢ່າງ: 2003)
        int myBirthYear = 2002;


        // TODO 2: ສ້າງຕົວແປ int ຊື່ currentYear ເກັບປີປັດຈຸບັນ (2026)
        int currentYear = 2026;


        // TODO 3: ສ້າງຕົວແປ int ຊື່ age ແລ້ວຄຳນວນອາຍຸຈາກ currentYear - birthYear
        int myAge = currentYear - myBirthYear;


        // TODO 4: print ຂໍ້ຄວາມອອກມາວ່າ "ອາຍຸຂອງທ່ານແມ່ນ: X" (ແທນ X ດ້ວຍຕົວແປ age)
        System.out.println("ອາຍຸຂອງຂ້ອຍແມ່ນ: " + myAge);


        // TODO 5: ສ້າງຕົວແປ double ຊື່ heightCm ເກັບສ່ວນສູງເປັນຊັງຕີແມັດ (ຕົວຢ່າງ: 165.5)
        double myHeightCm = 173.5;

        // TODO 6: ປ່ຽນ heightCm ເປັນແມັດ (ຫານດ້ວຍ 100) ເກັບໃສ່ຕົວແປ double ຊື່ heightM ແລ້ວ print ອອກມາ
        double myHeightM = myHeightCm / 100;
        System.out.println("ລວງສູງຂອງຂ້ອຍ (m): " + myHeightM);

        // TODO 7: ສ້າງຕົວແປ boolean ຊື່ isAdult ເກັບຄ່າວ່າ age >= 18 ແມ່ນ ຫຼື ບໍ່ ແລ້ວ print ອອກມາ
        boolean isAdult = myAge >= 18;
        System.out.println("ເປັນຜູ້ໃຫຍ່ (18+): " + isAdult);
    }
}
