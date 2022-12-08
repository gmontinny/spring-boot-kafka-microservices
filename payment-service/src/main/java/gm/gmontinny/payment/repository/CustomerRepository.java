package gm.gmontinny.payment.repository;

import gm.gmontinny.payment.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
