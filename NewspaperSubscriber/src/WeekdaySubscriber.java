public class WeekdaySubscriber extends NewspaperSubscriber{


    WeekdaySubscriber(String add){
        this.add = add;
        this.subRate = 3.50;
        setSubRate();
    }

    @Override
    public void setSubRate() {
        System.out.println(this.subRate);
    }

    @Override
    public String toString() {
        return "WeekdaySubscriber{" + "add='" + add + '\'' + '}';
    }
}
