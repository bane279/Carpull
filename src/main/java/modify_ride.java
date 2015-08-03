package main.java;

public class Ride {
	
	String name;
	String Source;
	String Destination;
	String startTime;
	String emailID;
	String phoneNumber;
	boolean modification, sourceValid, destValid, timeValid, postValid;
	
	public Ride(String name, String phoneNumber, String emailID, String source, String destination,
			String startTime) {
		super();
		this.name = name;
		Source = source;
		Destination = destination;
		this.startTime = startTime;
		this.emailID = emailID;
		this.phoneNumber = phoneNumber;
	}
	public boolean isModification() {
		return modification;
	}
	public void setModification(boolean modification) {
		this.modification = modification;
	}
	public boolean isSourceValid() {
		return sourceValid;
	}
	public void setSourceValid(boolean sourceValid) {
		this.sourceValid = sourceValid;
	}
	public boolean isDestValid() {
		return destValid;
	}
	public void setDestValid(boolean destValid) {
		this.destValid = destValid;
	}
	public boolean isTimeValid() {
		return timeValid;
	}
	public void setTimeValid(boolean timeValid) {
		this.timeValid = timeValid;
	}
	public boolean isPostValid() {
		return postValid;
	}
	public void setPostValid(boolean postValid) {
		this.postValid = postValid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
