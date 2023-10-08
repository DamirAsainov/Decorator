public class Boots extends PlayerDecorator{
    int armor = 5;
    int attack = 0;
    int speed = 15;
    public Boots(Player player) {
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
