package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="ANSWER_USER")
@SequenceGenerator(name="answerUser", sequenceName="SEQ_ANSWER_USER", allocationSize=1)
public class AnswerUser {

	@Id
	@GeneratedValue(generator="answerUser", strategy=GenerationType.SEQUENCE)
	@Column(name="id_answer_user")
	private int id;
	
	@Column(name="answer_user", length=100, nullable=false)
	private String answerUser;

	public AnswerUser() {
		super();
	}

	public AnswerUser(String answerUser) {
		super();
		this.answerUser = answerUser;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAnswerUser() {
		return answerUser;
	}
	
	public void setAnswerUser(String answerUser) {
		this.answerUser = answerUser;
	}
		
	
}
