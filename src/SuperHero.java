public class SuperHero {

    // Тут мають бути властивості і поведінка Супергероя

    String name;
    int attackPower;
    int deffencePower;
    int health =100;
    boolean isAlive = true;

    public void attack(SuperHero opponent) {
        System.out.println("SuperHero " + name + "attacks");
        opponent.getDamaged(attackPower);
    }

    public void getDamaged(int attackPower) {
        System.out.println("SuperHero " + name + "recives" + attackPower + "of damage");
        health -= attackPower;

    }
    public void isAlive(){
        if (health <=0){
            isAlive = false; /// how to end the game
        }
    }
    public void showStats(){
        System.out.println("SuperHero " + name + "is the winner");
        System.out.println("SuperHero " + name + health + "left" );
    }


}
