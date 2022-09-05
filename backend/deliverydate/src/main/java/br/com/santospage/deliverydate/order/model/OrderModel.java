package br.com.santospage.deliverydate.order.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="SC5T10")
public class OrderModel {

	//Properties
	
	@Id
	private long r_e_c_n_o_;
	
	@NonNull
	private String c5_num;
	
	@NonNull
	private String c5_filial;
	
	@NonNull
	private String d_e_l_e_t_;	
	
	//Methods
	
	public long getId() {
		return this.r_e_c_n_o_;
	}
		
	public String getCode() {
		return this.c5_num.trim();
	}
		
	public String getBranch() {
		return this.c5_filial.trim();
	}
	
	public String getDelete() {
		return this.d_e_l_e_t_;
	}
		
}
