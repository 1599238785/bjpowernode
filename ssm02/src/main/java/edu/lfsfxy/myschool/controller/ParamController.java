package edu.lfsfxy.myschool.controller;


import edu.lfsfxy.myschool.entity.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
/*这个练习主要是将c --->v 我的理解是就是 后台向前台传输的数据然显现出来
c传v的主要数据类型有3种
1.比如说是数据库添加增删 返回的行数 也就是int型数据 基本数据l类型

2.也有比如说查询一个学生的信息 返回一个对象
3，比如说查询一个数据库中的信息  可能返回的就是一个集合

 */


/*model是一个接口 他的父类是ModelMap modelMap又继承了LinkedHashMap  springh框架自动创建实例并且作为controller的入参
用户无需自己创建
用法
1。spring自动创建Modeal实例 并且作为controller的入参
*
*
*
*
*
* */


@Controller
@RequestMapping("/param")
public class ParamController {
 @RequestMapping("/base")
public String param1(Model model){
int i=10;
model.addAttribute("i",i);//是将要添加的属性添加到requestScope中，就是添加到请求域中
//往前台传数据 可以传对象，集合 通过${} K可以获取 (第一个是参数的名称你自己定义，上面的参数)

String str="hello";
model.addAttribute("st",str);

     Course course=new Course();
     course.setCno(1003);
     course.setCname("cdss");
     course.setClassHour(205);
     model.addAttribute("c",course);

     Course course2=new Course();
     course2.setCno(1005);
     course2.setCname("ghy");
     course2.setClassHour(258);
     List<Course> list=new ArrayList<>();
     list.add(course);
     list.add(course2);
    model.addAttribute("list",list);



return  "param";



 }

 @RequestMapping("/ifTest")
public String ifTest(Model model){
     Course cour=new Course();
     cour.setCno(1002);
     cour.setCname("clss");
     cour.setClassHour(50);
     model.addAttribute("c",cour);

     return "ifTest";



}

}
