package com.roms.componentprocessing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payments")
public class PaymentReturn {
    @Id
    private String requestId;
    public PaymentReturn(String requestId2, long cardNumber2, double processingCharge2) {
		this.requestId=requestId2;
		this.cardNumber =cardNumber2;
		this.processingCharge = processingCharge2;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getProcessingCharge() {
		return processingCharge;
	}
	public void setProcessingCharge(double processingCharge) {
		this.processingCharge = processingCharge;
	}
	private long cardNumber;
    private double processingCharge;
}
