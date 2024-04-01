class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    private boolean vulnerable = false;

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

    private boolean vulnerable = true;
    private boolean haveSpell = false;

    @Override
    int getDamagePoints(Fighter fighter) {
        return this.haveSpell ? 12 : 3;
    }

    @Override
    boolean isVulnerable() {
        return this.vulnerable;
    }

    public void prepareSpell() {
        this.haveSpell = true;
        this.vulnerable = false;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void setVulnerable(boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    public boolean isHaveSpell() {
        return haveSpell;
    }
}
