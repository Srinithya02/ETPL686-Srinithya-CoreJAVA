package layer_wise_architecture_JDBC_service;

import layer_wise_architecture_JDBC_dao.BookDAO;
import layer_wise_architecture_JDBC_bean.BookBean;


public class BookService {
    //100      corejava    250
public int addBookService(int bookId,String title,float price){
	String grade="";

	if(price<=300){
		grade = "C";
	}
	else if(price<=600){
		grade = "B";
	}
	else{
		grade = "A";
	}
//    //100      corejava    250 C 
	BookDAO bookDAO = new BookDAO();
	BookBean bookBean=new BookBean();
	bookBean.setBookId(bookId);
	bookBean.setTitle(title);
	bookBean.setPrice(price);
	bookBean.setGrade(grade);

	int updateResult= bookDAO.addBook(bookBean);

	return updateResult;
	} 
}