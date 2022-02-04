package br.com.santospage.delivery_date.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SC5T10")
public class Branch implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long r_e_c_n_o_;
	
	private String code;	
	private String description;
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}	
}
