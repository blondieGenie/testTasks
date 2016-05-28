package news.entities;

// Generated 05.04.2013 9:43:17 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * News generated by hbm2java
 */
@Entity
@Table(name = "news", schema = "public")
public class News implements java.io.Serializable {

	private int idNews;
	private Date dat;
	private Rubric rubric;
	private String body;
	private String header;

	public News() {
	}

	public News(int idNews) {
		this.idNews = idNews;
	}

	public News(int idNews, Date dat, Rubric rubric, String body, String header) {
		this.idNews = idNews;
		this.dat = dat;
		this.rubric = rubric;
		this.body = body;
		this.header = header;
	}

	@Id
	@Column(name = "id_news", unique = true, nullable = false)
	public int getIdNews() {
		return this.idNews;
	}

	public void setIdNews(int idNews) {
		this.idNews = idNews;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dat", length = 13)
	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_rubric")
	public Rubric getRubric() {
		return this.rubric;
	}

	public void setRubric(Rubric rubric) {
		this.rubric = rubric;
	}

	@Column(name = "body")
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Column(name = "header")
	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

}
