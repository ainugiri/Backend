package com.spring.crud.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "coupon")
public class AddCoupon {
	@Id
	@Column(name = "COUPONID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int couponID;
	@Column(name = "COUPONNAME")
	private String couponName;
	@Column(name = "COUPONCODE")
	private String couponCode;
	@Column(name = "DISCOUNT")
	private float discount;
	
	
	public AddCoupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddCoupon(int couponID, String couponName, String couponCode, float discount) {
		super();
		this.couponID = couponID;
		this.couponName = couponName;
		this.couponCode = couponCode;
		this.discount = discount;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public int getCouponID() {
		return couponID;
	}
	
	

}
