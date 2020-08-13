import java.util.Scanner;

/**
 * Класс, в котором мы вводим строку и парсим на массив из 2х значений,
 * а также выделяем оператор для калькуляции
 */

class CalculatorInput {

    /**
     * метод, где сканируем ввод пользователя
     **/

    static String scan() {

        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        scanner.close();
        return scan;
    }

    /**
     * метод, где очищаем строку от лишних пробелов
     * и разделяем строку на два операнда
     */

    static String[] strArrTwoNum(String scan) {

        String local = scan.replaceAll("\\s+", "");
        String[] strArrTwoNum;
        strArrTwoNum = local.split("[+-/*]");
        return strArrTwoNum;
    }

    /**
     * метод, где выделяем из строки оператор.
     * А также проверяем количество введенных символов
     * для обработки исключения, если пользователь
     * ввел несколько символов оператора
     * или другие несовместимые символы.
     */

    static char operator(String scan) {

        char localOperator = 0;

        String op = scan.replaceAll("[^+-/*]", "");

        int opLength = op.length();

        if (opLength != 1) {
            System.out.println("ошибка ввода! Программа остановлена! ");
            System.out.println("Введите корректное выражение! Попробуйте еще раз.");
            System.exit(0);
        } else {
            localOperator = op.charAt(0);
        }

        return localOperator;
    }


}
