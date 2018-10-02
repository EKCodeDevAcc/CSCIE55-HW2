package hw2.elevator;

import hw2.elevator.Building;

public class Floor extends Building {

    private int floorNum = 1;
    private static int passengersWaiting = 0;
    private static int[] floorPassengers = new int[Building.FLOORS];
    private static int checkerFloorCalled = 0;

    public Floor(Building building, int floorNumber) {
        this.floorNum = floorNumber;
    }

    public int getPassengersWaiting() {
        return floorPassengers[floorNum - 1];
    }

    public void setPassengersWaiting() {
        floorPassengers[floorNum - 1] = 0;
    }

    public void waitForElevator() {
        floorPassengers[floorNum - 1]++;
        passengersWaiting = floorPassengers[floorNum - 1];
        checkerFloorCalled++;
    }

    public int checkFloorCalled() {
        return checkerFloorCalled;
    }
}
