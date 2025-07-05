import java.util.Random;
import java.util.Arrays;

public class AirQualityMonitoring {
    public static void main(String[] args) {
        Random random = new Random();
        int[] aqiReadings = new int[30]; // Array to store 30 AQI readings

        // i) Generate 30 random AQI readings between 1 and 300
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; // Random value between 1 and 300
        }
