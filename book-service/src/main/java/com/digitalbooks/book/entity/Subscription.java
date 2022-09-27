package com.digitalbooks.book.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.digitalbooks.book.util.MyGenerator;

@Entity
public class Subscription {
	@Id
	@GeneratedValue(generator = MyGenerator.generatorName)
	@GenericGenerator(name = MyGenerator.generatorName, strategy = "com.digitalbooks.book.util.MyGenerator")
	private String id;
	@OneToOne(targetEntity = PurchaseInfo.class, cascade = CascadeType.ALL)
	private PurchaseInfo purchaseInfo;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PurchaseInfo getPurchaseInfo() {
		return purchaseInfo;
	}

	public void setPurchaseInfo(PurchaseInfo purchaseInfo) {
		this.purchaseInfo = purchaseInfo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, purchaseInfo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subscription other = (Subscription) obj;
		return Objects.equals(id, other.id) && Objects.equals(purchaseInfo, other.purchaseInfo);
	}

}
