public class BodyArmor extends PlayerDecorator{
    int armor = 40;
    int attack = 0;
    int speed = -10;
    public BodyArmor(Player player) {
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
