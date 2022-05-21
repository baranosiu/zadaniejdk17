package local.pbaranowski.zadaniejdk17;

public interface Message {
    default String formatMessage(String message) {
        return getClassName(this) + ": " + message;
    }

    default void printMessage(String message) {
        System.out.println(formatMessage(message));
    }

    private String getClassName(Object object) {
        return object.getClass().getSimpleName();
    }
}
