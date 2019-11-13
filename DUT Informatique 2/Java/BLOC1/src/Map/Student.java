package Map;

public class Student
{
	/**
	 * Pr�nom de l'�tudiant
	 */
	private String firstname;
	/**
	 * Nom de l'�tudiant
	 */
	private String lastname;
	/**
	 * groupe auquel appartient l'�tudiant
	 */
	private String group;

	/**
	 * Constructeur d'un �tudiant avec les param�tre suivant :
	 * @param firstname son pr�nom
	 * @param lastname son nom
	 * @param group le groupe auquel il appartient
	 */
	public Student(String firstname, String lastname, String group)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.group = group;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getGroup()
	{
		return group;
	}

	public void setGroup(String group)
	{
		this.group = group;
	}

	@Override
	public String toString()
	{
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", group=" + group + "]";
	}
}
