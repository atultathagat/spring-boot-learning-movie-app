package com.springbootpoc.movieapp.movieapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SearchHistory {
	@Id
	@GeneratedValue
	private int id;
	private String searchTerm;
	private String searchedBy;
	private String searchType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSearchTerm() {
		return searchTerm;
	}
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}
	public String getSearchedBy() {
		return searchedBy;
	}
	public void setSearchedBy(String searchedBy) {
		this.searchedBy = searchedBy;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	
}