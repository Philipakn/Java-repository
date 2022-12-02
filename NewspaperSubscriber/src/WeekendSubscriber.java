public class WeekendSubscriber extends NewspaperSubscriber{

    WeekendSubscriber(String add){
        this.add = add;
        this.subRate = 2.00;
        setSubRate();
    }

    @Override
    public void setSubRate() {
        System.out.println(this.subRate);
    }

    @Override
    public String toString() {
        return "WeekendSubscriber{" + "add='" + add + '\'' + '}';
    }
}
