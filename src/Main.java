public class Main {
    public static void main(String[] args) {
        MagicBox<String> linesMagicBox = new MagicBox<>(5);
        linesMagicBox.add("One");
        linesMagicBox.add("Two");
        linesMagicBox.add("Three");
        linesMagicBox.add("Four");
        linesMagicBox.add("Five");
        System.out.println(linesMagicBox.pick());

        MagicBox<Integer> numbersMagicBox = new MagicBox<>(7);
        numbersMagicBox.add(1);
        numbersMagicBox.add(2);
        numbersMagicBox.add(3);
        numbersMagicBox.add(4);
        numbersMagicBox.add(5);
        System.out.println(numbersMagicBox.pick());
    }
}
