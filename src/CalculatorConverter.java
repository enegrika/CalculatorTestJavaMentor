/**
 * Класс с конвертерами из арабских в римские числа
 */

class CalculatorConverter {

    /**
     * метод-конвертер арабских чисел в римские
     */
    static String arabToRoman(int arabIn) {

        StringBuilder roman = new StringBuilder();

        if (arabIn == 0) {
            roman = new StringBuilder("0");
        }
        if (arabIn < 0) {
            arabIn = Math.abs(arabIn);
            roman = new StringBuilder("-");
        }

        int trigger;

        String[] romanSymbol = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabSymbol = {100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < arabSymbol.length; i++) {
            trigger = arabIn / arabSymbol[i];

            for (int k = 1; k <= trigger; k++) {
                roman.append(romanSymbol[i]);
            }
            arabIn = arabIn % arabSymbol[i];
        }
        return roman.toString();
    }


    /**
     * метод для распечатки результата вычислений калькулятора
     * в зависимости от типа введенных
     * пользователем цифр(арабские или римские)
     */

    static int resultTypeRoman(String[] twoNums) {

        int resultType = 0;

        String[] romeArray = {"I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i <= 9; i++) {
            if (twoNums[0].equalsIgnoreCase(romeArray[i])) {
                resultType++;
            }

        }
        return resultType;
    }

}
