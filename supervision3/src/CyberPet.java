public class CyberPet {
    protected String name;
    protected int tiredness;
    protected int boredness;
    protected int hungriness;

    CyberPet(String name, int tiredness, int boredness, int hungriness) {
        this.name = name;
        this.tiredness = tiredness;
        this.boredness = boredness;
        this.hungriness = hungriness;
    }

    CyberPet(String name){
        this.name = name;
        this.tiredness = 0;
        this.boredness = 0;
        this.hungriness = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getTiredness() {
        return tiredness;
    }

    public int getBoredness() {
        return boredness;
    }

    public int getHungriness() {
        return hungriness;
    }

    public void play() {
        if (this.tiredness >= 7 | this.hungriness >= 7){
            System.out.format("%s is too tired or hungry to play %n", this.name);
        }
        System.out.format("%s had fun playing %n", this.name);
        if (this.boredness>0) {
            this.boredness--;
        }
        this.tiredness--;
        this.hungriness--;
    }

    public void sleep() {
        System.out.format("%s slept well %n", this.name);
        for (int i = 0; i<2; i++) {
            if (this.tiredness>0) {
            this.tiredness--;
            }
        }
        this.hungriness--;
    }

    public void feed() {
        System.out.format("%s enjoyed the food %n", this.name);
        for (int i = 0; i<2; i++) {
            if (this.hungriness>0) {
                this.hungriness--;
            }
        }
        this.tiredness--;
    }
}