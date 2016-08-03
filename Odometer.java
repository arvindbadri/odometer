public class Odometer {
    int currentReading;

	static Boolean chkFormat(int reading) {
		int prevDigit=10;
		int length = findLength(reading);
		int lengthCount = 1;
		int tenVal = 10;
		while(lengthCount <= length) {
				if(prevDigit < reading%tenVal)
					return false;
				prevDigit = reading%tenVal;
				reading /= 10;
				lengthCount++;
		}
		return true;
	}
	
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
        int distance = 0;
		while(firstReading != secondReading) {
			firstReading = getNextReading(firstReading);
			distance++;
		}
        return distance;
    }

    static int getNReadingsAfter (int reading, int n) {
        while(n != 0) {
			reading = getNextReading(reading);
            n--;
		}
        return reading;
    }

    static int getNReadingsBefore (int reading, int n) {
        while(n != 0) {
			reading = getPreviousReading(reading);
            n--;
		}
        return reading;
    }
    static int findLength(int reading){
        String s=Integer.toString(reading);
        return s.length();
    }

}
