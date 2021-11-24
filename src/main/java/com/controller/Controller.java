package com.controller;

import com.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author 李天赐
 * 2021/11/24
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("testView.do")
    public String getView(){
        return "redirect:/index.jsp";
    }
    @RequestMapping("insertTu.do")
    public void insertTu( @RequestParam MultipartFile pimage) throws IOException {
        String pimageUrl="D:\\123\\SpringBoot\\src\\main\\webapp\\imges\\"+pimage.getOriginalFilename();
        System.out.println(pimageUrl);
        pimage.transferTo(new File("D:\\123\\SpringBoot\\src\\main\\webapp\\imges\\"+pimage.getOriginalFilename()));
    }
    @RequestMapping("getOneU1/{uid}")
    public String GetSoming(@PathVariable("uid") String uid, HttpServletRequest request){
        User user=new User();
        String regf="[0-9]*";
        if (uid.matches(regf)){
            return "error";
        }else {
            if (uid.length()>5){
                System.out.println(user+"user");
                request.getSession().setAttribute("uid",user);
            }else {
                System.out.println(uid.length()+"uid");
                request.getSession().setAttribute("uid",uid+""+uid.length());
            }
            return "success";
        }
    }
}
