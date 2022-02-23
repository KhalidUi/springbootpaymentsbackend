package in.bushansirgur.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springbootrestapi.entity.Payments;

@Repository
public interface PaymentRepository extends JpaRepository<Payments, Long>{

}
