package adapterPattern;
/*
Класс "планшета", созданного при помощи паттерна Adapter, объединившего в себе функции
обоих интерфейсов
*/
public class Phablet implements Phone, Laptop {
    private Phone phone;
    private Laptop laptop;

    public Phablet() {
    }

    @Override
    public void Call() {
        this.phone.Call();
    }

    @Override
    public void PlayingGame() {
        this.laptop.PlayingGame();
    }
}
