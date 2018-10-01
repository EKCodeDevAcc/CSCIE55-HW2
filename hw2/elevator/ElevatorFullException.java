package hw2.elevator;

/**
 * Elevator class contains move, boardPassengers, and toString methods.
 * It changes floors, change the direction of the elevator depends on situations.
 * It checks if there is a passenger whose destination floor is current floor.
 * It print out a message which indicates the number of passengers on board and the current floor.
 * @author  Edward Kang
 */

import hw2.elevator.Floor;
import hw2.elevator.Elevator;

public class ElevatorFullException extends Exception {

    public ElevatorFullException() {
        super("This is ElevatorFullException");
    }
}
