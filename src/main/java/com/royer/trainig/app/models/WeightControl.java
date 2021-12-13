package com.royer.trainig.app.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "weight_control")
public class WeightControl {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "weight")
	private Integer weight;
	
	@Column(name = "date_weight")
	private Date date_weight; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private Users user;

	public WeightControl(Integer id, Integer weight, Date date_weight, Users user) {
		this.id = id;
		this.weight = weight;
		this.date_weight = date_weight;
		this.user = user;
	}

	public WeightControl() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Date getDate_weight() {
		return date_weight;
	}

	public void setDate_weight(Date date_weight) {
		this.date_weight = date_weight;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "WeightControl [id=" + id + ", weight=" + weight + ", date_weight=" + date_weight + ", user=" + user
				+ "]";
	}
	
	
}
