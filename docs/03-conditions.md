# ບົດທີ 3: Condition (if / else / switch)

## if / else if / else

ໃຊ້ຕັດສິນໃຈເຮັດ code ສ່ວນໃດ ຕາມແຕ່ເງື່ອນໄຂ (`boolean`) ຈິງ ຫຼື ບໍ່ຈິງ:

```java
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
```

**ວິທີອ່ານ logic:** Java ຈະເບິ່ງຈາກເທິງລົງລຸ່ມ, ເຈິເງື່ອນໄຂໃດ `true` ກ່ອນ → ເຮັດ block ນັ້ນ ແລ້ວ **ຂ້າມ block ອື່ນໝົດ** (ບໍ່ເບິ່ງຕໍ່).

```
score = 75
→ score >= 80? ບໍ່ (75 < 80)
→ score >= 60? ແມ່ນ (75 >= 60) → print "ລະດັບ B" ແລ້ວອອກ
```

## ເງື່ອນໄຂຊ້ອນກັນ (Nested if) ແລະ ປະສົມ (&&, ||)

```java
int age = 20;
boolean hasTicket = true;

if (age >= 18 && hasTicket) {
    System.out.println("ເຂົ້າຊົມໄດ້");
} else {
    System.out.println("ເຂົ້າຊົມບໍ່ໄດ້");
}
```

## switch

ໃຊ້ແທນ `if-else` ຫຼາຍຊັ້ນ ຕອນທີ່ກວດຄ່າດຽວກັບຫຼາຍໆກໍລະນີ:

```java
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
```

⚠️ **ຫ້າມລືມ `break`** — ຖ້າບໍ່ມີ `break` code ຈະ "ໄຫຼຕໍ່" ໄປ case ຕໍ່ໄປໂດຍບໍ່ກວດເງື່ອນໄຂ (ເອີ້ນວ່າ fall-through) ເຊິ່ງປົກກະຕິບໍ່ແມ່ນທີ່ຕ້ອງການ.

## ternary operator `? :` (if-else ແບບສັ້ນ)

```java
int age = 20;
String status = (age >= 18) ? "ຜູ້ໃຫຍ່" : "ເດັກ";
```
ອ່ານວ່າ: "ຖ້າ age >= 18 ແມ່ນ true → status = ຜູ້ໃຫຍ່, ບໍ່ດັ່ງນັ້ນ → status = ເດັກ"

---

## Exercise

ໄປທີ່ `src/main/java/org/example/lesson03/ConditionsExercise.java` ແລະ ເຮັດຕາມ `TODO`

---
ກ່ອນໜ້າ: [ບົດທີ 2 — Operator](02-operators.md)
