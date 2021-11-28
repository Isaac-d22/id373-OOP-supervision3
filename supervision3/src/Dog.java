public class Dog extends CyberPet {
    private boolean furry;

    Dog(String name, boolean furry) {
        super(name);
        this.furry = furry;
    }

    public void bark(){
        if (this.tiredness >= 7 | this.hungriness >= 7){
            System.out.format("%s is too tired or hungry to bark %n", this.name);
        }
        System.out.format("%s had fun barking %n", this.name);
        if (this.boredness>0) {
            this.boredness--;
        }
        this.tiredness--;
        this.hungriness--;
    }
}
