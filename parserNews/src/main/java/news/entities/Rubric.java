package news.entities;

// Generated 05.04.2013 9:43:17 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rubric generated by hbm2java
 */
@Entity
@Table(name = "rubric", schema = "public")
public class Rubric implements java.io.Serializable {

	private int idRubric;
	private String name;
	private Set<News> newses = new HashSet<News>(0);

	public Rubric() {
	}

	public Rubric(int idRubric) {
		this.idRubric = idRubric;
	}

	public Rubric(int idRubric, String name, Set<News> newses) {
		this.idRubric = idRubric;
		this.name = name;
		this.newses = newses;
	}

	@Id
	@Column(name = "id_rubric", unique = true, nullable = false)
	public int getIdRubric() {
		return this.idRubric;
	}

	public void setIdRubric(int idRubric) {
		this.idRubric = idRubric;
	}

	@Column(name = "name", length = 150)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rubric")
	public Set<News> getNewses() {
		return this.newses;
	}

	public void setNewses(Set<News> newses) {
		this.newses = newses;
	}

}
