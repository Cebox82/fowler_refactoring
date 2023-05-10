
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        this.rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = this.rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = rentals.nextElement();
            //determine amounts for each line
            // add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;

    }


    private double amountFor(Rental aRental) {
        return aRental.getCharge();
    }

}
    