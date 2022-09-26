package Flights;

import People.CabinCrew;
import People.FlightCrew;
import People.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<FlightCrew> pilots;;
    private ArrayList<CabinCrew> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<FlightCrew> pilots, ArrayList<CabinCrew> crew, ArrayList<Passenger> passengers, Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<FlightCrew> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<FlightCrew> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<CabinCrew> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<CabinCrew> crew) {
        this.crew = crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getSizeOfCrew(Integer ArrayList){
        return this.crew.size();2
    }
}



