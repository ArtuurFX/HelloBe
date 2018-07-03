package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="USER")
@SequenceGenerator(name="user", sequenceName="SEQ_USER", allocationSize=1)
public class User {

	@Id
	@GeneratedValue(generator="user", strategy=GenerationType.SEQUENCE)
	@Column(name="id_user", nullable=false)
	private int id;
	
	@Column(length=100, nullable=false)
	private String name;
	
	@Column(nullable=false)
	private int age;

	@Column(nullable=false)
	private double weight;

	@Column(nullable=false)
	private double height;

	@Column(length=50, nullable=false)
	private String username;

	@Column(length=50, nullable=false)
	private String password;

	@Column(nullable=false)
	private int token;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_answer_user")
	private AnswerUser answerUser;
	
	@OneToOne
	@JoinColumn(name="id_biotype", nullable=false)
	private Biotype biotypeId;
	
	
	//bidirecional
	@OneToOne(mappedBy="user")
	private Biotype biotype;
	

	public User() {
		super();
	}

	public User(String name, int age, double weight, double height, String username, String password, int token) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.username = username;
		this.password = password;
		this.token = token;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}
	
}
