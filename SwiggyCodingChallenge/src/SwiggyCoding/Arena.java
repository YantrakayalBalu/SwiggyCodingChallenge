package SwiggyCoding;

public class Arena {
	
	private final Player playerA;
    private final Player playerB;
    private final Dice dice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice(6);
    }

    public void startBattle() {
        System.out.println("Starting the Battle!");
        System.out.println(playerA);
        System.out.println(playerB);

        while (playerA.isAlive() && playerB.isAlive()) {
            Player attacker = playerA.getHealth() <= playerB.getHealth() ? playerA : playerB;
            Player defender = attacker == playerA ? playerB : playerA;

            playTurn(attacker, defender);

            if (!defender.isAlive()) {
                System.out.println(defender + " is defeated!");
                System.out.println(attacker + " wins!");
            }
        }
    }

    private void playTurn(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;

        int damageDealt = Math.max(0, attackDamage - defendStrength);
        defender.takeDamage(damageDealt);

        System.out.println(attacker + " attacks with damage: " + attackDamage + ", Defender defends with: " + defendStrength + ". Damage dealt: " + damageDealt);
        System.out.println(defender);
    }

}
