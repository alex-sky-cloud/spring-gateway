package com.gateway.model;

import java.util.Objects;


public class Account {

	private Integer id;
	private String number;

	public Account() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Account account = (Account) o;
		return Objects.equals(id, account.id) &&
				Objects.equals(number, account.number);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, number);
	}
}
