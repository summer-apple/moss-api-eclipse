package com.moss.entity;
// Generated 2016-1-21 23:21:14 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Work generated by hbm2java
 */
@Entity
@Table(name = "work", catalog = "moss")
public class Work implements java.io.Serializable {

	private Integer id;
	private String title;
	private String avatar;
	private Integer moss;
	private Integer author;
	private String description;

	public Work() {
	}

	public Work(String title, String avatar, Integer moss, Integer author, String description) {
		this.title = title;
		this.avatar = avatar;
		this.moss = moss;
		this.author = author;
		this.description = description;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "title", length = 45)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "avatar", length = 100)
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "moss")
	public Integer getMoss() {
		return this.moss;
	}

	public void setMoss(Integer moss) {
		this.moss = moss;
	}

	@Column(name = "author")
	public Integer getAuthor() {
		return this.author;
	}

	public void setAuthor(Integer author) {
		this.author = author;
	}

	@Column(name = "description", length = 300)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
