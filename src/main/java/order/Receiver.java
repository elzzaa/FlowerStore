package order;

import java.util.Random;

public class Receiver implements User{
    boolean status = false;
    int id;

    public Receiver(){
        Random random = new Random();
        this.id =  random.nextInt(10^9 - 1) + 1;
    }

    void update(boolean status) {
        this.status = status;
        System.out.println("Receiver status was updated.");
    }
}
