package gm.gmontinny.stock.repository;

import org.springframework.data.repository.CrudRepository;
import gm.gmontinny.stock.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
