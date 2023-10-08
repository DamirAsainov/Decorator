public class PlayerDecorator implements Player {
    Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public int getAttackDamage() {
        return player.getAttackDamage();
    }

    @Override
    public int getHealth() {
        return player.getHealth();
    }

    @Override
    public int getArmor() {
        return player.getArmor();
    }

    @Override
    public int getAttackSpeed() {
        return player.getAttackSpeed();
    }
}
