public class HolidayCabinRental extends CabinRental{

    HolidayCabinRental(int cno){
        super(cno);
    }

    public double getRental_rate() {
        return rental_rate + 150;
    }
}
