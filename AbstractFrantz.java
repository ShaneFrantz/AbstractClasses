abstract class OfficeWorker {
    String firstName;
    String lastName;
    String status;
    String startMonth;
    String startDay;
    String startYear;
    int hoursWorked;

    OfficeWorker(String first, String last, String stat, String month, String day, String year) {
        firstName = first;
        lastName = last;
        status = stat;
        startMonth = month;
        startDay = day;
        startYear = year;
    }

    public abstract void enterTime(int hours);
    public abstract boolean overTime(int hours);
}

class Manager extends OfficeWorker {

    Manager(String first, String last, String stat, String month, String day, String year) {
        super(first, last, stat, month, day, year);
    }

    public void enterTime(int hours) {
        System.out.print("You do not need to enter hours.");
    }

    public boolean overTime(int hours) {
        return false;
    }

    public void hire(String firstName, String lastName) {
        System.out.print(firstName + " " + lastName + " has been hired.");
    }

    public void fire(String firstName, String lastName) {
        System.out.print(firstName + " " + lastName + " has been fired.");
    }

}

class Supervisor extends OfficeWorker {

    Supervisor(String first, String last, String stat, String month, String day, String year, int hours) {
        super(first, last, stat, month, day, year);
        hoursWorked = hours;
    }

    public void enterTime(int hours) {
        hoursWorked += hours;
    }

    public boolean overTime(int hours) {
        int totalHours = hours;
        if (totalHours >= 8)
            return true;
        else
            return false;
    }

    public void fire(String firstName, String lastName) {
        System.out.print(firstName + " " + lastName + " has been fired.");
    }


}

class Teammate extends OfficeWorker {

    Teammate(String first, String last, String stat, String month, String day, String year, int hours) {
        super(first, last, stat, month, day, year);
        hoursWorked = hours;
    }

    public void enterTime(int hours) {
        hoursWorked += hours;
    }

    public boolean overTime(int hours) {
        int totalHours = hours;
        if (totalHours >= 8)
            return true;
        else
            return false;
    }

}


