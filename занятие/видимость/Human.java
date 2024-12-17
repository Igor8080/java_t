package видимость;
//протсейшая реализация паттерна Builder
public class Human {
    private String name;
    private int age;

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public String getData() {
        return "Его имя" + name + "; Его возраст" + age;
    }
}
