package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="MEDICAMENT")
@SequenceGenerator(name="medicament", sequenceName="SEQ_MEDICAMENT", allocationSize=1)
public class Medicament {

	@Id
	@GeneratedValue(generator="medicament", strategy=GenerationType.SEQUENCE)
	@Column(name="id_medicament", nullable=false)
	private int id;
	
	@Column(length=100, nullable=false)
	private String description;
	
	public Medicament() {
		super();
	}
	
	public Medicament(String description) {
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
