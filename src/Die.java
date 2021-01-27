public class Die {
    private int numSides = 6;
    private int rolled;

    public Die() {

    }

    public Die( int sides) {
        numSides = sides;
    }

    public void roll() {
        this.rolled = ((int)( 1 + Math.random() * numSides));
    }

    public int getRolled() {
        return rolled;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }
}
