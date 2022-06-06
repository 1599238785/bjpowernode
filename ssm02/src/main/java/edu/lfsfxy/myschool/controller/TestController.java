package edu.lfsfxy.myschool.controller;

import edu.lfsfxy.myschool.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
/*1.控制层 负责请求/相应的控制，会调用下面的servic层的具体业务逻辑，最后返回装载填好数据的页面或着数据到前端
2.相当于一个前后台的入口
*3.表示该类为spring控制类
*4.它负责接受用户的输入并调用模型和视图去完成用户的需求。当web页面中超链接和发送html表单时 控制器本身不输出任何东西和
* 做任何处理。它只接受请求并决定调用那个模型构件去处理请求   然后决定用那个视图来显示模型处理返回数据
* 5.就是接受用户的请求并且选择对应的类执行和返回用户需要的数据
* */

@RequestMapping("/say")//说明这个say是下面所有方法的父路径
/*1.这是一个地址的映射 可以使用在类上或者方法上
2.使用在类上表示类中所有请求的方法都是以该地址作为父路径的
3.这个方法才是真正处理请求的处理器
4.使用在方法上表示 这个类得到路径什么这个必须有
*/

public class TestController {

    @RequestMapping("/hello")//使用在类中表示网址就是一个网址
    public String sayHello(){
        System.out.println("hello");//在控制台上输出一个hello
        return "success";//然后跳转到jsp/success.jsp
    }

 //就是输入了一个带有超链接的传参 然后你把那个参数显示在控制台上
@RequestMapping("/param1")
    public String param(String uid){
    System.out.println(uid);
    return "success";
}

    //就是输入了一个带有超链接的多个传参 然后你把那个多个参数显示在控制台上
@RequestMapping("/param2")//指定网址
public  String param2(String uid,String uname,String sex){
    System.out.println(uid);
    System.out.println(uname);
    System.out.println(sex);
    return "success";
}

//注意如果 这里的方法传参和你写的超链接中的参数名不一样虽然可以运行出来但是控制台上不会显示他们得值
 //所以我们如果想要重新定义这个方法中的参数 我们可以使用@RequestParam()这个方法是传递参数得将请求参数绑定到你的请求参数上也就是把这个name这个参数绑定到userName上
@RequestMapping("/param3")
public String param3(String uid,@RequestParam("name")String userName,String sex){
    System.out.println(uid);
    System.out.println(userName);
    System.out.println(sex);
    return "success";
}
@RequestMapping("/param4")
public String param4(String uid,String uname){
    System.out.println(uid);
    System.out.println(uname);
    return "success";
}


//5.创建一个实体类去输出超链接所传入的值
@RequestMapping("/param5")
   public  String param5(Student student) {
    System.out.println(student.getUid());
    System.out.println(student.getUname());
        return "success";
}

}
