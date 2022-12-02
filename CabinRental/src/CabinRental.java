public class CabinRental {

    protected int cno;
    protected double rental_rate;


    CabinRental(int cno){
        this.cno = cno;

        switch(cno){
            case 1 , 2 , 3:
                rental_rate = 950;
                break;
            default:
                rental_rate = 1100.00;
        }
    }

    public int getCno() {
        return cno;
    }

    public double getRental_rate() {
        return rental_rate;
    }
}
