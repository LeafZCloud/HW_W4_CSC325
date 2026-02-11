package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList

        staffList[0] = new Executive("John", "Address 1", "999-888-777", "32-5672-6778",1000.00);
        staffList[1] = new Intern("Mary", "Address 2", "666-555-555");
        staffList[2] = new Intern("Dylan", "Address 3", "555-555-555");
        staffList[3] = new Intern("Mark", "Address 4", "554-444-444");
        staffList[4] = new StaffEmployee("Daisy", "Address 5", "444-333-333", "15-3335-3532",1000.00);
        staffList[5] = new TempEmploee("Barney", "Address 6", "333-333-333", "42-7643-3552",1000.00);


        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
