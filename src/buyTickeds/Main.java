package buyTickeds;

public class Main {
    public static void main(String[] args) {
        // Создал пользователя, кэшпровайдера, провайдера билетов
        Customer customer = new Customer();
        // создал билеты
        TickedBase ticked1 = new TickedWithPlace();
        TickedBase ticked2 = new TickedWithoutPlace();
        TickedBase ticked3 = new TickedWithPlace();
        TickedBase ticked4 = new TickedWithoutPlace();
        // Создал провайдера билетов и добавил билеты ему.
        TickedProvider tickedProvider = new TickedProvider(ticked1, ticked2,
                                                            ticked3, ticked4);
        // Изменяем настройки провайдера для кастомера
        customer.cash.card = 1234214351251251L;
//        // Кастомер покупает билет.
       customer.buyTicked(ticked1);
//        Но билет не покупается, так как кастомер не авторизован
        System.out.println(customer.isBuyTicket(ticked1));
//        Авторизуем кастомера
        customer.cash.authorization(customer);
//        // Ещё раз купим билет.
        customer.buyTicked(ticked1);
        // Проверяем
        System.out.println(customer.isBuyTicket(ticked1));

    }
}
