package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="BIOTYPE")
@SequenceGenerator(name="biotype", sequenceName="SEQ_BIOTYPE", allocationSize=1)
public class Biotype {

	@Id
	@GeneratedValue(generator="biotype", strategy=GenerationType.SEQUENCE)
	@Column(name="id_biotype", nullable=false)
	private int id;
	
	@Column(nullable=false)
	private String description;
	
	
	public Biotype() {
		super();
	}
	
	public Biotype(String description) {
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
