# ບົດທີ 4: Loop (for, while, do-while)

Loop ໃຊ້ **ເຮັດ code ຊ້ຳໆ** ໂດຍບໍ່ຕ້ອງຂຽນຊ້ຳດ້ວຍມື — ເປັນພື້ນຖານ logic ທີ່ສຳຄັນສຸດຕົ້ນໆ ອັນໜຶ່ງ.

## for loop

ໃຊ້ຕອນ **ຮູ້ຈຳນວນຄັ້ງແນ່ນອນ** ທີ່ຕ້ອງການຊ້ຳ:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}
```

ໂຄງສ້າງ `for ( ການເລີ່ມຕົ້ນ ; ເງື່ອນໄຂ ; ການປ່ຽນແປງ )`:
1. **ການເລີ່ມຕົ້ນ** (`int i = 1`) — ເຮັດຄັ້ງດຽວ ຕອນເລີ່ມ loop
2. **ເງື່ອນໄຂ** (`i <= 5`) — ກວດທຸກຄັ້ງກ່ອນເຂົ້າ loop, ຖ້າ `false` ແລ້ວ loop ຢຸດທັນທີ
3. **ການປ່ຽນແປງ** (`i++`) — ເຮັດທຸກຄັ້ງ **ຫຼັງ** ຈົບ loop ແຕ່ລະຄັ້ງ

ລຳດັບການເຮັດວຽກ: `i=1` → ກວດ `i<=5`? true → ເຮັດ body → `i++` (i=2) → ກວດ `i<=5`? true → ... ຈົນ `i=6` → ກວດ `i<=5`? false → ຢຸດ

## while loop

ໃຊ້ຕອນ **ບໍ່ຮູ້ຈຳນວນຄັ້ງແນ່ນອນ** — ຈະຊ້ຳໄປເລື້ອຍໆ ຈົນກວ່າເງື່ອນໄຂເປັນ `false`:

```java
int i = 1;
while (i <= 5) {
    System.out.println("i = " + i);
    i++;   // ຕ້ອງອັບເດດຕົວແປເອງ ບໍ່ດັ່ງນັ້ນ loop ບໍ່ຢຸດ (infinite loop)
}
```

⚠️ **ຂໍ້ຄວນລະວັງ:** ລືມ `i++` → loop ບໍ່ຢຸດເລີຍ (infinite loop) ໂປຣແກຣມຈະຄ້າງ!

## do-while loop

ຄືກັນກັບ `while` ແຕ່ **ເຮັດ body ກ່ອນ 1 ຄັ້ງ ແລ້ວຈຶ່ງກວດເງື່ອນໄຂ** (ສະນັ້ນ body ຈະເຮັດຢ່າງໜ້ອຍ 1 ຄັ້ງ ເຖິງວ່າເງື່ອນໄຂຈະ false ແຕ່ຕົ້ນ):

```java
int i = 1;
do {
    System.out.println("i = " + i);
    i++;
} while (i <= 5);
```

## break ແລະ continue

- `break` — ອອກຈາກ loop ທັນທີ
- `continue` — ຂ້າມຮອບນີ້ໄປ, ແຕ່ loop ຍັງຕໍ່ໄປ

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;        // ພໍ i=5 ອອກຈາກ loop ທັນທີ (ຈະ print ແຕ່ 1,2,3,4)
    System.out.println(i);
}

for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;     // ຂ້າມ i=3, ບໍ່ print ແຕ່ loop ຍັງຕໍ່
    System.out.println(i);
}
```

## Nested loop (loop ຊ້ອນ loop)

ໃຊ້ຫຼາຍໃນການເຮັດ pattern, ຕາຕະລາງ:

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i + "x" + j + " ");
    }
    System.out.println(); // ຂຶ້ນແຖວໃໝ່ຫຼັງ loop ຂ້າງໃນຈົບ
}
```

---

## Exercise

ໄປທີ່ `src/main/java/org/example/lesson04/LoopsExercise.java` ແລະ ເຮັດຕາມ `TODO`

---
ກ່ອນໜ້າ: [ບົດທີ 3 — Condition](03-conditions.md)
