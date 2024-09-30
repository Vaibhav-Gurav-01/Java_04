/*6.    Write a class Time with three data members to store hr, min and seconds. Create two constructors and apply checks to set valid time. (hr<24, min<60, sec<60). Also create display function which displays all data members.*/

package myPackage;
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor with parameters
    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Default constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Method to set time with validation
    public void setTime(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time. Setting to default (00:00:00).");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    // Method to validate time
    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours < 24) && 
               (minutes >= 0 && minutes < 60) && 
               (seconds >= 0 && seconds < 60);
    }

    // Method to display time
    public void display() {
        System.out.printf("Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
