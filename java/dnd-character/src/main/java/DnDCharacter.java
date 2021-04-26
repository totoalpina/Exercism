import java.util.Random;

class DnDCharacter {
    Random rand = new Random();
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitpoints = this.modifier(this.getConstitution()) + 10;
    }


    int ability() {
        return rand.nextInt(6) + 1 + rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
    }

    int modifier(int input) {
        int result = input - 10;
        return (int) Math.floorDiv(result, 2);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }

}
