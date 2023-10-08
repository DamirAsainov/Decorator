public class Helmet extends PlayerDecorator {
    int armor = 20;
    int attack = 0;
    int speed = 0;
    public Helmet(Player player) {
        super(player);
    }

    @Override
    public int getAttackDamage() {
        return super.getAttackDamage() + attack;
    }

    @Override
    public int getAttackSpeed() {
        return super.getAttackSpeed() + speed;
    }
    @Override
    public int getArmor(){
        return super.getArmor() + armor;
    }
}
