public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // добавление нескольких игрушек
        store.addToy(1, "LEGO", 10, 20);
        store.addToy(2, "Godzilla", 5, 10);
        store.addToy(3, "Simple Dimple", 20, 70);

        // устанавливаем частоту выпадения игрушки
        store.setToyWeight(2, 30);

        // играть в игру
        store.play();

        // получите призовую игрушку
        try {
            store.getPrizeToy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}