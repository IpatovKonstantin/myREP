
public enum Runk {

    TESTER("Тестировщик"),
    SENIOR_TESTER("Старший тестировщик"),
    ENGINEER("Инженер"),
    DIRECTOR("Директор");

    private String name;

    Runk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Runk getRunk(String runkName) {
        for (Runk element : values()) {
            if (runkName.equals(element.getName())) {
                return element;
            }
        }
        return null;
    }

}
