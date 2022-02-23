package in.bushansirgur.springbootrestapi.entity;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long guestId;

	private Long amount;
	private String paymentTowards;

	private String paymentMethod;

	private String transactionId;
	 @JsonFormat(pattern="yyyy-MM-dd")
     private Date transactiondate;

	private String paymentId;

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getPaymentTowards() {
		return paymentTowards;
	}

	public void setPaymentTowards(String paymentTowards) {
		this.paymentTowards = paymentTowards;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	
	 

	public void setTransactionDate(Date transactionDate) {
		this.transactiondate = transactionDate;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

}
