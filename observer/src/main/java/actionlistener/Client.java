package actionlistener;

public class Client {

    public static void main(String[] args) {
        Button b = new Button();
        b.addListener(new ButtonClickListenerOne());
        b.addListener(new ButtonClickListenerTwo());
        b.click(new ClickEvent("hello world"));
    }

}
