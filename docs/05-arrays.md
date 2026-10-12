# ບົດທີ 5: Array (ອາເຣ)

## Array ແມ່ນຫຍັງ

Array = ກ່ອງເກັບ **ຂໍ້ມູນຫຼາຍໆຕົວ** ປະເພດດຽວກັນ ໄວ້ດ້ວຍກັນ, ແຕ່ລະຕົວຖືກອ້າງອີງດ້ວຍ **index** (ລຳດັບ) ເລີ່ມຈາກ **0**.

```java
int[] numbers = {10, 20, 30, 40, 50};
```

```
index:   0    1    2    3    4
value:  10   20   30   40   50
```

⚠️ **ຈຸດສຳຄັນສຸດ:** index ເລີ່ມຈາກ **0 ບໍ່ແມ່ນ 1** — ຕົວທຳອິດຄື `numbers[0]`, ຕົວສຸດທ້າຍຄື `numbers[numbers.length - 1]`

## ການປະກາດ Array

```java
int[] numbers = {10, 20, 30, 40, 50};      // ປະກາດພ້ອມໃຫ້ຄ່າ
int[] scores = new int[5];                 // ປະກາດຂະໜາດ 5, ຄ່າເລີ່ມຕົ້ນເປັນ 0 ໝົດ
String[] names = new String[3];            // String array, ຄ່າເລີ່ມຕົ້ນເປັນ null
```

## ການເຂົ້າເຖິງ ແລະ ແກ້ຄ່າ

```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[0]);   // 10
numbers[1] = 99;                  // ແກ້ຄ່າ index 1 ເປັນ 99
System.out.println(numbers[1]);   // 99
```

## `.length` — ຂະໜາດ array

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers.length);   // 5
```
⚠️ `.length` **ບໍ່ມີວົງເລັບ** (ຕ່າງກັບ `String.length()` ທີ່ມີວົງເລັບ!)

## Loop ຜ່ານ Array

**ແບບທຳມະດາ (ໃຊ້ index, ເຫມາະຖ້າຕ້ອງການ index ຫຼື ແກ້ຄ່າ):**
```java
int[] numbers = {10, 20, 30, 40, 50};
for (int i = 0; i < numbers.length; i++) {
    System.out.println("index " + i + " = " + numbers[i]);
}
```

**ແບບ for-each (ງ່າຍກວ່າ, ອ່ານຄ່າຢ່າງດຽວ ບໍ່ໄດ້ index):**
```java
for (int n : numbers) {
    System.out.println(n);
}
```

## Array 2 ມິຕິ (2D Array)

ຄືຕາຕະລາງ (ແຖວ x ຖັນ):
```java
int[][] grid = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(grid[0][2]);  // ແຖວ 0, ຖັນ 2 -> 3
System.out.println(grid[1][0]);  // ແຖວ 1, ຖັນ 0 -> 4

for (int i = 0; i < grid.length; i++) {        // loop ແຖວ
    for (int j = 0; j < grid[i].length; j++) { // loop ຖັນ
        System.out.print(grid[i][j] + " ");
    }
    System.out.println();
}
```

## ຂໍ້ຜິດພາດທີ່ພົບເລື້ອຍ: ArrayIndexOutOfBoundsException

```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[3]);  // ERROR! ມີແຕ່ index 0,1,2 (3 ຕົວ) — index 3 ບໍ່ມີ
```
ຖ້າ loop ດ້ວຍ `i <= numbers.length` (ຜິດ, ຄວນເປັນ `<`) ຈະເກີດ error ນີ້ — ນີ້ແຫຼະຄືຕົວຢ່າງ off-by-one ອີກແບບໜຶ່ງ!

---

## Exercise

ໄປທີ່ `src/main/java/org/example/lesson05/ArraysExercise.java` ແລະ ເຮັດຕາມ `TODO`

---
ກ່ອນໜ້າ: [ບົດທີ 4 — Loop](04-loops.md)
