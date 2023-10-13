package in.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahul.entity.StockPrice;

public interface StockRepository extends JpaRepository<StockPrice, Integer> {
	public StockPrice findByCompanyName(String companyName);
}
