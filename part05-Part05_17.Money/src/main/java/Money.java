
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public Money plus(Money addition) {
        Money money = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
        return money;
    }
    public boolean lessThan(Money compared) {
        return (this.euros() + 0.01 * this.cents() < compared.euros() + 0.01 * compared.cents);
    }
    public Money minus(Money decreaser) {
        if (lessThan(decreaser)) {
            Money zer = new Money(0, 0);
            return zer;
        } else {
            if (this.cents() < decreaser.cents()) {
                Money money = new Money(this.euros() - 1 - decreaser.euros(), this.cents() + 100 - decreaser.cents());
                return money;
            } else {
                Money money = new Money(this.euros() - decreaser.euros(), this.cents() - decreaser.cents());
                return money;
            }
            
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
