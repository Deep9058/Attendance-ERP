package beans;

public class Faculty {
	private int fid;
	private String name;
	private String email;
	private String password;
	private String branch;
	
	public Faculty()
	{
		
	}
	
	
	public Faculty(int fid, String name, String email, String password, String branch) {
		super();
		this.fid = fid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.branch = branch;
	}


	public int getfid() {
		return fid;
	}
	public void setfid(int fid) {
		this.fid = fid;
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
