package com.hms.logic;

import java.util.ArrayList;
import java.util.List;

import com.hms.model.Doctor;

public class Logic {
	
	public List<Doctor> getAllDoctors(){
		ArrayList<Doctor> doc = new ArrayList();
		Doctor dt = new Doctor();
		dt.setId("101");
		dt.setName("ABC");
		dt.setAddress("Mumbai");
		dt.setEmail("abc@gmail.com");
		dt.setPassword("123");
		dt.setPhno(99999999L);
		dt.setSpecilization("Skin");
		dt.setDepartment("SKIN");
		doc.add(dt);
		return doc;
	}
	public Doctor getDoctor(){
		Doctor dt = new Doctor();
		dt.setId("101");
		dt.setName("ABC");
		dt.setAddress("Mumbai");
		dt.setEmail("abc@gmail.com");
		dt.setPassword("123");
		dt.setPhno(99999999L);
		dt.setSpecilization("Skin");
		dt.setDepartment("SKIN");
		return dt;
	}

}
