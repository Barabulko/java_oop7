import java.util.logging.Level;
import java.util.logging.Logger;
public class ComplexNumberCalculator {
    private final Logger logger = Logger.getLogger(ComplexNumberCalculator.class.getName());

    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.add(number2);
        logger.log(Level.INFO, "Сложение: {0} + {1} = {2}",
                new Object[]{number1, number2, result});
        return result;
    }

    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.multiply(number2);
        logger.log(Level.INFO, "Умножение: {0} * {1} = {2}",
                new Object[]{number1, number2, result});
        return result;
    }

    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.divide(number2);
        logger.log(Level.INFO, "Деление: {0} / {1} = {2}",
                new Object[]{number1, number2, result});
        return result;
    }
}