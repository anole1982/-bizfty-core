package com.icss.regie.api.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ValueNumber {
	
	@Column(name = "DEFAULT_NUMBER",precision=19,scale=0)
	private BigDecimal defaultNumber;
	@Column(name = "MAX_NUMBER",precision=19,scale=0)
        
	private BigDecimal maxNumber;
	@Column(name = "MIN_NUMBER",precision=19,scale=0)
	private BigDecimal minNumber;
	@Column(name = "INTEGRAL",precision=2,scale=0)
	private int integral;
	@Column(name = "FRACTION",precision=2,scale=0)
	private int fraction;
	
	public BigDecimal getDefaultNumber() {
		return defaultNumber;
	}
	public void setDefaultNumber(BigDecimal defaultNumber) {
		this.defaultNumber = defaultNumber;
	}
	public BigDecimal getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(BigDecimal maxNumber) {
		this.maxNumber = maxNumber;
	}
	public BigDecimal getMinNumber() {
		return minNumber;
	}
	public void setMinNumber(BigDecimal minNumber) {
		this.minNumber = minNumber;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public int getFraction() {
		return fraction;
	}
	public void setFraction(int fraction) {
		this.fraction = fraction;
	}

}
