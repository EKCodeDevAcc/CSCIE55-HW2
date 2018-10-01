package hw2.elevator;

/**
 * Elevator class contains move, boardPassengers, and toString methods.
 * It changes floors, change the direction of the elevator depends on situations.
 * It checks if there is a passenger whose destination floor is current floor.
 * It print out a message which indicates the number of passengers on board and the current floor.
 * @author  Edward Kang
 */

import hw2.elevator.Building;
import hw2.elevator.Elevator;

public class Elevator extends Building {

    /**
     * NUMBER_FLOORS  total number of floors.
     * currentFloor  current floor which is is 1 by default.
     * direction  show the direction of elevator either up or down.
     * passengers  list of passengers destination floors.
     * totalPassengers  number of all passengers.
     * currentPassengers  number of passengers in the elevator which is equal to totalPassengers by default.
     */
    
    public static final int CAPACITY = 10;
    private int currentFloor = 1;
    private String direction = "Up";
    private int[] passengers = {0, 0, 0, 0, 0, 0, 0};
    private int currentPassengers = 0;

    /**
     * move method which performs to change the direction of floor and change floor.
     * If the elevator reaches 1st floor, changes its direction as Up, if it reaches the highest floor, changes its direction as Down.
     * Depends on the current direction, change currentFloor value when move method is called.
     */
    public void move() {
        int numberFloors = Building.FLOORS;

        if (currentFloor == 1) {
            direction = "Up";
        } else if (currentFloor == numberFloors) {
            direction = "Down";
        }

        if (direction == "Up") {
            currentFloor++;
        } else {
            currentFloor--;
        }

        passengers[currentFloor-1] = 0;
    }

    /**
     * boardPassenger method which checks the list of passengers' destination floors.
     * If there is a passenger whose destination floor is the current floor, update the list.
     * After update the list, also update currentPassengers by subtract selected passengers from currentPassengers.
     * The number of selected passengers are zeroCount.
     * @param  destinationFloor  currentFloor
     */
    public void boardPassenger(int destinationFloor) {
        int zeroCount = 0;
        
        //try {
            currentPassengers++;
            passengers[destinationFloor-1]++;
        /*} catch (ElevatorFullException efe) {
            System.out.println(efe.getMessage());
        }*/
    }

    /**
     * toString method which calls boardPassengers to check the number of passenger who wants to go to the current floor.
     * @return  string which contains information of the current floor and the number of passengers.
     */
    public String toString() {
        boardPassenger(currentFloor);
        return "Floor " + this.currentFloor + ": " + currentPassengers + " passengers";
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getPassengers() {
        return currentPassengers;
    }

    
}
