public class Sword extends PlayerDecorator{
    int armor = 0;
    int attack = 40;
    int speed = -20;
    public Sword(Player player) {
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
