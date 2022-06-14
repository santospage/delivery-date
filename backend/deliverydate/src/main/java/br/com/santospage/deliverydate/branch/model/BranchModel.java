package br.com.santospage.deliverydate.branch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name="SYS_COMPANY")
public class BranchModel {
	
	//Properties
	
	@Id
	private long r_e_c_n_o_;
	
	@NonNull
	private String m0_codfil;
	
	@NonNull
	private String m0_filial;
	
	
	//Methods
	
	public long getId() {
		return this.r_e_c_n_o_;
	}
		
	public String getCode() {
		return this.m0_codfil.trim();
	}
		
	public String getDescription() {
		return this.m0_filial.trim();
	}	
}
