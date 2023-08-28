package buyTickeds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TickedProvider {
    public List <TickedBase> tickedBaseList;

    public TickedProvider (TickedBase... tickeds) {
        tickedBaseList = new LinkedList<>();
        tickedBaseList.addAll(Arrays.asList(tickeds));
    }

//    public List <TickedBase> getTicked (long tickedNumber) {
//
//    }

    /**
     * Метод позволяет обновить статус билета у поставщика.
     * @param ticked - принимает на вход билет
     * @return возвращает истину или ложь
     */
    public boolean updateTickedStatus(TickedBase ticked) {
        if(ticked.getIsTickedStatus()) {
            ticked.setTickedStatus(false);
        } else {
            ticked.setTickedStatus(true);
        }
        return ticked.getIsTickedStatus();
    }
}
