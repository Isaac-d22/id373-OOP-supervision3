public class Ninja extends CyberPet{
    private boolean evil;

    Ninja(String name, boolean evil) {
        super(name);
        this.evil = evil;
    }

    public void backflip(){
        if (this.tiredness >= 7 | this.hungriness >= 7){
            System.out.format("%s is too tired or hungry to do a backflip %n", this.name);
        }
        System.out.format("%s did a backflip %n", this.name);
        if (this.boredness>0) {
            this.boredness--;
        }
        this.tiredness--;
        this.hungriness--;
    }
}
