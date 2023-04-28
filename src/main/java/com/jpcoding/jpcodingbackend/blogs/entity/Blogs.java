package com.jpcoding.jpcodingbackend.blogs.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blogs")
public class Blogs {
	// Blog Entity

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateCreated;
	private Date dateModified;
	private String title;
	private String description;
	private String article;

	public Blogs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Blogs(Long id, Date dateCreated, Date dateModified, String title, String description, String article) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.title = title;
		this.description = description;
		this.article = article;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "Blogs [id=" + id + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", title="
				+ title + ", description=" + description + ", article=" + article + "]";
	}

}
