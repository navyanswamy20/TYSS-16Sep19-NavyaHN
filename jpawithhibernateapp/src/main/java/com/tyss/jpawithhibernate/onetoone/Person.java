package com.tyss.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity // source entity
@Table(name = "person")
public class Person {
	@Id
	@Column
	private int pid;
	@Column
	private String name;

	@OneToOne(cascade = CascadeType.ALL) //one to one mapping
	@JoinColumn(name = "vid")	//primary key attribute
	private VoterCard voterCard;
}
