package br.com.santospage.deliverydate.branch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santospage.deliverydate.branch.model.BranchModel;
import br.com.santospage.deliverydate.branch.repository.BranchRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/deliverydate")
public class BranchController {
	
	@Autowired
	BranchRepository branchRepository;

	@GetMapping("/branch")	
	public List<BranchModel> listBranches(){
		return branchRepository.findAll();
	}

}
