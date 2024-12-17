package видимость;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.setAge(18).setName("Игорь").getData());
    }
}
