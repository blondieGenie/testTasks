package news.dao;

import java.util.Date;
import java.util.List;

import news.entities.News;
import news.entities.Rubric;

public interface NewsDao {

    public void addNews(News news);

    public News getNews(Integer idNews);

    public List<News> listNews();

    public List<News> findNews(String text);

    public List<News> findNews(Integer id_rubric);

    public List<News> findNews(Date dat);

    public List<News> findNews(Integer id_rubric, Date dat);

    public void addRubric(Rubric rubric);

    public List<Rubric> listRubric();

}
