package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import main.java.Ride;
import main.java.RidePosting;

public class Cucumber extends TestCase{
	Ride ride = new Ride();
	String actButton;
	RidePosting posting = new RidePosting();
	@Given("^Employee has posted all valid data.$")
	public void Employee_has_posted_all_valid_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		ride.setEmpName("abc");
		ride.setPhnNo("1234567890");
		ride.setSrc("Start");
		ride.setDest("Dest");
		ride.setStartTime("10:30");
		ride.setEmail("abc@ca.com");
	    //throw new PendingException();
	}

	@When("^Employee clicks on \"([^\"]*)\" button.$")
	public void Employee_clicks_on_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actButton = arg1;
	}

	@Then("^System should show a message \"([^\"]*)\".$")
	public void System_should_show_a_message_(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		//RidePosting posting = new RidePosting();
		assertEquals(arg1, posting.SaveRide(ride));
	}

	@Given("^Employee has posted invalid Name.$")
	public void Employee_has_posted_invalid_Name() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setEmpName("");
		ride.setPhnNo("1234567890");
		ride.setSrc("Start");
		ride.setDest("Dest");
		ride.setStartTime("10:30");
		ride.setEmail("abc@ca.com");
	}

	@Then("^System should show a message \"([^\"]*)\"$")
	public void System_should_show_a_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		//RidePosting posting = new RidePosting();
	    assertEquals(arg1, posting.SaveRide(ride));
	}

	@Given("^Employee has posted invalid Email.$")
	public void Employee_has_posted_invalid_Email() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setEmpName("abc");
		ride.setPhnNo("1234567890");
		ride.setSrc("Start");
		ride.setDest("Dest");
		ride.setStartTime("10:30");
		ride.setEmail("");
	}

	@Given("^Employee has posted invalid Phone.$")
	public void Employee_has_posted_invalid_Phone() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setEmpName("abc");
		ride.setPhnNo("12345");
		ride.setSrc("Start");
		ride.setDest("Dest");
		ride.setStartTime("10:30");
		ride.setEmail("abc@ca.com");
	}

	@Given("^Employee has posted invalid Source.$")
	public void Employee_has_posted_invalid_Source() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setEmpName("abc");
		ride.setPhnNo("1234567890");
		ride.setSrc("");
		ride.setDest("Dest");
		ride.setStartTime("10:30");
		ride.setEmail("abc@ca.com");
	}

	@Given("^Employee has posted invalid Destination.$")
	public void Employee_has_posted_invalid_Destination() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setEmpName("abc");
		ride.setPhnNo("1234567890");
		ride.setSrc("Start");
		ride.setDest("");
		ride.setStartTime("10:30");
		ride.setEmail("abc@ca.com");
	}

	@Given("^Employee has posted invalid Time.$")
	public void Employee_has_posted_invalid_Time() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setEmpName("abc");
		ride.setPhnNo("1234567890");
		ride.setSrc("Start");
		ride.setDest("Dest");
		ride.setStartTime("");
		ride.setEmail("abc@ca.com");
	}

	@Given("^Employee has posted some/no data.$")
	public void Employee_has_posted_some_no_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setEmpName("abc");
		ride.setPhnNo("1234567890");
		ride.setSrc("Start");
		ride.setDest("Dest");
		ride.setStartTime("110:30");
		ride.setEmail("abc@ca.com");
	}

	@Then("^System should reset all fields to blank.$")
	public void System_should_reset_all_fields_to_blank() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		//RidePosting posting = new RidePosting();
		ride=null;
	}


}
