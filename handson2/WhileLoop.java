package handson2;

public class WhileLoop {
        public static void main(String[] args) {
            int i = 1;  // Langkah 1: Deklarasi variabel i
            System.out.println("Bilangan genap dari 1 sampai 20 : ");
            while (i <= 20) {  // Langkah 2: Selama i <= 20, loop akan berjalan
                if (i % 2 == 0) {  // Langkah 3: Cek apakah i genap
                    System.out.print(i + " ");  // Langkah 4: Cetak angka genap
                }
                i++;  // Langkah 5: Increment i
            }
            System.out.println();  // Tambah baris baru setelah loop selesai
        }
    }

/*
Penjelasan Eksekusi while loop:

Deklarasi awal: int i = 1.
Kondisi loop: Selama i <= 20, loop akan terus berjalan.
Cek bilangan genap: Setiap kali, if (i % 2 == 0) memeriksa apakah i genap.
Cetak angka: Jika genap, angka tersebut dicetak.
Increment: Pada setiap iterasi, i akan ditambah 1.
*/