## Laporan Praktikum #6 - Inheritance

## Kompetensi

1.    Memahami konsep dasar inheritance atau pewarisan.

2.    Mampu membuat suatu subclass dari suatu superclass tertentu.

3.    Mampu mengimplementasikan konsep single dan multilevel inheritance.

4.    Mampu membuat objek dari suatusubclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclass nya.

## Ringkasan Materi

Inheritance atau pewarisan sifat merupakan suatu cara untuk menurunkan suatu class yang lebih umum menjadi suatu class yang lebih spesifik. Inheritance adalah salah satu ciri utama suatu bahasa program yang berorientasi pada objek. Inti dari pewarisan adalah sifat reusable dari konsep object oriented. Setiap subclass akan “mewarisi” sifat dari superclass selama bersifat protected ataupun public.

Dalam inheritance terdapat dua istilah yang sering digunakan. Kelas yang menurunkan disebut kelas dasar (base class/super class), sedangkan kelas yang diturunkan disebut kelas turunan (derived class/sub class/child class) . Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-­‐nya. Kata kunci extends tersebut memberitahu kompiler Java bahwa kita ingin melakukan perluasan class. Berikut adalah contoh deklarasi inheritance.

Single inheritance adalah Suatu class yang hanya mempunyai satu parent class. Multilevel inheritance adalah Suatu subclass bisa menjadi superclass bagi class yang lain. 

## Percobaan

### Percobaan 1

Link kode program : 

- [ClassA1841720046Reza](../../src/6_Inheritance/Percobaan1/ClassA1841720046Reza.java)

- [ClassB1841720046Reza](../../src/6_Inheritance/Percobaan1/ClassB1841720046Reza.java)

- Class Main, Percobaan11841720046Reza.java
![contoh screenshot](img/percobaan1.PNG)


- [Pecobaan11841720046Reza](../../src/6_Inheritance/Percobaan1/Percobaan1841720046Reza.java)


###Pertanyaan Percobaan 1

1.Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!

2.Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
- Program error terjadi karena kurangnya penambahan extends pada Class classB184172046Reza.java, sehingga saat program dijalankan akan mengalami error


### Percobaan 2
Link kode program : 

- [ClassA1841720046Reza](../../src/6_Inheritance/Percobaan2/ClassA1841720046Reza.java)


- [ClassB1841720046Reza](../../src/6_Inheritance/Percobaan2/ClassB1841720046Reza.java)

- Class Main, Percobaan21841720046Reza.java
![contoh screenshot](img/percobaan2.PNG)

- [Percobaan21841720046Reza](../../src/6_Inheritance/Percobaan2/Percobaan21841720046Reza.java)

## Pertanyaan Percobaan 2

1.Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!



2.Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

- Karena kurangnya penambahan method Getter pada ClassA1841720046Reza,ClassB1841720046Reza,dan kurangnya extends pada ClassB1841720046Reza. Sehingga ketika program dijalankan akan terjadi eror

### Percobaan 3


Link kode program   :

- [Bangun1841720046Reza](../../src/6_Inheritance/Percobaan2/Bangun1841720046Reza.java)


- [Tabung1841720046Reza](../../src/6_Inheritance/Percobaan2/Tabung1841720046Reza.java)

![contoh screenshot](img/percobaan3.PNG)

[Percobaan31841720046Reza](../../src/6_Inheritance/Percobaan3/Percobaan31841720046Reza.java)


## Pertanyaan Percobaan 3


1.Jelaskan fungsi “super” pada potongan program berikut di class Tabung!
- Merujuk/mengakses atribut dari parent class/superclass

2.Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!
- "super" berfungsi untuk merujuk/mengakses atribut dari parent class/superclass, sedangkan "this" berfungsi untuk merujuk/mengakses atribut dari class itu sendiri


### Percobaan 4

- [ClassA1841720046Reza](../../src/6_Inheritance/Percobaan4/ClassA1841720046Reza.java)

 - [ClassB1841720046Reza](../../src/6_Inheritance/Percobaan4/ClassB1841720046Reza.java)

- [ClassC1841720046Reza](../../src/6_Inheritance/Percobaan4/ClassC1841720046Reza.java)

![contoh screenshot](img/percobaan4.PNG)

- [Percobaan41841720046Reza](../../src/6_Inheritance/Percobaan4/Percobaan41841720046Reza.java)

### Pertanyaan Percobaan 4

1.Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!

- superclass: ClassA1841720046Reza dan ClassB1841720046Reza

