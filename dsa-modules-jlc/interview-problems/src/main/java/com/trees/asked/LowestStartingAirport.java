package com.trees.asked;
/*
You have an airplane with gas tank which stores unlimited fuel
There are N airports along a route, where the number of units of fuel available at each airport is stored in fuel[i].
The number of units of fuel required to get the next airport in the route is stored in fuel_needed_to_get_to_the_next_airport[i].

Begin the journey with zero units of fuel at one of the airports. Given two interger arrays of fuel[] and fuel_needed_to_get_to_the_next_airport[],
return the lowest starting airport index where you can travel around the full circuit once in the left to right dicrection. The trip must begin and end at the same airport.
If no scenario is possible return -1.

example
fuel: [1,2]
fuel_needed_to_get_to_the_next_airport[2,1]
output : 1
 */
public class LowestStartingAirport {
    public static int findLowestStartingAirport(int[] fuel, int[] fuelNeeded) {
        int n = fuel.length;
        int totalRemainingFuel = 0;
        int currentRemainingFuel = 0;
        int startingAirport = 0;

        for (int i = 0; i < n; i++) {
            int remainingFuel = fuel[i] - fuelNeeded[i];
            totalRemainingFuel += remainingFuel;
            currentRemainingFuel += remainingFuel;

            if (currentRemainingFuel < 0) {
                // If currentRemainingFuel is negative, start the journey from the next airport
                currentRemainingFuel = 0;
                startingAirport = i + 1;
            }
        }

        // Check if we can complete the circuit with non-negative totalRemainingFuel
        if (totalRemainingFuel >= 0) {
            return startingAirport;
        } else {
            return -1; // No scenario is possible
        }
    }

    /*public static int CalculateStartIndex(List<Integer> fuel, List<Integer> fuelNeeded) {
        int n = fuel.size();
        int totalRemainingFuel = 0;
        int currentRemainingFuel = 0;
        int startingAirport = 0;

        for (int i = 0; i < n; i++) {
            int remainingFuel = fuel.get(i) - fuelNeeded.get(i);
            totalRemainingFuel += remainingFuel;
            currentRemainingFuel += remainingFuel;

            if (currentRemainingFuel < 0) {
                // If currentRemainingFuel is negative, start the journey from the next airport
                currentRemainingFuel = 0;
                startingAirport = i + 1;
            }
        }

        // Check if we can complete the circuit with non-negative totalRemainingFuel
        if (totalRemainingFuel >= 0) {
            return startingAirport;
        } else {
            return -1; // No scenario is possible
        }
    }*/
    public static void main(String[] args) {
        //int[] fuel = {1, 2};
        //int[] fuelNeeded = {2, 1};
        int[] fuel = {5, 2};
        int[] fuelNeeded = {2, 1};
        int result = findLowestStartingAirport(fuel, fuelNeeded);
        System.out.println("Output: " + result); // Output: 1
    }
}
