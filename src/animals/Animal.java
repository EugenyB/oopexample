package animals;

/**
 * Created by eugeny on 15.03.2016.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("running...");
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
