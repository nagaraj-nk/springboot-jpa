package com.srjons.springbootjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "person")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class DifferentPerson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany
	@JoinColumn(name = "person_id")
	private Set<Mobile> mobiles;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "person_cert", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "cert_id"))
	private Set<Certificate> certificates;

	public Set<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}

	public Set<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(Set<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DifferentPerson() {
		super();
	}

	public DifferentPerson(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
