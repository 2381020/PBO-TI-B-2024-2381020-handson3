package handson2;

public class DoWhile {
        public static void main(String[] args) {
            int i = 1;
            System.out.println("Bilangan genap dari 1 sampai 20 :");
            do {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= 20);
            System.out.println();
        }
    }

