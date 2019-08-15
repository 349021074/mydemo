package gl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gl.dao.IBookDAO;
import gl.pojo.Book;
import gl.service.IBookService;
@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookDAO bookdao;
	
	public Book findBookByBookid(Integer bookid) {
		return bookdao.findBookByBookid(bookid);
	}

}
