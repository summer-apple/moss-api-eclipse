package com.moss.entity;
// Generated 2016-1-21 23:21:14 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WorkImage generated by hbm2java
 */
@Entity
@Table(name = "work_image", catalog = "moss")
public class WorkImage implements java.io.Serializable {

	private Integer id;
	private Integer work;
	private String link;

	public WorkImage() {
	}

	public WorkImage(Integer work, String link) {
		this.work = work;
		this.link = link;
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

	@Column(name = "work")
	public Integer getWork() {
		return this.work;
	}

	public void setWork(Integer work) {
		this.work = work;
	}

	@Column(name = "link", length = 100)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
