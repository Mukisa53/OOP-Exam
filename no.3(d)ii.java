        Arrays.sort(aqiReadings); // Sort the array to find the median
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[aqiReadings.length / 2 - 1] + aqiReadings[aqiReadings.length / 2]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }
        System.out.println("Median AQI Value: " + median);
