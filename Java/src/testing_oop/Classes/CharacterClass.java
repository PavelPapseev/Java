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
    public void restoreHealth(int amount) {
    setHealthPoints(this.healthPoints + amount);
    }

    @Override
    public void loseHealth(int amount) {
    setHealthPoints(this.healthPoints - amount);
    }

    @Override
    public void restoreMana(int amount) {
    setManaPoints(this.maxManaPoints + amount);
    }

    @Override
    public void loseMana(int amount) {
    setManaPoints(this.maxManaPoints - amount);
    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
    System.out.println("Name " + this.name);
    System.out.println("Current health points equals: " + this.healthPoints);
    System.out.println("Current mana points equals: " + this.manaPoints);
    System.out.println("Current level equals: " + this.level);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0) this.healthPoints = 0;
        else if(healthPoints > this.maxHealthPoints) this.healthPoints = maxHealthPoints;
        else this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if(this.manaPoints < 0) this.manaPoints = 0;
        else if (manaPoints > this.maxManaPoints) this.manaPoints = maxManaPoints;
        else this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) System.out.println("We can't lose level");
        else this.level = level;
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
