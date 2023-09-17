# Java'da "Employee" Sınıfı

Java'da, fabrika çalışanlarını temsil etmek ve maaşlarını hesaplamak için "Employee" adında bir sınıf oluşturmanız gerekmektedir. Bu sınıfın 4 niteliği ve 5 metodu bulunmaktadır.

## Sınıfın Nitelikleri

- `name`: Çalışanın adı ve soyadı.
- `salary`: Çalışanın maaşı.
- `workHours`: Haftalık çalışma saati.
- `hireYear`: İşe başladığı yıl.

## Sınıfın Metotları

 `Employee(name, salary, workHours, hireYear)`: 4 parametre alabilen kurucu metot.

### `tax()`: Maaşa uygulanan vergiyi hesaplar.
- Maaş 1000 TL'den az ise vergi uygulanmaz.
- Maaş 1000 TL'den fazla ise maaşın %3'ü kadar vergi uygulanır.

### `bonus()`: Haftalık çalışma saati 40 saatten fazla ise her fazladan saat için bonus ücretini hesaplar.
- Bonus saat başına 30 TL olarak hesaplanır.

### `raiseSalary()`: Çalışanın hizmet yılına göre maaş artışını hesaplar. Şu anki yıl 2021 olarak kabul edilir.
- Çalışan 10 yıldan az süre çalıştıysa maaşına %5 zam yapılır.
- Çalışan 9 yıldan fazla ve 20 yıldan az çalıştıysa maaşına %10 zam yapılır.
- Çalışan 19 yıldan fazla çalıştıysa %15 zam yapılır.

### `toString()`: Çalışanın bilgilerini ekrana basar.
