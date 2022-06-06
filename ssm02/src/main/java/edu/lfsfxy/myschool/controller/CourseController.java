package edu.lfsfxy.myschool.controller;

import edu.lfsfxy.myschool.dao.CourseDao;
import edu.lfsfxy.myschool.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseDao courseDao;
  @RequestMapping("/add")
    public String add(Course course){
        courseDao.add(course);
        return "success";
  }


 @RequestMapping("/findAll")
public  String findAll(Model model){
    List<Course> list = courseDao.findAll();
    model.addAttribute("list",list);
    return "courseList";

}




}
