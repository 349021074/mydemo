package gl.dao;

import gl.pojo.Book;

public interface IBookDAO {
	public Book findBookByBookid(Integer bookid);
	
	public Book find();
}
