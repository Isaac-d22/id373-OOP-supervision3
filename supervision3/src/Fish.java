public class Fish extends CyberPet {
    private int speed;

    Fish(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public void swim(){
        if (this.tiredness >= 7 | this.hungriness >= 7){
            System.out.format("%s is too tired or hungry to swim %n", this.name);
        }
        System.out.format("%s had fun swimming %n", this.name);
        if (this.boredness>0) {
            this.boredness--;
        }
        this.tiredness--;
        this.hungriness--;
    }
}
