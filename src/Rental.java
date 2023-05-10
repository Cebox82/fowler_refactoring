class Rental {
    private final Movie movie;
    private final int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        this.movie = newmovie;
        this.daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return this.daysRented;
    }
    public Movie getMovie() {
        return this.movie;
    }

     double getCharge() {
        return this.movie.getCharge(daysRented);
    }
    int getFrequentRenterPoints() {
        return this.movie.getFrequentRenterPoints(daysRented);
    }

}