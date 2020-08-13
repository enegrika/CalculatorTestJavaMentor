/**
 * Класс, в котором проделываются операции
 * для разделения на римские и арабские числа
 * и где обрабатываются возможные исключения
 * выполнения программы.
 **/

class CalculatorNumbers {

    /**
     * метод, в котором проделываются операции
     * для выделения римских чисел из массива строк
     **/

    static int[] mainNums(String[] twoNums) {

        int notSameTypeNumber = 0;

        int[] mainNums = new int[2];

        int[] arabArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[] romeArray = {"I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i <= 9; i++) {
            if (twoNums[0].equalsIgnoreCase(romeArray[i])) {
                mainNums[0] = arabArray[i];
                notSameTypeNumber++;
            }
            if (twoNums[1].equalsIgnoreCase(romeArray[i])) {
                mainNums[1] = arabArray[i];
                notSameTypeNumber++;
            }

        }

        /*
          здесь преобразуем введенные пользователем строки,
          (если оба операнда не римские числа),
          в значения типа интеджер (арабские числа)
          а также описываем исключение,
          если пользователь ввел несовместимые символы (буквы и т.д.)
          */

        if (notSameTypeNumber == 0) {
            try {
                mainNums[0] = Integer.parseInt(twoNums[0]);
                mainNums[1] = Integer.parseInt(twoNums[1]);
            } catch (NumberFormatException e) {
                System.out.println("ошибка недопустимый формат вводимых чисел! ");
                System.out.println("Введите корректное выражение! Попробуйте еще раз.");
                System.exit(0);
            }
        }

        /*
          здесь обработка условия,где введенные пользователем числа
          должны быть одного типа (только арабские или только римские)
         */

        if (notSameTypeNumber == 1) {
            System.out.println("ошибка несовместимый тип вводимых чисел!" +
                    "Программа остановлена! Попробуйте еще раз.");
            System.exit(0);
        }

        /*
          здесь обработка условия,где введенные пользователем числа
          должны быть от одного до десяти
         */

        if ((mainNums[0] > 10 || mainNums[0] < 1) || (mainNums[1] > 10 & mainNums[1] < 1)) {
            System.out.println("ошибка ввода числа! Числа должны быть от одного до десяти.");
            System.out.println("Программа остановлена! Попробуйте еще раз.");
            System.exit(0);
        }


        return mainNums;
    }
}

