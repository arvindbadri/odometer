public class OdometerMain {
    public static void main (String [] args) {
        System.out.println ("Smallest reading of 6 digits: " + Odometer.getSmallestReading(6));
        System.out.println ("Largest reading of 8 digits: " + Odometer.getLargestReading(8));
        System.out.println ("Reading after 1249: " + Odometer.getNextReading(1249));
        System.out.println ("Reading before 1234: " + Odometer.getPreviousReading(1234));
        System.out.println ("Distance from 1234 to 1249: " + Odometer.getDistance(1234, 1249));
        System.out.println ("Distance from 1249 to 1234: " + Odometer.getDistance(1249, 1234));
        System.out.println ("The reading 15 readings after 45678 is: " + Odometer.getNReadingsAfter(45678, 15));
        System.out.println ("The reading 12 readings before 156789 is: " + Odometer.getNReadingsBefore (156789, 12));
    }
}
