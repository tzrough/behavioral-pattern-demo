package actionlistener;


/**
 * 具体观察者【按键点击观察者二】
 */
public class ButtonClickListenerTwo implements ButtonClickListner {
    @Override
    public void actionPerformed(ClickEvent clickEvent) {
        System.out.println(this.getClass().getName() + clickEvent.getMsg());
    }
}
