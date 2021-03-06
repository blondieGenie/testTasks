package vacancy.entities;

// Generated 12.04.2013 23:30:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city", schema = "public")
public class City implements java.io.Serializable {

	private int idcity;
	private String name;
	private Set<Vacancy> vacancies = new HashSet<Vacancy>(0);

	public City() {
	}

	public City(int idcity) {
		this.idcity = idcity;
	}

	public City(int idcity, String name, Set<Vacancy> vacancies) {
		this.idcity = idcity;
		this.name = name;
		this.vacancies = vacancies;
	}

	@Id
	@Column(name = "idcity", unique = true, nullable = false)
	public int getIdcity() {
		return this.idcity;
	}

	public void setIdcity(int idcity) {
		this.idcity = idcity;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Vacancy> getVacancies() {
		return this.vacancies;
	}

	public void setVacancies(Set<Vacancy> vacancies) {
		this.vacancies = vacancies;
	}

}
