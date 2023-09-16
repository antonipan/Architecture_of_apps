package buyTickeds;

public class CashProvider {

    public long card;
    private long hashCard;
    public boolean isAuthorization;

    /**
     * Так как этот метод проверяет, совершена ли покупка, что нужно для внутренних нужд,
     * @return истина - если пользователь авторизован, ложь - если пользователь неавторизован.
     */
    public boolean buy() {
        if (isAuthorization) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод авторизует пользователя. Пользователь успешно авторизован, если проверена его карта.
     * @param customer - кастомер, которого нужно авторизовать.
     */
    public void authorization (Customer customer) {
        if (card != 0) {
            isAuthorization = true;
        }
    }

}
