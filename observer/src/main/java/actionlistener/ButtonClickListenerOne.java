package actionlistener;

/**
 * 具体观察者【按键点击观察者一】
 */
public class ButtonClickListenerOne implements ButtonClickListner{

    @Override
    public void actionPerformed(ClickEvent clickEvent) {
        System.out.println(this.getClass().getName() + clickEvent.getMsg());
    }
}
