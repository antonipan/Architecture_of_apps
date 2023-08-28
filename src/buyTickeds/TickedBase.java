package buyTickeds;

import java.time.LocalDate;

/**
 * Создал абстрактный класс билет, так как билеты могут быть с номером места или без него.
 */
public abstract class TickedBase {
    protected long numberTicked;
    private double price;
    private LocalDate date;
    private boolean isValid;
    private boolean tickedStatus;


    public boolean getIsTickedStatus() {
        return tickedStatus;
    }

    public void setTickedStatus(boolean tickedStatus) {
        this.tickedStatus = tickedStatus;
    }


    public long getNumberTicked() {
        return numberTicked;
    }

    public LocalDate getDate() {
        return date;
    }
}
