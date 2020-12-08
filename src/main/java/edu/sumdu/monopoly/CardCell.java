package edu.sumdu.monopoly;

public class CardCell extends Cell {
    protected Player owner;
    private int type;
    private boolean available = true;

    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public void playAction() {
    }
    
    public int getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
