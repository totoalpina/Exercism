class Darts {
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        if (dartPosition() <= 1) {
            return 10;
        } else if (dartPosition() > 1 && dartPosition() <= 5) {
            return 5;
        } else if (dartPosition() > 5 && dartPosition() <= 10) {
            return 1;
        } else {
            return 0;
        }
    }

    public double dartPosition() {
        return Math.sqrt(Math.pow(Math.abs(this.x), 2) + Math.pow(Math.abs(this.y), 2));
    }

}
