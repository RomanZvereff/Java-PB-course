package zverev_roman;

public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus(100, 32, 130);
        Human driver = new Human("James", "Gosling");
        bus.setDriver(driver);

        BusStation station1 = new BusStation("Java 1.0");
        BusStation station2 = new BusStation("Java 1.2");
        BusStation station3 = new BusStation("Java 5.0");
        BusStation station4 = new BusStation("Java 14");

        bus.busStations.add(station1);
        bus.busStations.add(station2);
        bus.busStations.add(station3);
        bus.busStations.add(station4);

        Human passenger1 = new Human("unknown","unknown");
        Dog dog = new Dog("Sun Microsystems", "labrador");
        passenger1.setDog(dog);

        Human passenger2 = new Human("unknown","unknown");
        Human passenger3 = new Human("unknown","unknown");
        Human passenger4 = new Human("unknown","unknown");
        Human passenger5 = new Human("unknown","unknown");

        // Bus actions
        bus.passengers.add(passenger1);
        bus.getPassengers();
        bus.leaveStation(1); // Автобус трогается с первой остановки
        bus.go();
        bus.arriveAtStation(2);
        bus.passengers.remove(passenger1);
        bus.getPassengers();

        bus.leaveStation(2);
        bus.go();
        bus.arriveAtStation(3);
        bus.passengers.add(passenger2);
        bus.passengers.add(passenger3);
        bus.passengers.add(passenger4);
        bus.passengers.add(passenger5);
        bus.getPassengers();

        bus.leaveStation(3);
        bus.go();
        bus.arriveAtStation(4);
        bus.passengers.remove(passenger2);
        bus.passengers.remove(passenger3);
        bus.passengers.remove(passenger4);
        bus.passengers.remove(passenger5);
        bus.getPassengers();
    }
}
