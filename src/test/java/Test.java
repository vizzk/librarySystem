import com.library.pojo.Book;
import com.library.pojo.Student;
import com.library.service.BookService;
import com.library.service.BookServiceImpl;
import com.library.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ：Vizzk
 * @description：TODO
 * @date ：2021/3/25 19:54
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl studentServiceImpl = context.getBean("studentServiceImpl",StudentServiceImpl.class);
        Student student = studentServiceImpl.getStudentByID("123");
        System.out.println(student);
    }
    @org.junit.jupiter.api.Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl studentServiceImpl = context.getBean("studentServiceImpl",StudentServiceImpl.class);
        Student student = new Student("stu2","3","66666","9924","10086",2018,2,"software","male",0);
        System.out.println(student);
        studentServiceImpl.insertStudent(student);
    }
    @org.junit.jupiter.api.Test
    public void getBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl service = context.getBean("bookServiceImpl", BookServiceImpl.class);
        Book book = service.getBookByID("5");
        System.out.println(book);
    }
}
