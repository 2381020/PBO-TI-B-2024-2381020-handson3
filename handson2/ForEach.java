package handson2;

public class ForEach {
        public static void main(String[] args) {
            // Membuat array dari 1 sampai 20
            int[] numbers = new int[20];
            for (int i = 0; i < 20; i++) {
                numbers[i] = i + 1;
            }

            // Menggunakan for-each loop
            System.out.println("Bilangan genap dari 1 sampai 20 :");
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
