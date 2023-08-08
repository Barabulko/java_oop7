public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getters and setters

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Operations: Addition, Multiplication, and Division

    public ComplexNumber add(ComplexNumber number) {
        double realSum = this.real + number.real;
        double imaginarySum = this.imaginary + number.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double realProduct = (this.real * number.real) - (this.imaginary * number.imaginary);
        double imaginaryProduct = (this.real * number.imaginary) + (this.imaginary * number.real);
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    public ComplexNumber divide(ComplexNumber number) {
        double denominator = (number.real * number.real) + (number.imaginary * number.imaginary);
        double realQuotient = ((this.real * number.real) + (this.imaginary * number.imaginary)) / denominator;
        double imaginaryQuotient = ((this.imaginary * number.real) - (this.real * number.imaginary)) / denominator;
        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}