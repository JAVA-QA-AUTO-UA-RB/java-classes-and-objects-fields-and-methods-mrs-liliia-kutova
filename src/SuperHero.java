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
        int modifiedAttack = this.attackPower;
        int event = random.nextInt(3)+1;
        if (event ==1) {
            int bonusAttack = random.nextInt(6) +1;
        System.out.println("SuperHero " + name + " recives bonus to the attack " + bonusAttack);
        modifiedAttack += bonusAttack;
        } else if (event ==2){
          int bonusDefence = random.nextInt(6) + 1;
         modifiedAttack -= bonusDefence;
         if (modifiedAttack <0) modifiedAttack =0;
        }
        opponent.getDamaged(modifiedAttack);
    }

    public void getDamaged(int attackPower) {
        System.out.println("SuperHero " + name + " recives " + attackPower + " of damage ");
        int modifiedAttack = attackPower;
        int event = random.nextInt(3);
        if (event == 1) {
            int buff = random.nextInt(6)+1;
            modifiedAttack -=buff;
            if (modifiedAttack<0)modifiedAttack=0;
        } else if (event ==2){
            int nerf= random.nextInt(6)+1;
            modifiedAttack +=nerf;
        }
        health -= modifiedAttack;

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
