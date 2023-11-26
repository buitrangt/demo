public class Loop {


    static void printDayOfWeek(int day) {
        switch (day) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
                break;
        }
    }

    static void printNumbersUpTo(int number) {
        for (int index = 0; index < number; index++) {
            System.out.println(index + 1);
        }
    }

    static void sumOfEvenNumbers(int number) {
        int index = 1;
        int sum = 0;
        while (index <= number) {
            if (index % 2 == 0) {
                sum += index;
            }
            index++;
        }
        System.out.println(sum);
    }

    static void printMultiplesOf(int number) {
        int multiplier = 1;
        do {
            System.out.print(multiplier * number + " ");
            multiplier++;
        } while (multiplier <= 10);
    }

    static void printDaysInMonth(int month) {
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }
    }

    static void calculateFactorial(int number) {
        int factorial = 1;
        for (int index = number; index >= 1; index--) {
            factorial *= index;
        }
        System.out.println(factorial);
    }

    static void reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(reversedNumber);
    }

    static void printShapeType(int number) {
        switch (number) {
            case 1:
                System.out.println("Square");
                break;
            case 2:
                System.out.println("Circle");
                break;
            case 3:
                System.out.println("Triangle");
                break;
        }
    }

    static int checkPrime(int number) {
        int divisor = 2;
        while (divisor <= Math.sqrt(number)) {
            if (number % divisor == 0) return 0;
            divisor++;
        }
        return 1;
    }

    static void printGrade(int mark) {
        switch (mark) {
            case 4:
                System.out.println("F");
                break;
            case 5:
                System.out.println("D");
                break;
            case 6:
                System.out.println("C");
                break;
            case 7:
                System.out.println("B");
                break;
            case 8:
                System.out.println("A");
                break;
        }
    }

    static void calculateSumUpTo(int number) {
        int sum = 0;
        for (int index = 0; index < number; index++) {
            sum += (index + 1);
        }
        System.out.println(sum);
    }

    static void countDigits(int number) {
        int digitCount = 0;
        while (number > 0) {
            int digit = number % 10;
            digitCount++;
            number = number / 10;
        }
        System.out.println(digitCount);
    }


    public static int fibonacci(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }






            static void reverseString(String str) {
            int length = str.length();
            String reversedString = "";
            int i = length - 1;
            do {
                reversedString = reversedString + str.charAt(i);
                i--;
            } while (i >= 0);
            System.out.println(reversedString);
        }

        static void printFibonacciSequence(int limit) {
            int firstNumber = 0, secondNumber = 1;
            for (; firstNumber <= limit; ) {
                System.out.print(firstNumber + " ");
                int sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
            }
        }



    public static void main(String[] args) {
//        printDayOfWeek(5);
//        printNumbersUpTo(10);
//        printMultiplesOf(2);
//        System.out.println("\n");
//        sumOfEvenNumbers(50);
//        printDaysInMonth(8);
//        calculateFactorial(3);
//        printShapeType(3);
//        if(checkPrime(5)==1)
//        {
//            System.out.println("YES");
//        }
//        else System.out.println("NO");
//        calculateSumUpTo(100);
//        printGrade(8);
       // countDigits(12345678);
//        reverseNumber(5678);
      // reverseString("hello trang");
       // printFibonacciSequence(50);
                System.out.println("10 so dau cua bang fibonacci la: ");
                for (int index = 0; index < 4; index++) {
                    int number1=fibonacci(index);
                    System.out.print("fibonacci" + " ");
                    System.out.println(number1);

                }
    }
}

   /* public static void main(String[] args) {
        System.out.println("10 so dau cua bang fibonacci la: ");
        for (int index = 0; index < 10; index++) {
            System.out.println("fibonacci" + " ");
        }
    }
    public static int fibonacci(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0 || number ==1 ) {
            return number;
        }else {
            return fibonacci(number - 1) + fibonacci(number - 2) ;
            */
