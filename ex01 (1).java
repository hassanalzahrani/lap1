import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /////task1


        System.out.print("enter first number");
        int number1 = scanner.nextInt();
        System.out.print("enter second number");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        int substract = number1 - number2;
        int multiply = number1 * number2;
        int divide = number1 / number2;
        int remainder = number1 % number2;

        System.out.println(number1 + "+" + number2 + "=" + sum);
        System.out.println(number1 + "-" + number2 + "=" + substract);
        System.out.println(number1 + "*" + number2 + "+" + multiply);
        System.out.println(number1 + "/" + number2 + "=" + divide);
        System.out.println(number1 + "%" + number2 + "=" + remainder);


        /////task2


        System.out.println("enter number");
        int number3 = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(number3 + " x " + i + " = " + number3 * i);
        }

        //// task 3


        System.out.println("Enter Raduis");
        double R = scanner.nextDouble();
        double s = 3.141592653;
        double A = R * s;
        System.out.println("Area =" + A);
        double P = 2 * s * R;
        System.out.println("Perimeter" + P);

        // task 4


        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();

        double AV = 0;
        for (int N = 1; N <= count; N++) {
            System.out.print("Enter an integer: ");
            double number = scanner.nextInt();
            AV += number;
        }

        double average = (double) AV / count;

        System.out.println("The average is: " + average);


        //Task 5

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num222 = scanner.nextInt();
        int result = num1 + num222;
        if (result == num222) {
            System.out.println("true" + result);
        } else {
            System.out.println("false");

        }


        /////////////////////////////////////////////task7
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result1 = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result1);


//////////////////task 8


        System.out.print("Enter temperature in centigrade: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");


        /////////////task11


        System.out.print("Input first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " != " + secondNumber + ": " + (firstNumber != secondNumber));
        System.out.println(firstNumber + " < " + secondNumber + ": " + (firstNumber < secondNumber));
        System.out.println(firstNumber + " <= " + secondNumber + ": " + (firstNumber <= secondNumber));


        //////////////task12

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;

        int minutes = remainingSeconds / 60;
        seconds = remainingSeconds % 60;

        System.out.println(seconds + " seconds is equal to:");
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


        /////////////////////task13


        System.out.print("Enter first number: ");
        int firstNumber1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber1 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        System.out.print("Enter fourth number: ");
        int fourthNumber = scanner.nextInt();

        if (firstNumber1 == secondNumber1 && secondNumber1 == thirdNumber && thirdNumber == fourthNumber) {
            System.out.println("All four numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }


        ////////task 14


        System.out.print("Enter an integer: ");
        int num11 = scanner.nextInt();

        if (num11 < 0) {
            System.out.println("The number is negative.");
        } else if (num1 > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }


        /////////////task 15


        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int num3;

        do {
            System.out.print("Enter a number (or -1 to quit): ");
            num3 = scanner.nextInt();

            if (num3 > 0) {
                positiveCount++;
            } else if (num3 < 0) {
                negativeCount++;
            } else if (num3 != -1) {
                zeroCount++;
            }
        } while (num3 != -1);

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zeros count: " + zeroCount);


        //////////////task16


        System.out.print("Enter an integer: ");
        int num5 = scanner.nextInt();

        int reversed = 0;
        while (num5 != 0) {
            int digit = num5 % 10;
            reversed = reversed * 10 + digit;
            num5 /= 10;
        }

        System.out.println("Reversed number: " + reversed);


        //////////////task17


        int num4;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.print("Enter a number (or -1 to quit): ");
        num4 = scanner.nextInt();

        while (num4 != -1) {
            if (num4 > largest) {
                largest = num4;
            }
            if (num4 < smallest) {
                smallest = num4;
            }

            System.out.print("Enter a number (or -1 to quit): ");
            num4 = scanner.nextInt();
        }

        if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
            System.out.println("The largest number: " + largest);
            System.out.println("The smallest number: " + smallest);
        } else {
            System.out.println("No numbers were entered.");
        }


        ////task18

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count1 = 0;
        for (char character : input.toCharArray()) {
            if (character == 'a') {
                count1++;
            }
        }

        System.out.println("Number of a's: " + count);


        ////////////task10


        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);


        /////////task9


        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < str.length()) {
            char character = str.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Invalid index.");
        }

        ///////task6


        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversedWord = reverseString(word);
        System.out.println("Reversed word: " + reversedWord);
    }

    private static String reverseString(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}