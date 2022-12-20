package JavaClass;

public class Problem {

    public String name = "Aram";

    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    private double engine ;
    public double getEngine() {
        return engine;
    }
    public void setEngine(double e) {
        if (e > 0)
            engine = e;
    }
    //-------------------------------------------





    //-------------------------------------------
    //Xndirner
    public void print7() {
        int n = 7;
        int number[] = {1, 4, 7, -5, 3, 7, 32, 4, -7};
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == n) {
                count++;
            }
        }
        System.out.println(count);

    }

    public void oddNumbers() {
        int numbers[] = {1, 4, 7, -5, 3, 7, 32, 4, -7, 12};
        System.out.println("Task 2");
        int[] oddNumbrs = new int[numbers.length];
        int[] evenNumbers = new int[numbers.length];
        int oddNumberIndex = 0;
        int evenNumberIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                oddNumbrs[oddNumberIndex] = numbers[i];
                oddNumberIndex++;
            } else {
                evenNumbers[evenNumberIndex] = numbers[i];
                evenNumberIndex++;
            }
        }
        System.out.println("The Array of even numbers are :");
        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] != 0) {
                System.out.print(evenNumbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("The Array of odd numbers are :");
        for (int i = 0; i < oddNumbrs.length; i++) {
            if (oddNumbrs[i] != 0) {

                System.out.print(oddNumbrs[i] + " ");
            }
        }
    }

    public void CommonElements() {
        int[] firstArray = {3, 6, 0, -3, 2, 2, 13};
        int[] secondArray = {0, 56, -5, 45, 2, 2, 0, 12, 6, 13, 56};
        int minLengthOfGivenArrays = firstArray.length > secondArray.length
                ? secondArray.length : firstArray.length;
        // the number which we will use to indicate that we already found matching for a current item (from 1st array) in the 2nd array
        int indicator = 67;
        // nshelu tiv@ -> 0
        // {0, 6, 2, 2, 13, 0, 0}
        int[] commonElements = new int[minLengthOfGivenArrays];
        int currentIndexOfCommonArray = 0;
        int countOfZerosForFirstArray = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == indicator) {
                countOfZerosForFirstArray++;
            }
        }
        int countOfZerosForSecondArray = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == indicator) {
                countOfZerosForSecondArray++;
            }
        }
        // cover indicator case
        if (countOfZerosForFirstArray > 0 && countOfZerosForSecondArray > 0) {
            int minZeroCount = countOfZerosForFirstArray > countOfZerosForSecondArray ?
                    countOfZerosForSecondArray : countOfZerosForFirstArray;
            while (minZeroCount != 0) {
                commonElements[currentIndexOfCommonArray++] = indicator;
                minZeroCount--;
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == indicator) {
                continue;
            }
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    commonElements[currentIndexOfCommonArray++] = firstArray[i];
                    secondArray[j] = indicator;
                    break;
                }
            }
        }
        System.out.println("Common elements: ");
        for (int i = 0; i < currentIndexOfCommonArray; i++) {
            System.out.print(commonElements[i] + " ");
        }
    }


    public void MissingNumber() {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        System.out.println("Missing number is " + sum);
    }

    public void MinNumber() {
        int[] array = {1, 4, 7, -5, 3, 7, -32, 4, -7, 123,};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum Number is " + min);
    }

    public void Palindrom() {
        int[] numbers = {1, 4, -6, 8, 8, -6, 4, 1};

        int reverse = numbers.length - 1;
        int count = 0;
        int p = numbers.length / 2;

        for (int i = 0; i < p; i++) {
            if (numbers[i] != numbers[reverse]) {
                System.out.println("NO");
                break;
            }
            reverse--;
            count++;
        }
        if (count == p) {
            System.out.println("YES");
        }

    }

    public void InAscendingOrder() {
        int exersice[] = {-2, 1, 7, 9, 14, 26, 30};
        int n = 0;
        int count = 0;
        for (int i = 0; i < exersice.length - 1; i++) {
            if (exersice[i] > exersice[i + 1]) {
                count++;
            }
        }
        if (count == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void Prime() {
        int n = 11;
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }

    public void Matrix() {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
                {3, 4, 5, 0}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("__________________-");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void FirstRepeatingNumberIndex() {
        int[] numbers = {4, 2, 7, -5, 9, 6, 7, 9, -2, -5, 7};
        int firstRepeatingNumber = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    firstRepeatingNumber = numbers[i];
                    i = numbers.length - 1;
                    break;
                }

            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (firstRepeatingNumber == numbers[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public void Swap() {
        int[] array = {2, -6, -8, 5, -4, 90, 13, -68, 0, -7};
        int a = 0;
        int k = 5;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                    //swap
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(array[k - 1]);
    }
    //--------------------------------------------------






}
