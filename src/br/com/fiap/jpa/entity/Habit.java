package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="HABIT")
@SequenceGenerator(name="habit", sequenceName="SEQ_HABIT", allocationSize=1)
public class Habit {
	
	@Id
	@Column(name="id_user", nullable=false)
	@GeneratedValue(generator="habit", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(length=100 ,nullable=false)
	private String description;

	public Habit() {
		super();
	}

	public Habit(String description) {
		super();
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
