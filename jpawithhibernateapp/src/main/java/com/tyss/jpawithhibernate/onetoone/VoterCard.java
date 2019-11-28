package com.tyss.jpawithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity	//target entity
@Table(name="VoterCard")
public class VoterCard {
	@Id
	@Column
private int vid;
	@Column
private String vname;
	@Exclude //exclude the toDtring() of person class
	@OneToOne(mappedBy="voterCard")
	private  Person person;

}
