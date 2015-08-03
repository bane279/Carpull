package main.java;

public class RidePosting {
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public String SaveRide(Ride ride) {
/*		ride.setEmpName("abc");
		ride.setPhnNo("1234567890");
		ride.setSrc("Start");
		ride.setDest("Dest");
		ride.setStartTime("10:30");
		ride.setEmail("abc@ca.com");*/
		
		if(ride!=null)
		{
			if(ride.getEmpName().equals(""))
				return "Invalid Name";
			else if(!ride.getEmail().contains("@ca.com"))
				return "Invalid Email";
			else if(ride.getPhnNo().length()!=10 || !isNumeric(ride.getPhnNo()))
				return "Invalid Phone";
			else if(ride.getSrc().equals(""))
				return "Invalid Source";
			else if(ride.getDest().equals(""))
				return "Invalid Destination";
			else if(ride.getStartTime().matches("([01]?[0-9]|2[0-3]):[0-5][0-9])"))
				return "Invalid Time";
			else return "post is successful";
		}
		return "Unsuccessfull";
			
	}

}
