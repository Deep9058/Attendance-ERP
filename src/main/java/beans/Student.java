package beans;

public class Student {
	private int sid;
	private String name;
	private String email;
	private String password;
	private String branch;
	
	public Student() 
	{
	
	}
	

	public Student(int sid, String name, String email, String password, String branch) {
		
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.branch = branch;
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
