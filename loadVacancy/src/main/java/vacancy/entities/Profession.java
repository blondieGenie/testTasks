package vacancy.entities;

// Generated 12.04.2013 23:30:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Profession generated by hbm2java
 */
@Entity
@Table(name = "profession", schema = "public")
public class Profession implements java.io.Serializable {

	private String idprofession;
	private Sphere sphere;
	private String name;
	private Set<Vacancy> vacancies = new HashSet<Vacancy>(0);

	public Profession() {
	}

	public Profession(String idprofession, Sphere sphere) {
		this.idprofession = idprofession;
		this.sphere = sphere;
	}

	public Profession(String idprofession, Sphere sphere, String name,
			Set<Vacancy> vacancies) {
		this.idprofession = idprofession;
		this.sphere = sphere;
		this.name = name;
		this.vacancies = vacancies;
	}

	@Id
	@Column(name = "idprofession", unique = true, nullable = false, length = 8)
	public String getIdprofession() {
		return this.idprofession;
	}

	public void setIdprofession(String idprofession) {
		this.idprofession = idprofession;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idsphere", nullable = false)
	public Sphere getSphere() {
		return this.sphere;
	}

	public void setSphere(Sphere sphere) {
		this.sphere = sphere;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "vac_prof", schema = "public", joinColumns = { @JoinColumn(name = "idprofession", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "idvacancy", nullable = false, updatable = false) })
	public Set<Vacancy> getVacancies() {
		return this.vacancies;
	}

	public void setVacancies(Set<Vacancy> vacancies) {
		this.vacancies = vacancies;
	}

}
