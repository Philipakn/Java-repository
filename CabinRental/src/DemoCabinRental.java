public class DemoCabinRental {

    public static void main(String[]args){

        CabinRental obj = new CabinRental(1);

        System.out.println("Cabin number is: " + obj.getCno());
        System.out.println("The price is: " + obj.getRental_rate());

        HolidayCabinRental obj1 = new HolidayCabinRental(1);

        System.out.println("Cabin number is: " + obj1.getCno());
        System.out.println("The price is: " + obj1.getRental_rate());
    }
}
