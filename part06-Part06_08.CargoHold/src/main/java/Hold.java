/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tushar
 */
import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    public Hold (int weight) {
        this.maxWeight = weight;
        suitcases = new ArrayList<>();
    }
    private int lim = 0;
    public void addSuitcase(Suitcase suitcase) {
        if (!(lim + suitcase.totalWeight() > this.maxWeight)) {
            this.suitcases.add(suitcase);
            lim += suitcase.totalWeight();
        }
    }
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.lim + " kg)";
    }
    
}
