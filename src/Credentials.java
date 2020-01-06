
public class Credentials {
	

	protected String loginURL;
	protected String email;
	protected String password;
	
	

	public Credentials() {
		// TODO Auto-generated constructor stub
		
		// Earnest CMS
		this.loginURL = "http://earnestcms.gobeyondtheclouds.com/users/login";
		this.email = "webdevs@digify.com.ph";
		this.password = "P@ssw0rd";
	}
	
	public void setSleep() {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
