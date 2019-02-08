package com.org.nic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class UserProfile {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Id
	@NotNull(message = "User Email can not be null.")
	@Size(max = 50, message = "User email should have atleast 50 characters")
	
	private String email;
	private String mobile;
	private String name;
	private String ophone;
	private String rphone;
	private String designation;
	private String emp_code;
	private String address;
	private String city;
	private String add_state;
	private String pin;
	private String employment;
	private String ministry;
	private String department;
	private String other_dept;
	private String state;
	private String organization;
	private String ca_name;
	private String ca_desig;
	private String ca_mobile;
	private String ca_email;
	private String hod_name;
	private String hod_email;
	private String hod_mobile;
	private String hod_telephone;
	private String user_alt_address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOphone() {
		return ophone;
	}
	public void setOphone(String ophone) {
		this.ophone = ophone;
	}
	public String getRphone() {
		return rphone;
	}
	public void setRphone(String rphone) {
		this.rphone = rphone;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdd_state() {
		return add_state;
	}
	public void setAdd_state(String add_state) {
		this.add_state = add_state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getEmployment() {
		return employment;
	}
	public void setEmployment(String employment) {
		this.employment = employment;
	}
	public String getMinistry() {
		return ministry;
	}
	public void setMinistry(String ministry) {
		this.ministry = ministry;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getOther_dept() {
		return other_dept;
	}
	public void setOther_dept(String other_dept) {
		this.other_dept = other_dept;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getCa_name() {
		return ca_name;
	}
	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}
	public String getCa_desig() {
		return ca_desig;
	}
	public void setCa_desig(String ca_desig) {
		this.ca_desig = ca_desig;
	}
	public String getCa_mobile() {
		return ca_mobile;
	}
	public void setCa_mobile(String ca_mobile) {
		this.ca_mobile = ca_mobile;
	}
	public String getCa_email() {
		return ca_email;
	}
	public void setCa_email(String ca_email) {
		this.ca_email = ca_email;
	}
	public String getHod_name() {
		return hod_name;
	}
	public void setHod_name(String hod_name) {
		this.hod_name = hod_name;
	}
	public String getHod_email() {
		return hod_email;
	}
	public void setHod_email(String hod_email) {
		this.hod_email = hod_email;
	}
	public String getHod_mobile() {
		return hod_mobile;
	}
	public void setHod_mobile(String hod_mobile) {
		this.hod_mobile = hod_mobile;
	}
	public String getHod_telephone() {
		return hod_telephone;
	}
	public void setHod_telephone(String hod_telephone) {
		this.hod_telephone = hod_telephone;
	}
	public String getUser_alt_address() {
		return user_alt_address;
	}
	public void setUser_alt_address(String user_alt_address) {
		this.user_alt_address = user_alt_address;
	}

}
