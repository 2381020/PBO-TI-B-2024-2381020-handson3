package handson2;

public class ForEach {
        public static void main(String[] args) {
            int[] numbers = new int[20];  // Langkah 1: Buat array dengan ukuran 20
            for (int i = 0; i < 20; i++) {  // Langkah 2: Isi array dengan angka 1-20
                numbers[i] = i + 1;
            }

            System.out.println("Bilangan genap dari 1 sampai 20 : ");
            for (int num : numbers) {  // Langkah 3: Iterasi setiap elemen array
                if (num % 2 == 0) {  // Langkah 4: Cek apakah num genap
                    System.out.print(num + " ");  // Langkah 5: Cetak angka genap
                }
            }
            System.out.println();  // Tambah baris baru setelah loop selesai
        }
    }

/*
Penjelasan Eksekusi Enhanced for loop (for-each):

Buat array: int[] numbers = new int[20]; – buat array berukuran 20.
Isi array: Loop for (int i = 0; i < 20; i++) mengisi array numbers[] dengan angka dari 1 hingga 20.
For-each loop: Loop for (int num : numbers) iterasi setiap elemen num dalam array numbers.
Cek bilangan genap: if (num % 2 == 0) memeriksa apakah num genap.
Cetak angka: Jika genap, angka tersebut dicetak.
*/