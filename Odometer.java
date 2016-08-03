public class Odometer {
    int currentReading;

    static int getSmallestReading (int numberOfDigits) {
        int reading = 0;
        double multiplier = Math.pow(10, numberOfDigits - 1);
        for (int i = 1 ; i <= numberOfDigits ; i ++) {
            reading += i * multiplier;
            multiplier /= 10;
        }
        return reading;
    }

    static int getLargestReading (int numberOfDigits) {
        int reading = 0;
        double multiplier = Math.pow(10, numberOfDigits - 1);
        for (int i = numberOfDigits ; i >= 1 ; i --) {
            reading += i * multiplier;
            multiplier /= 10;
        }
        return reading;
    }

    static int getNextReading (int reading) {
        int length=findLength(reading);
        if(reading==getLargestReading(length)){
            return getSmallestReading(length);
        }
        do{
            reading++;
        }while(!chkFormat(reading));
        return reading;
    }

    static int getPreviousReading (int reading) {
        int length=findLength(reading);
        if(reading==getSmallestReading(length)){
            return getLargestReading(length);
        }
        do{
            reading--;
        }while(!chkFormat(reading));
        return reading;
    }

    static int getDistance (int firstReading, int secondReading) {
        return 0;
    }

    static int getNReadingsAfter (int reading, int n) {
        return 0;
    }

    static int getNReadingsBefore (int reading, int n) {
        return 0;
    }
    static int findLength(int reading){
        String s="";
        s+=reading;
        return s.length();
    }

}
