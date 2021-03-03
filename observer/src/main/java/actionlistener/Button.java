package actionlistener;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体观察目标【按键】
 */
public class Button {

    private List<ButtonClickListner> listnerList = new ArrayList<>(8);

    public void addListener(ButtonClickListner l) {
        listnerList.add(l);
    }

    public void removeListener(ButtonClickListner l) {
        listnerList.remove(l);
    }

    public void click(ClickEvent clickEvent) {
        for (ButtonClickListner l : listnerList){
            l.actionPerformed(clickEvent);
        }
    }

}
