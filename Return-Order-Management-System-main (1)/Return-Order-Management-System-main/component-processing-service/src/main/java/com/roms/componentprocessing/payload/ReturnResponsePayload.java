package com.roms.componentprocessing.payload;

import lombok.Data;

import java.util.Date;

@Data
public class ReturnResponsePayload {
    private String requestId;
    private double processingCharge;
    private double packageAndDeliveryCharge;
    public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public double getProcessingCharge() {
		return processingCharge;
	}
	public void setProcessingCharge(double processingCharge) {
		this.processingCharge = processingCharge;
	}
	public double getPackageAndDeliveryCharge() {
		return packageAndDeliveryCharge;
	}
	public void setPackageAndDeliveryCharge(double packageAndDeliveryCharge) {
		this.packageAndDeliveryCharge = packageAndDeliveryCharge;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	private Date dateOfDelivery;
}
