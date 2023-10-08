public class Main {
    public static void main(String[] args) {
        Player player = new Helmet(new Boots(new BasePlayer()));
        Player player1 = new Sword(new Helmet(new BodyArmor(new BasePlayer())));
        System.out.println("Player - 1\n" +
                "Health - " + player1.getHealth() +
                           "\nArmor - " + player1.getArmor() +
                           "\nAttack Damage - " + player1.getAttackDamage() +
                           "\nSpeed - " + player1.getAttackSpeed() + "\n");
        System.out.println("Player - 2\n" +
                "Health - " + player.getHealth() +
                "\nArmor - " + player.getArmor() +
                "\nAttack Damage - " + player.getAttackDamage() +
                "\nSpeed - " + player.getAttackSpeed() + "\n");
    }
}