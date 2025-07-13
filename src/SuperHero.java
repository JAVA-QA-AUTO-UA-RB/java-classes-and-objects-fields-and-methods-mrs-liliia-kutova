public class SuperHero {

    // Тут мають бути властивості і поведінка Супергероя

    String name;
    int attackPower;
    int deffencePower;
    int health =100;
    boolean isAlive = true;

    public void attack(SuperHero opponent, int attackStrength) {
        System.out.println("SuperHero " + name + " attacks ");
        opponent.getDamaged(attackStrength);
    }

    public void getDamaged(int attackPower) {
        System.out.println("SuperHero " + name + " recives " + attackPower + " of damage ");
        health -= attackPower;
    }

    public void protectionUsed (int deffencePower) {
        System.out.println(" SuperHero " + name + " revices " + deffencePower + " protection bonus ");
        health +=deffencePower;
        }


    public void isAlive(){
        if (health <=0){
            isAlive = false; /// how to end the game
        }
    }
    public void showStats(){
        System.out.println("SuperHero " + name + " has " + health + " points left " );
    }

//            System.out.println("SuperHero " + name + "is the winner");

}
