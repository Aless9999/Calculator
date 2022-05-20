package Calculator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input="";
        calc(input);
    }
    public static String calc(String input){
        Scanner object = new Scanner(System.in);
        System.out.println("Введите числовое выражение:");
        String nameString = object.nextLine();
        char valueRomorArab = nameString.toCharArray()[0];
        boolean chec = Character.isDigit(valueRomorArab);
        int result1 ;
        if (chec) {
            int result = arabian(nameString);
            System.out.println(result);
        }
        else  {  result1 = getStr(nameString);
            String endResult= convertArabinRome(result1);
            System.out.println(endResult);}

        return "0";
    }
    public static int getStr(String nameString){
        String[] numStr;
        numStr = nameString.split("\\W");
        String numSymbol = nameString.replaceAll("[ \\w]", "");
        char symbol = numSymbol.charAt(0);
        String num1 = numStr[0];
        String num2 = numStr[1];
        int numAction1= rome(num1);
        int numAction2 = rome(num2);
        if (symbol == '+') {
            return (numAction1 + numAction2);
        } else if (symbol == '-') {
            return (numAction1 - numAction2);
        } else if (symbol == '/') {
            return (numAction1 / numAction2);

        } else if (symbol == '*') {
            return (numAction1 * numAction2);
        } else System.out.println("Операция не поддерживается.");


        return 0;
        
    }


    public static int arabian(String nameString) {
        String[] numStr;
        numStr = nameString.split("\\W");
        String numSymbol = nameString.replaceAll("[ \\w]", "");
        char symbol = numSymbol.charAt(0);
        Integer num1 = Integer.valueOf(numStr[0]);
        Integer num2 = Integer.valueOf(numStr[1]);

        if (symbol == '+') {
            return (num2 + num1);
        } else if (symbol == '-') {
            return (num1 - num2);
        } else if (symbol == '/') {
            return (num1 / num2);

        } else if (symbol == '*') {
            return (num1 * num2);
        } else System.out.println("Операция не поддерживается.");


        return 0;
    }

    public static int rome(String digit) {
        String[] romeNums ={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        char[] arabianNums ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        for (int i = 0; i < romeNums.length; i++) {
            if(romeNums[i].equals(digit)){
                int result = arabianNums[i];
                return result;


            }
        }return 0;
    }
    public static String convertArabinRome(int digit){
        String[] romeNums ={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        char[] arabianNums ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        for (int i = 0; i < arabianNums.length; i++) {
            if(arabianNums[i]==(digit)){
                String res = romeNums[i];
                return res;


            }
        }return "0";
    }

}