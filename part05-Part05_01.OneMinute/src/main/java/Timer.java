/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tushar
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredths = new ClockHand(100);
    }
    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
    public void advance() {
       if (this.hundredths.value() == 99) {
           this.seconds.advance();
       }
       this.hundredths.advance();
    }
}
