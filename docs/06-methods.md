# ບົດທີ 6: Method (Function)

## Method ແມ່ນຫຍັງ

Method = ກ້ອນ code ທີ່ມີຊື່, ເຮັດໜ້າວຽກສະເພາະອັນໜຶ່ງ, ແລະ **ເອີ້ນໃຊ້ຄືນໄດ້ຫຼາຍເທື່ອ** ໂດຍບໍ່ຕ້ອງຂຽນ code ຊ້ຳ. ຕົວຢ່າງທີ່ຜ່ານມາ `main` ກໍຄື method ອັນໜຶ່ງ!

## ໂຄງສ້າງ Method

```java
returnType methodName(parameterType paramName) {
    // ເຮັດວຽກ
    return value;  // ຖ້າ returnType ບໍ່ແມ່ນ void
}
```

ຕົວຢ່າງ:
```java
static int add(int a, int b) {
    return a + b;
}
```

| ສ່ວນ | ຄວາມໝາຍ |
|---|---|
| `static` | ຍັງຕ້ອງໃຊ້ (ເພາະ `main` ເອີ້ນແບບ static, ລາຍລະອຽດ OOP ຮຽນຕໍ່ໄປ) |
| `int` (returnType) | method ນີ້ຈະ **return ຄ່າເປັນ int** ຄືນ |
| `add` | ຊື່ method |
| `(int a, int b)` | **parameter** — ຂໍ້ມູນທີ່ສົ່ງເຂົ້າມາໃຊ້ພາຍໃນ method |
| `return a + b;` | ຄືນຄ່າ (ຜົນຄຳນວນ) ອອກໄປ |

## ການເອີ້ນໃຊ້ (Call) Method

```java
public static void main(String[] args) {
    int result = add(5, 3);     // ເອີ້ນ method add, ສົ່ງ 5 ແລະ 3 ເປັນ argument
    System.out.println(result); // 8
}

static int add(int a, int b) {
    return a + b;
}
```

> **Parameter vs Argument:** parameter ຄືຊື່ຕົວແປທີ່ປະກາດໃນ method (`a`, `b`), argument ຄືຄ່າຈິງທີ່ສົ່ງເຂົ້າໄປຕອນເອີ້ນ (`5`, `3`)

## `void` — Method ທີ່ບໍ່ return ຄ່າ

```java
static void greet(String name) {
    System.out.println("ສະບາຍດີ " + name);
    // ບໍ່ມີ return ເພາະ void
}

public static void main(String[] args) {
    greet("ມະລີ");   // ແຕ່ເອີ້ນໄດ້, ບໍ່ຕ້ອງເອົາຄ່າໃສ່ຕົວແປ
}
```

## Method ບໍ່ມີ parameter

```java
static int getRandomNumber() {
    return 42;
}
```

## Method Overloading — ຊື່ດຽວກັນ, parameter ຕ່າງກັນ

Java ອະນຸຍາດໃຫ້ມີ method **ຊື່ດຽວກັນ** ແຕ່ parameter list ຕ່າງກັນ (ຕ່າງຈຳນວນ ຫຼື ຕ່າງ type):

```java
static int add(int a, int b) {
    return a + b;
}

static double add(double a, double b) {
    return a + b;
}

static int add(int a, int b, int c) {
    return a + b + c;
}
```
Java ຈະເລືອກ method ທີ່ "ຕົງ" ກັບ argument ທີ່ສົ່ງເຂົ້າໄປ ອັດຕະໂນມັດ.

## ເຫດຜົນທີ່ຕ້ອງໃຊ້ Method

1. **DRY (Don't Repeat Yourself)** — ບໍ່ຕ້ອງຂຽນ code ຊ້ຳ
2. **ແບ່ງບັນຫາເປັນສ່ວນນ້ອຍ** — ແຕ່ລະ method ເຮັດໜ້າວຽກດຽວ, ອ່ານ ແລະ debug ງ່າຍຂຶ້ນ
3. **Reuse** — ຂຽນຄັ້ງດຽວ ເອີ້ນໃຊ້ຫຼາຍບ່ອນ

ນີ້ຄືພື້ນຖານ **logic ການແຍກບັນຫາ** ທີ່ຈະໃຊ້ຕະຫຼອດ — ລວມທັງຕອນສ້າງ Backend API ໃນອະນາຄົດ (REST endpoint ແຕ່ລະອັນ ຈະຢູ່ໃນ method ຂອງມັນເອງ).

---

## Exercise

ໄປທີ່ `src/main/java/org/example/lesson06/MethodsExercise.java` ແລະ ເຮັດຕາມ `TODO`

---
ກ່ອນໜ້າ: [ບົດທີ 5 — Array](05-arrays.md)
