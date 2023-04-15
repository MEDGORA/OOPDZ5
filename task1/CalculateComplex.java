public class CalculateComplex extends ComplexNumbers implements Calculating<ComplexNumbers> {


    public CalculateComplex(double x, double y) {
        super(x, y);
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((x + w), (y+ z));
    }

    @Override
    public ComplexNumbers diff() {
        return new ComplexNumbers(x - w, y - z);
    }

    @Override
    public ComplexNumbers mult() {
        return new ComplexNumbers(x * w - y * z, x * z + w * y);
    }

    @Override
    public ComplexNumbers div() {
        return new ComplexNumbers((x * w + y * z)/(w * w + z * z), (w * y - x * z)/(w * w + z * z));
    }
}
