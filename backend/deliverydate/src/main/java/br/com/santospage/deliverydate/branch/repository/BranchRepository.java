package br.com.santospage.deliverydate.branch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santospage.deliverydate.branch.model.BranchModel;

public interface BranchRepository extends JpaRepository<BranchModel, String> {
	List<BranchModel> findAll();
}
