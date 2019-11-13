package Map;

import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("FAVERO", "William", "g23"));
		list.add(new Student("FONTARIVE", "Axel", "g24"));
		list.add(new Student("GARCIA", "Florian", "g22"));
		list.add(new Student("GARCIA", "Justin", "g23"));
		list.add(new Student("GAUVIN", "Yolann", "g23"));
		list.add(new Student("GEINDRE", "Léo", "g23"));
		list.add(new Student("GIRIE", "Quentin", "g24"));
		list.add(new Student("GITTON", "Antoine", "g21"));
		list.add(new Student("GOSSET", "Cloé", "g23"));
		list.add(new Student("GRANDADAM", "Clarisse", "g23"));
		list.add(new Student("GREFFET", "William", "g23"));
		list.add(new Student("GRIFFON", "Anton", "g23"));
		list.add(new Student("GROCHOWSKI", "Ianis", "g21"));
		list.add(new Student("GRUAZ", "Johan", "g23"));
		list.add(new Student("GUEDES", "Adrien", "g21"));
		list.add(new Student("GUYOT", "Mallory", "g23"));
		list.add(new Student("HEITZMANN", "Antoine", "g23"));
		list.add(new Student("HOU", "RONAN", "g24"));
		list.add(new Student("HOUDARD", "Guillaume", "g22"));
		list.add(new Student("HUMBERT", "Corentin", "g24"));
		list.add(new Student("JACQUES", "Guillaume", "g24"));
		list.add(new Student("JAMAR", "Erwan", "g21"));
		list.add(new Student("KATZ", "Mathieu", "g23"));
		list.add(new Student("KHAIT", "Soufiane", "g24"));
		list.add(new Student("KHIRREDINE", "Nassim", "g22"));
		list.add(new Student("LAHBIB", "Bilel", "g24"));
		list.add(new Student("LANGLOIS", "Antoine", "g21"));
		list.add(new Student("LAPLACE D'OLONDE", "Quentin", "g21"));
		list.add(new Student("LEBLANC", "Vianney", "g23"));
		list.add(new Student("LECOMTE", "Jolan", "g21"));
		list.add(new Student("LEVEAU", "Lucas", "g24"));
		list.add(new Student("LIGONY", "Alex", "g24"));
		list.add(new Student("LUNEAU", "Josselin", "g22"));
		list.add(new Student("LUQUE", "Nicolas", "g21"));
		list.add(new Student("MA", "Steven", "g21"));
		list.add(new Student("MARTIN", "William", "g24"));
		list.add(new Student("MASSON", "Enzo", "g21"));
		list.add(new Student("MATHEZ", "Florent", "g22"));
		list.add(new Student("MERCIER", "Jaber", "g22"));
		list.add(new Student("MORAND", "Benjamin", "g24"));
		list.add(new Student("MOREL", "Paul", "g22"));
		list.add(new Student("MOSSET", "Killian", "g21"));
		list.add(new Student("MOUILLAC", "Amélie", "g22"));
		list.add(new Student("MOUSSAOUI", "Redouane", "g21"));
		list.add(new Student("ORSET", "Kévin", "g21"));
		list.add(new Student("OULED MOUSSA", "Yanis", "g22"));
		list.add(new Student("OZER", "Bilal", "g22"));
		list.add(new Student("PAILLER", "Axel", "g24"));
		list.add(new Student("PARRIER", "Geoffrey", "g22"));
		list.add(new Student("PLACIDOUX", "Tobias", "g24"));
		list.add(new Student("POULIQUEN", "Glen", "g21"));
		list.add(new Student("PUJOL", "Elliot", "g24"));
		list.add(new Student("RAFFORT", "Adrien", "g22"));
		list.add(new Student("RICHARD", "FranÃ§ois", "g22"));
		list.add(new Student("RINGEARD", "Timothée", "g24"));
		list.add(new Student("RIPAHETTE", "Noe", "g23"));
		list.add(new Student("ROCHEDY", "Pierre", "g24"));
		list.add(new Student("ROULEAU", "Yoan", "g22"));
		list.add(new Student("SAGEAT", "Corentin", "g21"));
		list.add(new Student("SALERO-GIANDINA", "Sébastien", "g21"));
		list.add(new Student("SEGARD", "Timothee", "g21"));
		list.add(new Student("SKOWRON", "Martin", "g23"));
		list.add(new Student("SZEMRO", "Aymeric", "g24"));
		list.add(new Student("TAPIE", "Valentin", "g21"));
		list.add(new Student("THIVANT", "Manon", "g22"));
		list.add(new Student("TIMSIT", "Mounir", "g24"));
		list.add(new Student("TRIKI", "Arthur", "g23"));
		list.add(new Student("VANDEVELDE", "Yoan", "g23"));
		list.add(new Student("VEBER", "Vincent", "g23"));
		list.add(new Student("VENUTI", "Antonin", "g22"));
		list.add(new Student("VICENTE LOPES", "Francisco", "g24"));
		list.add(new Student("VUAILLAT", "Benjamin", "g22"));
		list.add(new Student("WETS", "Alexandre", "g21"));

		Map<String, List<Student>> groups = new HashMap<String, List<Student>>();

		groups.put("g21", new ArrayList<Student>());
		groups.put("g22", new ArrayList<Student>());
		groups.put("g23", new ArrayList<Student>());
		groups.put("g24", new ArrayList<Student>());

		for(Student s : list)
		{
			groups.get(s.getGroup()).add(s);
		}

		System.out.println(groups.get("g21"));
		System.out.println(groups.get("g22"));
		System.out.println(groups.get("g23"));
		System.out.println(groups.get("g24"));
	}
}
