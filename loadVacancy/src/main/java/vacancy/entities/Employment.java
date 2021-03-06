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
 * Employment generated by hbm2java
 */
@Entity
@Table(name = "employment", schema = "public")
public class Employment implements java.io.Serializable {

	private int idemployment;
	private String description;
	private Set<Vacancy> vacancies = new HashSet<Vacancy>(0);

	public Employment() {
	}

	public Employment(int idemployment) {
		this.idemployment = idemployment;
	}

	public Employment(int idemployment, String description,
			Set<Vacancy> vacancies) {
		this.idemployment = idemployment;
		this.description = description;
		this.vacancies = vacancies;
	}

	@Id
	@Column(name = "idemployment", unique = true, nullable = false)
	public int getIdemployment() {
		return this.idemployment;
	}

	public void setIdemployment(int idemployment) {
		this.idemployment = idemployment;
	}

	@Column(name = "description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employment")
	public Set<Vacancy> getVacancies() {
		return this.vacancies;
	}

	public void setVacancies(Set<Vacancy> vacancies) {
		this.vacancies = vacancies;
	}

}
