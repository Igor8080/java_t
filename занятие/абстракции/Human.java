package абстракции;

public interface Human  {
    final String type = "mamals";
    String work();

    default String getString() {
        return "SDFSDFSD";
    }
}
