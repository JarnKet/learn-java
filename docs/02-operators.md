# ບົດທີ 2: Operator (ຕົວດຳເນີນການ)

## 1. Arithmetic Operator (ຄຳນວນເລກ)

| Operator | ໝາຍຄວາມ | ຕົວຢ່າງ |
|---|---|---|
| `+` | ບວກ | `5 + 3` → `8` |
| `-` | ລົບ | `5 - 3` → `2` |
| `*` | ຄູນ | `5 * 3` → `15` |
| `/` | ຫານ | `5 / 2` → `2` (int ຫານ int ຕັດທົດສະນິຍົມ!) |
| `%` | ຫານເອົາເສດ (modulo) | `5 % 2` → `1` |

⚠️ **ຈຸດສຳຄັນ:** ຖ້າຫານ `int / int` ຜົນຈະເປັນ `int` ສະເໝີ (ຕັດທົດສະນິຍົມອອກ) —
```java
int a = 5 / 2;       // a = 2 (ບໍ່ແມ່ນ 2.5)
double b = 5.0 / 2;  // b = 2.5 (ຕ້ອງໃຫ້ຢ່າງໜຶ່ງເປັນ double)
```

`%` (modulo) ມັກໃຊ້ກວດ "ເລກຄູ່/ເລກຄີກ":
```java
int n = 7;
if (n % 2 == 0) { /* ເລກຄູ່ */ }
else { /* ເລກຄີກ */ }
```

## 2. Comparison Operator (ຕົວດຳເນີນການປຽບທຽບ) — ຜົນລັບເປັນ `boolean` ສະເໝີ

| Operator | ໝາຍຄວາມ |
|---|---|
| `==` | ເທົ່າກັນ |
| `!=` | ບໍ່ເທົ່າກັນ |
| `>` | ຫຼາຍກວ່າ |
| `<` | ໜ້ອຍກວ່າ |
| `>=` | ຫຼາຍກວ່າ ຫຼື ເທົ່າກັບ |
| `<=` | ໜ້ອຍກວ່າ ຫຼື ເທົ່າກັບ |

```java
int age = 20;
boolean canVote = age >= 18;   // true
```

⚠️ ຫ້າມສັບສົນ `=` (assignment, ໃຫ້ຄ່າ) ກັບ `==` (comparison, ປຽບທຽບ)!

## 3. Logical Operator (ຕົວດຳເນີນການທາງຕັກກະ) — ໃຊ້ກັບ `boolean`

| Operator | ໝາຍຄວາມ | ຕົວຢ່າງ |
|---|---|---|
| `&&` | AND (ຕ້ອງຈິງທັງສອງ) | `true && false` → `false` |
| `\|\|` | OR (ຈິງຢ່າງໜຶ່ງກໍພໍ) | `true \|\| false` → `true` |
| `!` | NOT (ປີ້ນຄ່າ) | `!true` → `false` |

```java
int age = 20;
boolean hasId = true;
boolean canEnter = age >= 18 && hasId;   // ຕ້ອງອາຍຸ 18+ ແລະ ມີ ID
```

## 4. Increment / Decrement

| Operator | ໝາຍຄວາມ |
|---|---|
| `i++` | ເພີ່ມຄ່າ i ຂຶ້ນ 1 (ໃຊ້ຫຼາຍໃນ loop) |
| `i--` | ຫຼຸດຄ່າ i ລົງ 1 |
| `i += 5` | ເທົ່າກັບ `i = i + 5` |
| `i -= 5` | ເທົ່າກັບ `i = i - 5` |

## ລຳດັບການຄຳນວນ (Operator Precedence)

ຄືກັນກັບເລກຄະນິດສາດ: `*` `/` `%` ຄຳນວນກ່ອນ `+` `-` ແລະ ໃຊ້ `()` ບັງຄັບລຳດັບໄດ້
```java
int result = 2 + 3 * 4;      // = 14 (ຄູນກ່ອນ)
int result2 = (2 + 3) * 4;   // = 20 (ວົງເລັບກ່ອນ)
```

---

## Exercise

ໄປທີ່ `src/main/java/org/example/lesson02/OperatorsExercise.java` ແລະ ເຮັດຕາມ `TODO`

---
ກ່ອນໜ້າ: [ບົດທີ 1 — Variable & Data Type](01-variables-and-datatypes.md)
