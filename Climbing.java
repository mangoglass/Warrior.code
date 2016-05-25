
/**
 * The Warrior Code
 */

public class Climbing extends YourWillpower{

    private int willpower, strength, end, heightClimbed;
    private boolean handsAreSweaty;

    public Climbing(int height) {
        end = height;
        strength = 9001;
        willpower = Integer.MAX_VALUE;
    }

    public void startClimbing() {
        while(reachedTop() != true && willpower > 0) {
            if(handsAreSweaty) chalkHands();
            else continueClimbing();
        }
    }

    private void continueClimbing() {
        heightClimbed ++;
        System.out.println(end - heightClimbed + " meters remaining.");
        System.out.println("Never give up, never surrender, rise up against the odds");
    }

    public static void main(String[] args) {
        Climbing tallestMountain = new Climbing(8850);
        tallestMountain.startClimbing();
    }
}