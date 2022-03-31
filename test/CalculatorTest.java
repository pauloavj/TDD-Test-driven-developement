import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void calculate_addTwoNumbers_ReturnNumber(){

        int testNumber1 = 1;
        int testNumber2 = 3;
        char operator = '+';
        int expected = 4;

        //act
        int actual = calculator.calculate(testNumber1,testNumber2, operator);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void calculate_subtractTwoNumbers_ReturnNumber(){

        int testNumber1 = 1;
        int testNumber2 = 1;
        char operator = '-';
        int expected = 0;

        //act
        int actual = calculator.calculate(testNumber1,testNumber2, operator);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void calculate_divideTwoNumbers_ReturnNumber(){

        int testNumber1 = 4;
        int testNumber2 = 2;
        char operator = '/';
        int expected = 2;

        //act
        int actual = calculator.calculate(testNumber1,testNumber2, operator);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void calculate_multiplyTwoNumbers_ReturnNumber(){

        int testNumber1 = 3;
        int testNumber2 = 2;
        char operator = '*';
        int expected = 6;

        //act
        int actual = calculator.calculate(testNumber1,testNumber2, operator);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void calculate_operatorInvalid_ReturnZero(){

        int testNumber1 = 3;
        int testNumber2 = 2;
        char operator = 's';
        int expected = 0;

        //act
        int actual = calculator.calculate(testNumber1,testNumber2, operator);

        //assert
        assertEquals(expected, actual);
    }
}