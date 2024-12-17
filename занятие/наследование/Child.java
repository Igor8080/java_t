package наследование;

import инкапсуляция.Parent;

public class Child extends Parent {

    public String getProtected() {
        return protectedVar;
    }

    private String name = "child";

    public String getName() {
        return getlocalName();
    }

    private String getlocalName() {
        return "LOCAL";
    }
}
