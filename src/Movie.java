public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newtitle, int newpriceCode) {
        this.title = newtitle;
        this.priceCode = newpriceCode;
    }
    public int getPriceCode() {
        return this.priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle (){
        return this.title;
    };
    double getCharge(int daysRented)
    {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR -> {
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
            }
            case Movie.NEW_RELEASE -> result += daysRented * 3;
            case Movie.CHILDRENS -> {
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
            }
        }
        return result;
    }

    int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) &&
                daysRented > 1)
            return 2;
        else
            return 1;
    }

}