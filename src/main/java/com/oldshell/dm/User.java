package com.oldshell.dm;

public class User {

	private Integer id;
    private String firstName;
    private String lastName;
    private String age;
    private String gender;
    
    
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
    
    public User(Integer id, String firstName, String lastName, String age,
            String gender) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public Integer getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
	public void setGender(String gender) {
		this.gender = gender;
	}
    
	
}
