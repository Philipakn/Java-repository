public class SevenDaySubscriber extends NewspaperSubscriber{

    SevenDaySubscriber(String add){
        this.add = add;
        this.subRate = 4.25;
        setSubRate();
    }

    @Override
    public void setSubRate() {
        System.out.println(this.subRate);
    }

    @Override
    public String toString() {
        return "Address = " + add;
    }

}
