//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cow wagyu = new Cow();
        Pig burin = new Pig();
        Duck donald = new Duck("โดนัล");
        Duck daicy = new Duck("เดซี่");
        Owl hedwig = new Owl();
        wagyu.sound();
        burin.sound();
        donald.sound();
        daicy.sound();
        hedwig.sound();
        donald.clean(wagyu);
        daicy.clean(donald);
        PekingDuck twoseasons = new PekingDuck("TSS");
        twoseasons.clean(new Cow());
        twoseasons.fly();
        twoseasons.beCrispy();
        donald.clean(new Cow());

    }
}