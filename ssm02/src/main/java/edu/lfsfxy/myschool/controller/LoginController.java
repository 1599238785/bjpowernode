package edu.lfsfxy.myschool.controller;


import edu.lfsfxy.myschool.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
@RequestMapping("/login")
    public String login(User user, HttpSession session){
    /**HttpSession session
     *(1)HttpSession 他本身是一个接口   HttpSession session 创建一个接口对象然后调用了它里面的方法
     * （2）session保存再服务器端 当应用请求来自应用程序的web页面时 如果该用户还没有会话的话，则web服务器自动创建一个session对象
     * 当用户再应用程序web之间跳转时，存储再session对象中的变量将不会丢失， 而是在整个用户会话中一直存在 直到服务器终止会话
     * （3）主要是调用HttpSession中的这个方法void setAttribute(String var1, Object var2);
     *string name表示变量名，object value 代表变量对应的值
     * 如：setAttribute(“XX”， “123”)，表示把值是123的变量xx传出去
     *setAttribute(“USRER”， user) 表示把user这个对象传送出去
     *（4）当你创建好session对象或者值以后怎模样去调用
     * sessionScope再jsp页面获取sessio对象
     * 使用sessionScope.id就ok
     * ${sessionScope.id}
     */

    if(user.getUid().equals("admin")&& user.getPwd().equals("1234")){
        session.setAttribute("USER",user);//给session赋值然后在每一个网页上都显示
        return "loginok";//转发，采用配置文件的前缀和后缀
    }else{
        //return "forward:/login.jsp";//转发，不采用配置文件的前缀和后缀
        return "redirect:/login.jsp";  //重定向，不采用配置文件的前缀和后缀 这个意思是它会
        //先访问tomacat服务器  然后再次自动的再一次访问login.jsp页面来返回数据意思就是访问二次 会默认的改变上面的网站地址
//比如说 你第一次输错了用户名 那么他又返回 这个错误的用户名 但是用了redirect后 他第二次又会重新的反问一次而这一次用户的值为空 所以
 //最终的结果是在屏幕上用户名为空
    }


}



}
