import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class LoginBean
{

	private String username;
	private String password;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String login()
	{
		if (username.equals("sameera") && password.equals("password"))
		{
			return ("success");
		} 
		else
		{
			return ("failure");
		}
	}
	public String home()
	{
		return ("Login");
	}

}