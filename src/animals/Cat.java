package animals;

/**
 * Created by eugeny on 15.03.2016.
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void voice(){
        System.out.println("mew-mew");
    }
}
