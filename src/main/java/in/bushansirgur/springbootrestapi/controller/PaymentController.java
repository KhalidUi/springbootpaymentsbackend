package in.bushansirgur.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springbootrestapi.entity.Payments;
import in.bushansirgur.springbootrestapi.repository.PaymentRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class PaymentController {
	
	@Autowired
	private PaymentRepository eRepo;
	
	@GetMapping("/payments")
	public List<Payments> getAllPayments() {
		return eRepo.findAll();
	}
	
	@GetMapping("/payments/{id}")
	public Payments getPaymentById(@PathVariable Long id) {
		return eRepo.findById(id).get();
	}
	
	@PostMapping("/payments")
	public Payments savePaymentDetails(@RequestBody Payments payment) {
		return eRepo.save(payment);
	}
	
	@PutMapping("payments")
	public Payments updatePayment(@RequestBody Payments payment) {
		return eRepo.save(payment);
	}
	
	@DeleteMapping("/payments/{id}")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
		eRepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
