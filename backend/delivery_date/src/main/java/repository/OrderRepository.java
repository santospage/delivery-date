package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santospage.delivery_date.models.Branch;

public interface OrderRepository extends JpaRepository<Branch, Long>{

}
