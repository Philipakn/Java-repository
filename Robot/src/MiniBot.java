
public class MiniBot extends Robot{

    private String model;
    private int year;

    MiniBot(String name, String color, int weight, String make) {
        super(name, color, weight);
        model = "Huawei";
        year = 2023;
    }

    public void getModel() {
        System.out.println(model);
    }

    public void getYear() {
        System.out.println(year);
    }
}
