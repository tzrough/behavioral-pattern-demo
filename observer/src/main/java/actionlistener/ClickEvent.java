package actionlistener;

/**
 * 事件对象【点击事件】
 * 观察目标通知观察者的对象的内容
 */
public class ClickEvent {

    private String msg;

    public ClickEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
