package inheritate;

public class Animal {
    private String type;
    private String size;
    private Double weigh;

    public Animal () {

    }

    public Animal(String type, String size, Double weigh) {
        this.type = type;
        this.size = size;
        this.weigh = weigh;
    }

    public void  move(String speed) {
        System.out.println(type + "moves" + speed);
    }

    public void  makeNoise () {
        System.out.println(type + "make some noise");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weigh=" + weigh +
                '}';
    }
}
