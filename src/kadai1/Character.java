package kadai1;

public abstract class Character{
    String name;
    public class Wizard extends Character {
        private Wizard() {
        }

        public static kadai1.Wizard createWizard() {
            return new kadai1.Wizard();
        }
    }
    public abstract void run();
    public abstract void attack(Matango m);
}
