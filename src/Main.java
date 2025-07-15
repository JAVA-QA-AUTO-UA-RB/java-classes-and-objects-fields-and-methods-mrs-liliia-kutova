public class Main {
    public static void main(String[] args) {

        // Тут має розгортатися епічна битва між Супергероями

        SuperHero flash = new SuperHero();
        SuperHero ironMan = new SuperHero();
        SuperHero jackieChan = new SuperHero();

        flash.name ="flash";
        flash.attackPower=20;
        flash.deffencePower=10;
        flash.health=100;
        flash.isAlive=true;

        ironMan.name="ironMan";
        ironMan.attackPower=15;
        ironMan.deffencePower=5;
        ironMan.health=100;
        ironMan.isAlive=true;

        jackieChan.name="Jackie";
        jackieChan.attackPower=15;
        jackieChan.deffencePower=10;
        jackieChan.health=100;
        jackieChan.isAlive=true;

        System.out.println("Let's the game begin");

        while (flash.isAlive() && ironMan.isAlive()){
        flash.attack(ironMan, 25);
        if (!ironMan.isAlive()) break;
        ironMan.showStats();
        ironMan.attack(flash, 10);
        if (!flash.isAlive()) break;
        flash.showStats();
        }



//        while (flash.isAlive && ironMan.isAlive) {
//            int attackStrength = //
        }
    }

