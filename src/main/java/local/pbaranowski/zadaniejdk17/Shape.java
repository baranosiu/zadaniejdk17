package local.pbaranowski.zadaniejdk17;

public sealed interface Shape permits Circle, Polygon {
    String getArea();
    default String getDiameter() {
        return switch(this) {
            case Circle c -> getClassName(this)+".getDiameter(Circle)";
            case Section s -> getClassName(this)+".getDiameter(Section)";
            case Triangle t -> getClassName(this)+".getDiameter(Triangle)";
            default -> "Unknown";
        };
    }
    private String getClassName(Object object) {
        return object.getClass().getSimpleName();
    }
}
