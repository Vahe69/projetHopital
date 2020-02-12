package dao;

public interface DAO<T,PK>{
	public T findAll();
	public T findById(PK obj);
	public void create(T obj);
	public void update(T obj);
	public void delete(T obj);
}
