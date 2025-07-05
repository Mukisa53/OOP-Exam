While Loop: It continues to execute as long as a specified condition is true. It is typically used when the number of iterations is not known beforehand.

// Using while loop to track daily PM2.5 levels for 30 days
int day = 1;
while (day <= 30) {
    System.out.println("Day " + day + ": Tracking PM2.5 levels.");
    day++; // Increment day
}


For Loop: It is generally used when the number of iterations is known. It consists of initialization, condition checking, and iteration expression all in one line.

// Using for loop to track daily PM2.5 levels for 30 days
for (int day = 1; day <= 30; day++) {
    System.out.println("Day " + day + ": Tracking PM2.5 levels.");
}
