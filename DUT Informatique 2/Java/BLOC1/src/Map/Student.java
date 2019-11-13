package Map;

public class Student
{
	/**
	 * Prénom de l'étudiant
	 */
	private String firstname;
	/**
	 * Nom de l'étudiant
	 */
	private String lastname;
	/**
	 * groupe auquel appartient l'étudiant
	 */
	private String group;

	/**
	 * Constructeur d'un étudiant avec les paramètre suivant :
	 * @param firstname son prénom
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
