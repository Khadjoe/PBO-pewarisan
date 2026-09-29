# PBO-pewarisan

Latihan Pemrograman Berorientasi Objek

Repositori ini berisi implementasi dari latihan Pemrograman Berorientasi Objek menggunakan Java, yang terdiri dari kelas Bentuk, BujurSangkar, Lingkaran, dan Silinder.

Program ini mendemonstrasikan tiga pilar utama dalam OOP: Encapsulation (Enkapsulasi), Inheritance (Pewarisan), dan Polymorphism (Polimorfisme).

1. Encapsulation (Enkapsulasi)

Enkapsulasi adalah konsep menyembunyikan detail implementasi data dan hanya memberikan akses melalui method tertentu (getter dan setter).
Pada kode ini, enkapsulasi diterapkan dengan menggunakan access modifier private pada variabel-variabel kelas, sehingga tidak bisa diubah langsung dari luar kelas:

Pada kelas BujurSangkar: Variabel private double sisi disembunyikan, dan hanya bisa diakses/diubah melalui getSisi() dan setSisi().

Pada kelas Lingkaran: Variabel private double radius disembunyikan, diakses melalui getRadius() dan setRadius().

Pada kelas Silinder: Variabel private double tinggi disembunyikan, diakses melalui getTinggi() dan setTinggi().

2. Inheritance (Pewarisan)

Inheritance memungkinkan sebuah kelas (subclass/child class) mewarisi atribut dan method dari kelas lain (superclass/parent class). Konsep ini mengurangi duplikasi kode (reusability).
Hierarki pewarisan pada kode ini adalah sebagai berikut:

BujurSangkar extends Bentuk: Kelas BujurSangkar mewarisi atribut warna dan method dari kelas Bentuk.

Lingkaran extends Bentuk: Kelas Lingkaran juga merupakan turunan dari Bentuk dan mewarisi atribut warna.

Silinder extends Lingkaran: Kelas Silinder adalah turunan dari Lingkaran. Ia mewarisi atribut warna (dari Bentuk), atribut radius (dari Lingkaran), serta method hitungLuas() yang kemudian digunakan untuk menghitung volume (super.hitungLuas() * tinggi).

Penggunaan keyword super() pada masing-masing constructor subclass digunakan untuk memanggil constructor dari superclass.

3. Polymorphism (Polimorfisme)

Polimorfisme memungkinkan suatu method memiliki banyak bentuk atau implementasi yang berbeda. Dalam kode ini, polimorfisme dicontohkan melalui teknik Method Overriding.

Method printInfo() didefinisikan pertama kali di kelas induk Bentuk.

Kelas BujurSangkar, Lingkaran, dan Silinder masing-masing menimpa (override) method printInfo() tersebut dengan implementasi yang spesifik untuk kelasnya sendiri.

Misalnya, saat printInfo() dipanggil pada objek Lingkaran, ia akan mencetak format "Lingkaran


Screenshot Eksekusi Program

<img width="3420" height="2148" alt="image" src="https://github.com/user-attachments/assets/0ad06d01-6b4e-4281-83ce-7fb45a85014e" />
