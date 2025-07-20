import java.util.Random;

public class SuperHero {

    // Тут мають бути властивості і поведінка Супергероя

    String name;
    int attackPower;
    int deffencePower;
    int health =100;

    public Random random = new Random();

    public void attack(SuperHero opponent, int attackPower) {
        System.out.println("SuperHero " + name + " attacks ");
        int event = random.nextInt(3)+1;
        if (event ==1) {
            int bonusAttack = random.nextInt(6) +1;
        System.out.println("SuperHero " + name + " recives bonus to the attack " + bonusAttack);
        attackPower += bonusAttack;
        } else {
            int bonusDefence;
            bonusDefence = random.nextInt(6) + 1;
         this.attackPower(bonusDefence);
        }
        opponent.getDamaged(attackPower);
    }

    public void getDamaged(int attackPower) {
        System.out.println("SuperHero " + name + " recives " + attackPower + " of damage ");
        health -= attackPower;

        if (health <=0) {
            health =0;
            System.out.println("SuperHero " + name + " is dead. The game is over ");
        } else {
            showStats();
        }
    }

    public boolean isAlive() {
        return health >0;
    }


    public void protectionUsed (int deffencePower) {
        System.out.println("SuperHero " + name + " revices " + deffencePower + " protection bonus ");
        health +=deffencePower;
        }



    public void showStats(){
        System.out.println("SuperHero " + name + " has " + health + " points left " );
    }


}
