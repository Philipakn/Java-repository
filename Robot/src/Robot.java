public class Robot {

    String greetings;
    private final String name;
    private final String color;
    private final int weight;
    protected int number;

    Robot(String name , String color, int weight){

        this.name = name;
        this.color = color;
        this.weight = weight;

    }

    public void getName(){
        System.out.println(name);
    }

    public void getColor(){
        System.out.println(color);
    }

    public void getWeight(){
        System.out.println(weight);
    }
}
