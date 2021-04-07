package org.neeraj.creational.builder;

import java.time.LocalDate;

//this is our client  which will works as "Director"
public class Client {

	public static void main(String args[]) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}
	
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
			   .withAddress(user.getAddress())
			   .withBirthday(user.getBirthday())
			   .build();
	}
	/**
	 * Returns a sample user
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1991, 8, 18));
		user.setFirstName("Neeraj");
		user.setLastName("Kamra");
		Address address = new Address();
		address.setHouseNumber("27/B");
		address.setStreet("SST Complex");
		address.setCity("Patiala");
		address.setState("Punjab");
		address.setZipCode("147001");
		user.setAddress(address);
		return user;
	}
	
}
