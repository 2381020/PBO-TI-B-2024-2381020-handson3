package handson2;

public class DoWhile {
        public static void main(String[] args) {
            int i = 1;  // Langkah 1: Deklarasi variabel i
            System.out.println("Bilangan genap dari 1 sampai 20 : ");
            do{
                if (i % 2 == 0) {  // Langkah 2: Cek apakah i genap
                    System.out.print(i + " ");  // Langkah 3: Cetak angka genap
                }
                i++;  // Langkah 4: Increment i
            }while (i <= 20);  // Langkah 5: Periksa kondisi setelah eksekusi
            System.out.println();  // Tambah baris baru setelah loop selesai
        }
    }

/*
Penjelasan Eksekusi do-while loop:

Deklarasi awal: int i = 1.
Cek bilangan genap: if (i % 2 == 0) memeriksa apakah i genap.
Cetak angka: Jika genap, angka tersebut dicetak.
Increment: Setelah setiap iterasi, i ditambah 1 (i++).
Kondisi loop: Kondisi i <= 20 dicek setelah setiap eksekusi iterasi.
*/