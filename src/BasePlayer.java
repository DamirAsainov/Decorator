public class BasePlayer implements Player{
    private int attackDamage = 15;
    private int health = 100;
    private int armor = 0;
    private int attackSpeed = 60;
    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getAttackSpeed() {
        return attackSpeed;
    }
}
