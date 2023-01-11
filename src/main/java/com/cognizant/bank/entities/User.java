package com.cognizant.bank.entities;

import java.util.Date;

import com.cognizant.bank.entities.Loan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String username;
	private String password;
	private String address;
	private String country;
	private String email;
	private long accountNo;
	private long contactNo;
	private Date dob;
	private String accountType;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loan_id", referencedColumnName="id")
	private Loan loan;
	

}