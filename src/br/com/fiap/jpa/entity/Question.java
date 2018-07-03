package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="QUESTION")
@SequenceGenerator(name="question", sequenceName="SEQ_QUESTION", allocationSize=1)
public class Question {

	@Id
	@Column(name="id_question", nullable=false)
	@GeneratedValue(generator="question", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(length=200, nullable=false)
	private String description;

	public Question() {
		super();
	}

	public Question(String description) {
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
