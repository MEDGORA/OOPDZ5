public class CalculateRacional extends RacionalNumbers implements Calculating<RacionalNumbers> {


    public CalculateRacional(double x, double y) {
        super(x, y);
    }

    @Override
    public RacionalNumbers sum() {
        return new RacionalNumbers((x * z) + (w * y), (y * z));
    }

    @Override
    public RacionalNumbers diff() {
        return new RacionalNumbers((x * z) - (w * y), (y * z));
    }

    @Override
    public RacionalNumbers mult() {
        return new RacionalNumbers(x * w, y * z);
    }

    @Override
    public RacionalNumbers div() {
        return new RacionalNumbers(x * z, y * w);
    }
}