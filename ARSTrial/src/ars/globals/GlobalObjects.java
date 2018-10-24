package ars.globals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Class containing global enums and variables

public class GlobalObjects implements Serializable
{
	public static enum seatClass {Business_Class, First_Class, Economy}; //Kinds of seating in the flight
	public static enum sex {Male, Female, Transgender, Prefer_not_to_Say}; //Sex of user
	public static enum user {Guest, Existing_Account, Admin}; //User account type
	public static enum cardType {Debit, Credit};
	public static enum paymentPlatform {Visa, Mastercard, Rupay};
	public static enum flightType {Domestic, International};
	public static enum idType {Passport, Drivers_Licence, Aadhar_Card, Ration_Card};
	public static enum ageGroup {Adult, Child, Infant};
	public static enum flightStatus {Available, Cancelled, Now_Boarding, Delayed, Check_In};
	public static enum bank {IOB, SBI, HDFC, AXIS, ICICI, CSB};
	
	public static long userCount = 0;
	public static long aircraftCount = 0;
	public static long airlineCount = 0;
	public static long flightCount = 0;
	public static long ticketCount = 0;
	
	public static final String driverLoc = "com.mysql.jdbc.Driver"; //location of driver to be used
	public static final String dbName = "nissan"; //Name of database used
	public static final String dbUsername = "root"; //Username for DB access
	public static final String dbPassword = "admin"; //Password for DB access
	public static final String userTable = "user"; //Name of table containing User data
	public static final String accountTable = "account"; //Name of table containing account information
	public static final String airlinesTable = "airlines"; //Name of table containing airline information
	public static final String aircraftTable = "aircraft"; //Name of table containing account information
	public static final String flightTable = "flight"; //Name of table containing account information
	public static final String ticketTable = "ticket"; //Name of table containing account information
	
	public static String menuHeadFormatter(String s)
	{
		final String stars = "**************************************************************************************";
		if ((s.length()%2 == 0 && stars.length()%2 !=0) || (s.length()%2 != 0 && stars.length()%2 ==0))
			stars.concat("*");
		int indexLocations = ((int) (stars.length()/2) - (int)(s.length()/2));
		return (stars.substring(0,indexLocations) + s + stars.substring(stars.length() - indexLocations - 1, stars.length() - 1));
	}
	
	public static void staticVariableWriter() throws Exception 
	{
		FileOutputStream fos = new FileOutputStream(new File("StaticValueDump.dat"));
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject((Object)(userCount));
	    oos.flush();
	    oos.writeObject((Object)(airlineCount));
	    oos.flush();
	    oos.writeObject((Object)(aircraftCount));
	    oos.flush();
	    oos.writeObject((Object)(flightCount));
	    oos.flush();
	    oos.writeObject((Object)(ticketCount));
	    oos.flush();
	    oos.close();
	}


	public static void staticVariableLoader() throws Exception 
	{
		FileInputStream fis;
		
		try
		{
			fis = new FileInputStream(new File("StaticValueDump.dat"));
		}
		
		catch(Exception e)
		{
			staticVariableWriter();
		}
		
		finally
		{
			fis = new FileInputStream(new File("StaticValueDump.dat"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object value = ois.readObject();
			userCount = (long)value;
			value = ois.readObject();
			airlineCount = (long)value;
			value = ois.readObject();
			aircraftCount = (long)value;
			value = ois.readObject();
			flightCount = (long)value;
			value = ois.readObject();
			ticketCount = (long)value;
			ois.close();
		}
	}
	
}

