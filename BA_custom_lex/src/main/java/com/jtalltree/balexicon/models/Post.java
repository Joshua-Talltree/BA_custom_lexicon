package com.jtalltree.balexicon.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "strongs_number", length = 225, nullable = false)
	private String strongsNumber;
	
	@Column(name = "strongs_title", length = 3000, nullable = false)
	private String strongsTitle;
	
	public Post() {
		
	}

	public Post(String strongsNumber, String strongsTitle) {
	
		this.strongsNumber = strongsNumber;
		this.strongsTitle = strongsTitle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStrongsNumber() {
		return strongsNumber;
	}

	public void setStrongsNumber(String strongsNumber) {
		this.strongsNumber = strongsNumber;
	}

	public String getStrongsTitle() {
		return strongsTitle;
	}

	public void setStrongsTitle(String strongsTitle) {
		this.strongsTitle = strongsTitle;
	}
	
	
}
