import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 1 to create a dog, 2 to create a fish and 3 to create a ninja:");
        int petType = in.nextInt();
        while (petType != 1 & petType!= 2 & petType!= 2){
            System.out.println("Please enter 1 to create a dog, 2 to create a fish and 3 to create a ninja:");
            in = new Scanner(System.in);
            petType = in.nextInt();
        }
        in = new Scanner(System.in);
        System.out.println("Please enter the name of your pet:");
        String name = in.nextLine();
        CyberPet pet;
        String option4;
        if (petType == 1) {
            pet = new Dog(name, true);
            option4 = "bark";
        }
        else if (petType == 2) {
            pet = new Fish(name, 5);
            option4 = "swim";
        }
        else {
            pet = new Ninja(name, false);
            option4 = "do a backflip";
        }

        int tiredness = pet.getTiredness();
        int hungriness = pet.getHungriness();
        int boredness = pet.getBoredness();

        int option;
        while(boredness<10 & hungriness<10 & tiredness<10){
            in = new Scanner(System.in);
            System.out.format("What would you like %s to do? (enter 1 for eat, 2 for sleep, 3 for play and 4 for %s) %n",name,option4);
            option = in.nextInt();
            while (option != 1 & option!= 2 & option!= 3 & option != 4){ //option 4 is broken===
                in = new Scanner(System.in);
                System.out.format("What would you like %s to do? (enter 1 for eat, 2 for sleep, 3 for play and 4 for %s) %n",name,option4);
                option = in.nextInt();
            }
            if (option==1){
                pet.feed();
            }
            else if (option==2){
                pet.sleep();
            }
            else if (option==3){
                pet.play();
            }
            tiredness = pet.getTiredness();
            hungriness = pet.getHungriness();
            boredness = pet.getBoredness();
        }
        System.out.format("RIP %s",name);
    }
}
