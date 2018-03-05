package application.model;

public class Ankieta {
	
	private int id;
	private String name;
	private String lastName;
	private String mail;
	private String phone;
	private boolean java;
	private boolean python;
	private String other;
	private String language;
	private String course;
	public Ankieta(String name, String lastName, String mail, String phone, Boolean java, Boolean python, String other,
			String language, String course) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.phone = phone;
		this.java = java;
		this.python = python;
		this.other = other;
		this.language = language;
		this.course = course;
	}
	public Ankieta(int id, String name, String lastName, String mail, String phone, Boolean java, Boolean python,
			String other, String language, String course) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.phone = phone;
		this.java = java;
		this.python = python;
		this.other = other;
		this.language = language;
		this.course = course;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isJava() {
		return java;
	}
	public void setJava(boolean java) {
		this.java = java;
	}
	public boolean isPython() {
		return python;
	}
	public void setPython(boolean python) {
		this.python = python;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
