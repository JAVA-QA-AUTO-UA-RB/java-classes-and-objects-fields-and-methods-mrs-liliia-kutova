public class Main {
    public static void main(String[] args) {

        // Тут має розгортатися епічна битва між Супергероями

        SuperHero flash = new SuperHero();
        SuperHero ironMan = new SuperHero();
        SuperHero jackieChan = new SuperHero();

        flash.name = "flash";
        flash.attackPower = 20;
        flash.deffencePower = 10;
        flash.health = 100;

        ironMan.name = "ironMan";
        ironMan.attackPower = 15;
        ironMan.deffencePower = 5;
        ironMan.health = 100;

        jackieChan.name = "Jackie";
        jackieChan.attackPower = 15;
        jackieChan.deffencePower = 10;
        jackieChan.health = 100;

        System.out.println("Let's the game begin");

        while (flash.isAlive() && ironMan.isAlive()) {
            flash.attack(ironMan, 25);
            if (ironMan.isAlive()) {
                ironMan.attack(flash, 10);
            }
        }

            if (flash.isAlive()) {
                System.out.println("Let's the second game begin");
                while (flash.isAlive() && jackieChan.isAlive()) {
                    flash.attack(jackieChan, 15);
                    if (jackieChan.isAlive()) ;
                    jackieChan.attack(flash, 25);
                }


            }
        }
    }


