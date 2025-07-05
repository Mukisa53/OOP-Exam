        int hazardousDaysCount = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDaysCount++;
            }
        }
        System.out.println("Number of Hazardous Days (AQI > 200): " + hazardousDaysCount);
    }
}
