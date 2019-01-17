package testing_oop.Classes;

public abstract class CharacterClass implements Interface {
    private int healthPoints;
    private int manaPoints;
    private int level;
    private int attackAmount;
    private int maxHealthPoints;
    private int maxManaPoints;
    private String name;

    @Override
    public void attack() {

    }

    @Override
    public void restoreHealth() {

    }

    @Override
    public void loseHealth() {

    }

    @Override
    public void restoreMana() {

    }

    @Override
    public void loseMana() {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {

    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        this.attackAmount = attackAmount;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
