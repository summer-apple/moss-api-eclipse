package com.moss.entity;
// Generated 2016-1-21 14:36:22 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Moss generated by hbm2java
 */
@Entity
@Table(name = "moss", catalog = "moss")
public class Moss implements java.io.Serializable {

	private Integer id;
	private String name;
	private String latin;
	private String avatar;
	private String description;

	public Moss() {
	}

	public Moss(String name, String latin, String avatar, String description) {
		this.name = name;
		this.latin = latin;
		this.avatar = avatar;
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

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "latin", length = 100)
	public String getLatin() {
		return this.latin;
	}

	public void setLatin(String latin) {
		this.latin = latin;
	}

	@Column(name = "avatar", length = 100)
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "description", length = 2000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
