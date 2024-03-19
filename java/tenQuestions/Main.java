package tenQuestions;

public class Main {
    public static void main(String[] args) {
        String[] myArray = {"one", "two", "three", "four"};
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(getSecondToLastElement(myArray));
        System.out.println(getSum(ints));
        System.out.println(getAverage(ints));
        System.out.println(extractAllOddNumbers(ints));
        System.out.println(extractAllEvenNumbers(ints));
        System.out.println(contains(myArray , "on"));

    }


    //Question 1
    public static int getLastIndex(String[] names) {

        return names.length - 1;
    }

    //    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];

    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    // Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = ints[i] + sum;
        }
        return sum;
    }

    // Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum = ints[i] + sum;

        }
        return sum / ints.length;
    }

    // Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNum = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNum += numbers[i] + " ";
            }
        }
        return oddNum;
    }


    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String nums = "";
        String evenNum = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNum += numbers[i] + " ";
            }
        }
        return evenNum;
    }


    // Question 10
    public static boolean contains(String[] names, String element) {
        boolean newBool = false;
        for (int i=0; i< names.length; i++){
            if (element.equalsIgnoreCase(names[i])) {
                newBool = true;
            }
        }
            return newBool;
    }
}

//    // Question 11
//    public static int getIndexByElement(String[] names, String element) {
//
//        return 0;
//    }
//
//
//    //Question 12
//    public static void printOddNumbersInRange(int start, int end){
//
//    }
//
//    //Question 13
//    public static String printGivenStringTimesNumberGiven(String str, int n) {
//        return null;
//    }
//
//
//    //Question 14
//    public static int wordsInAStringCounter(String str){
//        return 0;
//    }
//
//    //Question 15 - A, E, I, O, U
//    public static int vowelsCounter(String str){
//
//
//        return 0;
//    }
//
//
//    //Question 16
//
//    public static String[] swap(String[] stringArray) {
//        return null;
//    }
//
//
//    //Question 17
//    /**
//     * Given the following legend
//     *
//     * f   >>   7
//     * s   >>   $
//     * 1   >>   !
//     * a   >>   @
//     *
//     * your method should replace any character represented by a key in the legend, with its corresponding value.
//     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
//     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
//     */
//
//    public static String replaceCharacters(String str) {
//        return null;
//    }
//
//
//
////Question 18
//    /*"The  Wu  Tang  Wu  Hopped  Wu Fence"
//    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
//       return null;
//    }
//
//
//    //Question 19
//    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
//        return null;
//    }


