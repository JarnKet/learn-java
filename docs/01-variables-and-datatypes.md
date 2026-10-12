# ບົດທີ 1: Variable ແລະ Data Type

## Variable ແມ່ນຫຍັງ

Variable (ຕົວແປ) = ບ່ອນເກັບຂໍ້ມູນໄວ້ໃຊ້ງານ, ຄືກ່ອງທີ່ຕິດປ້າຍຊື່ ແລະ ເກັບຄ່າໄວ້ຂ້າງໃນ.

ຮູບແບບການປະກາດ:
```java
dataType variableName = value;
```

ຕົວຢ່າງ:
```java
int age = 20;
```
- `int` = data type (ປະເພດຂໍ້ມູນ)
- `age` = ຊື່ຕົວແປ
- `20` = ຄ່າທີ່ເກັບ

## Data Type ພື້ນຖານ (Primitive Type)

| Type | ໃຊ້ເກັບ | ຕົວຢ່າງຄ່າ |
|---|---|---|
| `int` | ເລກຈຳນວນເຕັມ | `10`, `-5`, `0` |
| `double` | ເລກທົດສະນິຍົມ | `3.14`, `-0.5` |
| `boolean` | ຄ່າຈິງ/ບໍ່ຈິງ | `true`, `false` |
| `char` | ຕົວອັກສອນ 1 ໂຕ | `'A'`, `'7'` |
| `long` | ເລກຈຳນວນເຕັມ (ໃຫຍ່ກວ່າ int) | `10000000000L` |

## String (ບໍ່ແມ່ນ primitive, ແຕ່ໃຊ້ຫຼາຍ)

`String` ໃຊ້ເກັບ "ຂໍ້ຄວາມ" (ຕົວອັກສອນຫຼາຍໂຕຕໍ່ກັນ):
```java
String name = "Ketsadaphone";
```
> ສັງເກດ: `char` ໃຊ້ `' '` (ມົນ), `String` ໃຊ້ `" "` (ຄູ່) — ໃຊ້ຜິດຈະ error!

## ຕົວຢ່າງລວມ

```java
int age = 20;
double price = 15000.50;
boolean isStudent = true;
char grade = 'A';
String name = "ມະລີ";

System.out.println("ຊື່: " + name);
System.out.println("ອາຍຸ: " + age);
System.out.println("ລາຄາ: " + price);
System.out.println("ເປັນນັກສຶກສາ: " + isStudent);
System.out.println("ຄະແນນ: " + grade);
```

ສັງເກດ: ເຄື່ອງໝາຍ `+` ລະຫວ່າງ String ກັບຕົວແປອື່ນ ຄືການ "ຕໍ່ຂໍ້ຄວາມ" (concatenation) ບໍ່ແມ່ນການບວກເລກ.

## Casting (ການປ່ຽນ type)

ບາງຄັ້ງຕ້ອງປ່ຽນຂໍ້ມູນຈາກ type ໜຶ່ງ ໄປອີກ type:

```java
double d = 9.7;
int i = (int) d;   // i = 9 (ຕັດທົດສະນິຍົມ, ບໍ່ໃຊ້ຫຼັກການຮອບເລກ)
```

## `final` — ຕົວແປທີ່ປ່ຽນຄ່າບໍ່ໄດ້

```java
final double PI = 3.14159;
// PI = 5; <- ຈະ error ເພາະ final ຫ້າມປ່ຽນຄ່າ
```

---

## Exercise (ລົງມືຂຽນ)

ໄປທີ່ໄຟລ໌ `src/main/java/org/example/lesson01/VariablesExercise.java` ແລະ ເຮັດຕາມ `TODO` ທີ່ວາງໄວ້.

---
ກ່ອນໜ້າ: [ບົດທີ 0 — Project Structure](00-project-structure.md)
