package com.mycompany.agency;

    // TODO 1: Make TempEmployee a child of StaffEmployee

public class TempEmployee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmployee(String eName, String eAddress, String ePhone,
                        String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO2: Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        hoursWorked = hoursWorked + moreHours;
    }

    //-----------------------------------------------------------------
    // TODO3: Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        return super.payRate * hoursWorked;
    }

    //-----------------------------------------------------------------
    // TODO4: Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString()+ "\nHours Worked: " + hoursWorked;
    }
}
