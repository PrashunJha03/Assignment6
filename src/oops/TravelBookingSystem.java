package overloading;

class TravelBooking {
    int bookingId;
    String passengerName;
    String source;
    String destination;
    int distance;

    double calculateFare() {
        return 0;
    }
}

class BusBooking extends TravelBooking {
    String busType = "AC";
    int seatNumber;

    @Override
    double calculateFare() {
        double fare;
        if (busType.equals("AC")) {
            fare = distance * 50;   
        } else {
            fare = distance * 30;
        }
        System.out.println("Total fare : " + fare);
        return fare;
    }
}

class TrainBooking extends TravelBooking {
    int trainNumber;
    String coachType = "AC";

    @Override
    double calculateFare() {
        double fare;
        if (coachType.equals("AC")) {
            fare = distance * 100;
        } else {
            fare = distance * 80;
        }
        System.out.println("Train Fare : " + fare);
        return fare;
    }
}

public class TravelBookingSystem {
    public static void main(String[] args) {
        BusBooking b = new BusBooking();
        b.bookingId = 12345;
        b.busType = "AC";
        b.destination = "Bangalore";
        b.distance = 100;
        b.passengerName = "Prashun";
        b.seatNumber = 50;
        b.source = "Chennai";

        System.out.println("Booking ID : " + b.bookingId);
        System.out.println("Bus Type : " + b.busType);
        System.out.println("Destination  : " + b.destination);
        System.out.println("Distance : " + b.distance);
        System.out.println("Passenger Name : " + b.passengerName);
        System.out.println("Seat Number : " + b.seatNumber);
        System.out.println("Source : " + b.source);
        b.calculateFare();

        TrainBooking t = new TrainBooking();
        t.bookingId = 1001;
        t.coachType = "non-ac";
        t.destination = "Bangalore";
        t.distance = 1000;
        t.passengerName = "Prashun";
        t.trainNumber = 12390;
        t.source = "Bihar";

        System.out.println("\nBooking ID : " + t.bookingId);
        System.out.println("Coach Type : " + t.coachType);
        System.out.println("Destination  : " + t.destination);
        System.out.println("Distance : " + t.distance);
        System.out.println("Passenger Name : " + t.passengerName);
        System.out.println("Train Number : " + t.trainNumber);
        System.out.println("Source : " + t.source);
        t.calculateFare();

        
        TravelBooking booking = new BusBooking();
        booking.distance = 200;
        booking.calculateFare();

        booking = new TrainBooking();
        booking.distance = 500;
        booking.calculateFare();
    }
}