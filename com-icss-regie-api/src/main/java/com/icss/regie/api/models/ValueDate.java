package com.icss.regie.api.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;


@Embeddable
public class ValueDate {

    @Column(name = "DEFAULT_DATE", unique = false, nullable = false,length=7)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date defaultDate;
    @Column(name = "USE_NOW", unique = false, nullable = false,length=1)
	private boolean useNow;
    @Column(name = "MAX_DATE", unique = false, nullable = false,length=7)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date maxDate;
    @Column(name = "MIN_DATE", unique = false, nullable = false,length=7)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date minDate;
    
	public Date getDefaultDate() {
		return defaultDate;
	}
	public void setDefaultDate(Date defaultDate) {
		this.defaultDate = defaultDate;
	}
	public boolean isUseNow() {
		return useNow;
	}
	public void setUseNow(boolean useNow) {
		this.useNow = useNow;
	}
	public Date getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}
	public Date getMinDate() {
		return minDate;
	}
	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}
}
