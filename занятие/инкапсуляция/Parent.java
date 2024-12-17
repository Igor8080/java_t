package инкапсуляция;

public class Parent {
    //публичная
    public String publicVar = "publicVar";
    //protected
    protected String protectedVar = "protectedVar";

    // приватная переменная
    private String privateVar = "privateVar";
    // сеттер для privateVar
    public void setPrivateVar(String privateVar) {
        this.privateVar = privateVar;
    }
    // геттер для privateVar
    public String getPrivateVar() {
        return privateVar;
    }
    //дефолтная(пактеная) переменная
    String packetVar = "packetVar";

}
