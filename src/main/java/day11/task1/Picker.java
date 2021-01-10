package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "заработная плата: " + salary +
               "был выплачен бонус или нет: " + isPayed;
    }

    public void doWork() {
        salary = salary + 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                salary = salary + 70000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
