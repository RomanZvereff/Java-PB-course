package zverev_roman;

import java.util.ArrayList;

/**
 * The class Bus represents passenger transport vehicle
 *
 * @author  Roman Zverev
 * @since   1.0
 */

public class Bus {

    int busNumber;
    int countOfSeats;
    int maxSpeed;
    Human driver;
    ArrayList<Human> passengers = new ArrayList<>();
    ArrayList<BusStation> busStations = new ArrayList<>();

    /**
     *
     * @param busNumber - bus route number
     * @param countOfSeats - bus capacity
     * @param maxSpeed - bus maximum speed
     */
    public Bus(int busNumber, int countOfSeats, int maxSpeed) {
        this.busNumber = busNumber;
        this.countOfSeats = countOfSeats;
        this.maxSpeed = maxSpeed;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Human driver() {
        return driver;
    }

    public void setDriver(Human driver) {
        this.driver = driver;
    }

    /**
     *  drives the bus
     */
    public void go(){
        System.out.println("Водитель " + driver.getFirstName()+ " " + driver.getLastName() + " на автобусе номер "
                    + busNumber + " движется со скоростью " + maxSpeed + "км/ч.");
        System.out.println();
    }

    public void leaveStation(int stationNumber){
        System.out.println("Автобус покидает станцию " + busStations.get(stationNumber - 1).getStationName());
    }

    public void arriveAtStation(int stationNumber){
        System.out.println("Автобус прибывает на станцию " + busStations.get(stationNumber - 1).getStationName());
    }

    /**
     * counts the number of passengers on the bus and prints the result to the console
     */
    public void getPassengers(){
        if(passengers.size() == 1){
            System.out.println("В автобус зашел " + passengers.size() + " пассажир");
        }else if(passengers.size() == 0){
            System.out.println("Все пассажиры вышли из автобуса");
        }else{
            System.out.println("В автобус зашло " + passengers.size() + " пассажира(ов)");
        }
    }
}
