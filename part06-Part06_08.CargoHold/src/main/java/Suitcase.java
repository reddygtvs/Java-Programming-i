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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    public Suitcase(int weight) {
        this.maxWeight = weight;
        items = new ArrayList<>();
    }
    private int lim = 0;
    public void addItem(Item item) {
        if (!(item.getWeight() + lim > this.maxWeight)) {
            items.add(item);
            lim += item.getWeight();
        }
    }
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + lim + " kg)";
        }
        return this.items.size() + " items (" + lim + " kg)"; 
    }
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    public int totalWeight() {
        return lim;
    }
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item ret = this.items.get(0);
        for (Item item : items) {
            if (ret.getWeight() < item.getWeight()) {
                ret = item;
            }
        }
        return ret;
    }
    
}
