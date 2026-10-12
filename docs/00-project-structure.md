# ບົດທີ 0: ໂຄງສ້າງ Project ແລະ ໂຄງສ້າງ Code ພື້ນຖານ

## Maven Project Structure

```
HelloJava/
├── pom.xml                  <- ຕັ້ງຄ່າ project (version, dependency)
├── docs/                    <- ບົດຮຽນ / ບັນທຶກ (ໄຟລ໌ນີ້ຢູ່ບ່ອນນີ້)
└── src/
    ├── main/java/           <- code ຕົວຈິງຂອງໂປຣແກຣມ
    │   └── org/example/     <- package (ຕ້ອງກົງກັບ folder path)
    └── test/java/           <- ໄຟລ໌ test (ຍັງບໍ່ໃຊ້ຕອນນີ້)
```

## Package

`package org.example;` ຢູ່ແຖວເທິງສຸດຂອງໄຟລ໌ `.java` — ບອກວ່າ class ນີ້ຢູ່ໃນກຸ່ມ (package) ໃດ.

**ກົດສຳຄັນ:** ຊື່ package ຕ້ອງກົງກັບ folder path ຫຼັງ `java/` ເລີຍ

| ໄຟລ໌ຢູ່ທີ່ | package ຕ້ອງເປັນ |
|---|---|
| `src/main/java/org/example/Main.java` | `package org.example;` |
| `src/main/java/org/example/lesson01/VariablesDemo.java` | `package org.example.lesson01;` |

ຖ້າບໍ່ກົງກັນ IntelliJ ຈະເຕືອນສີແດງ.

## ໂຄງສ້າງ Class + main method

```java
package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }
}
```

| ຄຳ | ຄວາມໝາຍ |
|---|---|
| `class Main` | ປະກາດ class ຊື່ `Main` — **ຊື່ class ຕ້ອງກົງກັບຊື່ໄຟລ໌** (`Main.java`) |
| `public` (ໜ້າ class) | ເປີດໃຫ້ code ພາຍນອກ package ເຫັນ ແລະ ເອີ້ນໃຊ້ class ນີ້ໄດ້ |
| `public static void main(String[] args)` | method ທີ່ JVM ຈະ run ກ່ອນໝູ່ ຕອນເປີດໂປຣແກຣມ |
| `public` (ໜ້າ main) | JVM (ມາຈາກນອກ class) ຕ້ອງເອີ້ນ method ນີ້ໄດ້ |
| `static` | method ຜູກກັບ class ໂດຍກົງ, ບໍ່ຕ້ອງສ້າງ object ກ່ອນ (ລາຍລະອຽດ OOP ຈະຮຽນຕໍ່ໄປ) |
| `void` | method ນີ້ບໍ່ return ຄ່າຫຍັງຄືນ |
| `main` | ຊື່ method — ຕ້ອງຊື່ນີ້ແທ້ໆ ຕົວນ້ອຍໝົດ, JVM ຈຶ່ງຮູ້ຈັກ |
| `String[] args` | parameter — array ຂອງຂໍ້ຄວາມທີ່ສົ່ງເຂົ້າມາຕອນ run ຜ່ານ command line (ຍັງບໍ່ຈຳເປັນໃຊ້ຕອນນີ້) |

## System.out.println

`System.out.println(...)` = print ຂໍ້ຄວາມອອກໜ້າຈໍ ແລະ ຂຶ້ນແຖວໃໝ່ (ຖ້າບໍ່ຢາກຂຶ້ນແຖວໃໝ່ ໃຊ້ `System.out.print(...)`)

---
ຕໍ່ໄປ: [ບົດທີ 1 — Variable & Data Type](01-variables-and-datatypes.md)
