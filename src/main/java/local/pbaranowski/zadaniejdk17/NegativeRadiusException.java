package local.pbaranowski.zadaniejdk17;

public class NegativeRadiusException extends RuntimeException {
    private double radius;
    public NegativeRadiusException(double radius) {
        this.radius = radius;
    }

    @Override
    public String getMessage() {
        return ("Negative radius: "+radius);
    }
}
