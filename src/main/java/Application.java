import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Barsik", 5, 4, "meow-meow", 52);
        //kotik1.liveAnotherDay();
        //System.out.println("The name of this cat is " + kotik1.getName() + " and its weight is " + kotik1.getWeight());

        Kotik kotik2 = new Kotik();
        kotik2.setKotik("Polly", 8, 6, "murrr", 78);
        kotik2.liveAnotherDay();
        System.out.println("The name of this cat is " + kotik2.getName() + " and its weight is " + kotik2.getWeight());

        if (kotik1.getMeow().equals(kotik2.getMeow())) {
            System.out.println("These two cats sound the same");
        } else {
            System.out.println("These two cats sound different");
        }

        System.out.println("Number of cats that have been created: " + Kotik.getCounter());
    }
}
