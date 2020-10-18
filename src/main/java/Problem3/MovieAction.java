package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        super(anotherMovie);
        //this.lateFeePerDayInDollar = anotherMovie.getLateFeeInDollar();
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if (numOfDaysPastDue >= 5) {
            return 2 * numOfDaysPastDue * lateFeePerDayInDollar;
        }
        if (numOfDaysPastDue >= 0 && numOfDaysPastDue < 5) {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        } else {
            return 0;
        }
    }
}
