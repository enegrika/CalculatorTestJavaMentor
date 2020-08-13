/**
 * Класс, в котором пользователь вводит строку, а калькулятор
 * выводит результат вычислений в консоль.
 **/

class CalculatorOutput {

    static void output() {

        String s = CalculatorInput.scan();
        char operator = CalculatorInput.operator(s);
        String[] nums = CalculatorInput.strArrTwoNum(s);
        int[] mainNums = CalculatorNumbers.mainNums(nums);

        int arabResult = CalculatorOperations.calcResult(mainNums[0], mainNums[1], operator);

        String romeResult = CalculatorConverter.arabToRoman(arabResult);

        /*
          здесь в зависимости от типа чисел
          выводим соответствующий формат результата
          (арабский или римский)
         */

        if (CalculatorConverter.resultTypeRoman(nums) != 0) {
            System.out.println("The result is " + romeResult);
        } else {
            System.out.println("The result is " + arabResult);
        }

    }


}