- subclass : ClassC1841720046Reza
- alasan : pertama ClassB1841720046Reza
merupakan subclass dari ClassA1841720046Reza, sehingga dalam hal ini ClassA1841720046Reza adalah superclass dan ClassB1841720046Reza adalah subclass.

2.Ubahlah isi konstruktor default ClassC seperti berikut:

![contoh screenshot](img/percobaan4.PNG)


### Percobaan 5


Link kode program : 
- [ClassKaryawan1841720046Reza](../../src/6_Inheritance/Percobaan5/Karyawan1841720046Reza.java)

- [ClassManager1841720046Reza](../../src/6_Inheritance/Percobaan5/Manager1841720046Reza.java)

- [ClassStaff1841720046Reza](../../src/6_Inheritance/Percobaan5/Staff1841720046Reza.java)

- Clas Main,
![contoh screenshot](img/percobaan5.PNG)

- [Inheritance11841720046Reza](../../src/6_Inheritance/Percobaan5/Inheritance11841720046Reza.java)

### Pertanyaan Percobaan 5

1.Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!

 - superclass :Karyawan1841720046Reza

- subclass : Manager1841720046Reza dan Staff1841720046Reza

2.Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?

- subclass extends superclass

3.Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!

- atribut pada class 
Manager1841720046Reza.java : tunjungan - atribut pada class
Karyawan1841720046Reza : nama,alamat,jk,umur,gaji

4.Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!

- Digunakan untuk merujuk/mengakses atribut gaji dari parent class/superclass 
Karyawan1841720046Reza

5.Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!
 Single Inheritance, karena class 
 Manager1841720046Reza dan Staff1841720046Reza hanya mempunyai satu parent class yaitu Karyawan1841720046Reza

 ### Percobaan 6

 - [ClassStaffHarian1841720046Reza](../../src/6_Inheritance/Percobaan5/StaffHarian1841720046Reza.java)

 - [ClassStaffTetap1841720046Reza](../../src/6_Inheritance/Percobaan5/StaffTetap1841720046Reza.java)

- Clas Main,
![contoh screenshot](img/percobaan6.PNG)

- [Inheritance21841720046Reza](../../src/6_Inheritance/Percobaan5/Inheritance21841720046Reza.java)

### Pertanyaan Percobaan 6
1.Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?

- Single Inheritance : 
Karyawan1841720046Reza,Manager1841720046Reza,dan Staff1841720046Reza

- Staff1841720046Reza
Staff1841720046Reza,dan
StaffTetap1841720046Reza

- Multilevel Inheritance :
Karyawan1841720046Reza,
Staff1841720046Reza,dan
StaffHarian1841720046Reza

- Karyawan1841720046Reza,
staff1841720046Reza,dan
StaffTetap1841720046Reza

2.Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!

- StaffHarian1841720046Reza:jmlJamKerja
- StaffTetap1841720046Reza:golongan dan asuransi
- Staff1841720046Reza: nama,alamat,jk,umur,gaji,lembur,dan potongan 

3.Apakah fungsi potongan program berikut pada class StaffHarian
- Berguna untuk merujuk / memanggil konstruktor berparamter dari superclass

4.Apakah fungsi potongan program berikut pada class StaffHarian

- Berfungsi untuk merujuk/memanggil method
tampilDataReza dari parent
class/superclass yaitu Staff1841720046Reza.java

5.Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap



- Karena sudah terdapat super(nama, alamat, jk, umur, gaji, potongan, lembur) 


## Tugas

1.Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini. Kemudian buatlah instansiasi objek untuk menampilkan data pada class Mac, Windows dan Pc!.

![contoh screenshot](img/tgs1.PNG)


- [Komputer](../../src/6_Inheritance/Tugas/Komputer.java)

![contoh screenshot](img/tgs2.PNG)

- [Laptop](../../src/6_Inheritance/Tugas/Laptop.java)

![contoh screenshot](img/tgs4.PNG)

- [Pc](../../src/6_Inheritance/Tugas/Pc.java)

![contoh screenshot](img/tgs3.PNG)
- [Mac](../../src/6_Inheritance/Tugas/Mac.java)


![contoh screenshot](img/tgs5.PNG)
- [Windows](../../src/6_Inheritance/Tugas/Windows.java)

- Class Main, ![contoh screenshot](img/tugas.PNG)
- [Tugas1841720046Reza](../../src/6_Inheritance/Tugas/Tugas1841720046Reza.java)
