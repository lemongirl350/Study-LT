package model;

public class Kotik {
    private String name;
    private int prettiness;
    private int weight;
    private String meow;
    private int satiety;
    private static int counter;

    public Kotik (String name, int prettiness, int weight, String meow, int satiety) {
        this.name=name;
        this.prettiness=prettiness;
        this.weight=weight;
        this.meow=meow;
        this.satiety=satiety;
        counter++;
    }

    public Kotik () {
        counter++;
    }

    //methods of behavior
    private boolean play() {
        if (satiety <= 0) {
            askForFood();
            eat(5);
            return false;
        }
        satiety -= 8;
        System.out.println(name + " is playing");
        System.out.println("Satiety is " + satiety);
        return true;
    }

    private boolean sleep() {
        if (satiety <= 0) {
            askForFood();
            eat(9, "meat");
            return false;
        }
        satiety -= 3;
        System.out.println(name + " is sleeping");
        System.out.println("Satiety is " + satiety);
        return true;
    }

    private boolean chaseMouse() {
        if (satiety <= 0) {
            askForFood();
            eat();
            return false;
        }
        satiety -= 10;
        System.out.println(name + " is chasing the mouse");
        System.out.println("Satiety is " + satiety);
        return true;
    }

    private boolean sharpenClaws() {
        if (satiety <= 0) {
            askForFood();
            eat(4);
            return false;
        }
        satiety -= 6;
        System.out.println(name + " is sharpening its claws");
        System.out.println("Satiety is " + satiety);
        return true;
    }

    private boolean meow() {
        if (satiety <= 0) {
            askForFood();
            eat(6, "fish");
            return false;
        }
        satiety -= 4;
        System.out.println(name + " is meowing: '" + meow + "!'");
        System.out.println("Satiety is " + satiety);
        return true;
    }

    private void askForFood() {
        System.out.println(name + " is hungry. Feed it!");
    }

    private void eat (int satietyUnits) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten");
        System.out.println("Satiety is " + satiety);
    }

    private void eat (int satietyUnits, String foodName) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten " + foodName);
        System.out.println("Satiety is " + satiety);
    }

    private void eat () {
        int satietyUnits1 = 7;
        String foodName1 = "dry food";
        eat(satietyUnits1, foodName1);
    }

    public void liveAnotherDay() {
        System.out.println(name + "'s initial satiety is " + satiety);
        for (int i = 1; i <= 24; i++) {
            System.out.println("Hour " + i);
            int action = (int) (Math.random() * 5 + 1);
            switch (action) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    sharpenClaws();
                    break;
                case 5:
                    meow();
                    break;
            }
        }
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public int getPrettiness() {
        return prettiness;
    }
    public int getWeight() {
        return weight;
    }
    public String getMeow() {
        return meow;
    }
    public int getSatiety() {
        return satiety;
    }
    public static int getCounter() {
        return counter;
    }

    public void setKotik(String name, int prettiness, int weight, String meow, int satiety) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
    }



}
