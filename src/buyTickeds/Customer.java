package buyTickeds;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Customer {
    private static int id = 0;


    public CashProvider cash;
    private List <TickedBase> tickeds;
    private TickedProvider tickedProvider;

    public static int getId() {
        return id;
    }

    public Customer () {
        id++;
        tickeds = new LinkedList<>();
        cash = new CashProvider();
    }

    /**
     * метод позволяет кастомеру купить билет. Метод работает, если пользователь авторизовался.
     * @param tickedBase - нужный билет для покупки.
     */
    public void buyTicked(TickedBase tickedBase) {
        if (cash.isAuthorization) {
            tickeds.add(tickedBase);
        }
    }

    /**
     * Метод проверяет, куплен ли билет
     * @param tickedBase - билет, который необходимо проверить, куплин ли он
     * @return истина - если билет куплен, ложь - если нет.
     */
    // TODO: нужно дописать в классе "TickedBase" способы сравнения билетов.
    public boolean isBuyTicket(TickedBase tickedBase) {
        for (TickedBase ticked : tickeds
             ) {
            // Если билет куплен, то обновляется статус билета.
            if (ticked.equals(tickedBase)) {
//                tickedProvider.updateTickedStatus(tickedBase);
                return true;
            }
        }
        return false;
    }

    /**
     * Метод реализует поиск билетов в у провайдера
     * @param date - выбранная дата
     * @param id - выбранный номер
     * @return - возращает билет, если параметры совпадают, или нулл если параметры не совпадают
     */
    public TickedBase search (LocalDate date, long id) {
        for (TickedBase tickedBase: tickeds
             ) {
            if(tickedBase.getDate().equals(date) | tickedBase.getNumberTicked() == id) {
                return tickedBase;
            }
        }
        throw new RuntimeException("такого билета нет у провайдера.");
    }
}
