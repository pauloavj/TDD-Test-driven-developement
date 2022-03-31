public class Calculator {

    public int calculate(int x, int y, char operator){
        return switch (operator) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '/' -> x / y;
            case '*' -> x * y;
            default -> 0;
        };
    }
}
