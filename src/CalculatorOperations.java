/**
 * Класс, где вычисляем результат из
 * полученных операндов и оператора
 */
class CalculatorOperations {


    /**
     * метод для калькуляции
     **/

    static int calcResult(int x, int y, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = (x + y);
                break;
            case '-':
                result = (x - y);
                break;
            case '*':
                result = (x * y);
                break;
            case '/':
                result = (x / y);
                break;
            default:
                throw new IllegalStateException("Unexpected value");

        }
        return result;
    }


}
