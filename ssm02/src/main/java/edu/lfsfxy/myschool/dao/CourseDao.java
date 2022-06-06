package edu.lfsfxy.myschool.dao;

import edu.lfsfxy.myschool.entity.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //dao代码的注解
public interface CourseDao {
@Insert("insert into course(cname,classHour) values(#{cname},#{classHour})")
    int add(Course course);

@Select("select * from course")
List<Course> findAll();

}
