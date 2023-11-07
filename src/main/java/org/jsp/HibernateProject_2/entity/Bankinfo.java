package org.jsp.HibernateProject_2.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bankinfo database table.
 * 
 */
@Entity
@NamedQuery(name="Bankinfo.findAll", query="SELECT b FROM Bankinfo b")
public class Bankinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int acctNo;

	private double balance;

	private String bankName;

	private String holderName;

	private String ifsc;

	public Bankinfo() {
	}

	public int getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getIfsc() {
		return this.ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

}