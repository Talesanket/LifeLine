package com.ex.LifeLine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	    
	    private String firstName;
	    private String lastName;
	    private String gender;
	    private String dateOfBirth;
	    private String address;
	    private String contactNumber;
	    private String email;
	    private String bloodType;
	    private String medicalHistory;
		public Patient() {
			super();
		}
		public Patient(String firstName, String lastName, String gender, String dateOfBirth, String address,
				String contactNumber, String email, String bloodType, String medicalHistory) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.dateOfBirth = dateOfBirth;
			this.address = address;
			this.contactNumber = contactNumber;
			this.email = email;
			this.bloodType = bloodType;
			this.medicalHistory = medicalHistory;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getBloodType() {
			return bloodType;
		}
		public void setBloodType(String bloodType) {
			this.bloodType = bloodType;
		}
		public String getMedicalHistory() {
			return medicalHistory;
		}
		public void setMedicalHistory(String medicalHistory) {
			this.medicalHistory = medicalHistory;
		}
		@Override
		public String toString() {
			return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
					+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", contactNumber=" + contactNumber
					+ ", email=" + email + ", bloodType=" + bloodType + ", medicalHistory=" + medicalHistory + "]";
		}
	    
}
