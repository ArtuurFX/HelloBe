package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="ANSWER")
@SequenceGenerator(name="answer", sequenceName="SEQ_ANSWER", allocationSize=1)
public class Answer {

	@Id
	@GeneratedValue(generator = "answer", strategy=GenerationType.SEQUENCE)
	@Column(name="id_answer", nullable=false)
	private int id;
	
	@Column(length=100, nullable=false)
	private String description;

	public Answer() {
		super();
	}

	public Answer(String description) {
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
