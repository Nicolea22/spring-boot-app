package com.leandro.app.model.entities;

import javax.persistence.*;

@Entity
@Table
public class Loan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="total")
	private Integer total;
	
	@Column(name="user_id")
	private Long userId;

	public Loan(){}

	public Loan(Integer total, Long userId) {
		this.total = total;
		this.userId = userId;
	}

	public Loan(Integer total) {
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	
	
}
