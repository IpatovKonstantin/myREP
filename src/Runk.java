
public enum Runk {

    TESTER("Тестировщик"),
    SENIOR_TESTER("Старший тестировщик"),
    ENGINEER("Инженер");

    private String name;

    Runk(String name){
        this.name = name;
    };


    public String getName() {
        return name;
    }

    public static boolean isRunkExist(Runk runk){
        for (Runk element: values()){
            if (runk == element){
                return true;
            }
        }
        return  false;
    }

    public static Runk getRunk(String runkName){
        for ( Runk element : values()){
            if (runkName.equals(element.getName())){
                return element;
            }
        }
        return null;
    }

    public  static boolean isRunkExist(String runkName){
        for (Runk element: values()){
            if (runkName.equals(element.getName())){
                return true;
            }
        }
        return  false;
    }
}
