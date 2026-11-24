   
    // Three-digit numbers where the sum of squared digits equals the number.
static void question1() {

 System.out.println("\nQuestion 1:");

 for (int i = 1; i <= 9; i++) {
 for (int j = 0; j <= 9; j++) {
 for (int k = 0; k <= 9; k++) {

 int number = i * 100 + j * 10 + k;
 int sum = (i * i) + (j * j) + (k * k);

 if (number == sum) {
 System.out.println(number);
                    }
                }
            }
        }
    }