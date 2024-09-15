package handson2;

public class ForLoop {
        public static void main(String[] args) {
            System.out.println("Bilangan genap dari 1 sampai 20 (for loop):");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

/*
Penjelasan Eksekusi for loop:

Deklarasi awal: int i = 1, variabel i dimulai dari 1.
Kondisi loop: Selama i <= 20, loop akan berjalan.
Cek bilangan genap: Pada setiap iterasi, if (i % 2 == 0) memeriksa apakah i genap.
Cetak angka: Jika bilangan genap, System.out.print(i + " ") mencetak angka tersebut.
Increment: Setelah setiap iterasi, i ditambah dengan 1 (i++).
*/