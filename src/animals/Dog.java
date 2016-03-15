package animals;

/**
 * Created by eugeny on 15.03.2016.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("gav-gav");
    }
}
