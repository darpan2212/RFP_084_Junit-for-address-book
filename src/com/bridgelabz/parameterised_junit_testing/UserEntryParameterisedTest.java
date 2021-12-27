package com.bridgelabz.parameterised_junit_testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class UserEntryParameterisedTest {
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String emailID;
	private boolean expectedResult;
	private ValidateUserEntry userEntry;

	public UserEntryParameterisedTest(String firstName, String lastName, String contactNumber, String emailID,
			Boolean expectedResult) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailID = emailID;
	}

	@Before
	public void initialize() {
		userEntry = new ValidateUserEntry();
	}

	@Parameterized.Parameters
	public static Collection primeNumbers(String firstName, String lastName, String contactNumber, String emailID,
			Boolean expectedResult) {
		return Arrays.asList(new Object[][] { { firstName, true }, { lastName, false }, { contactNumber, true },
				{ emailID, false }, { expectedResult, true } });
	}
}
