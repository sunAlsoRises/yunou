package com.cloudeurope.agreement.Controller;

import com.cloudeurope.agreement.Models.User;
import com.cloudeurope.agreement.Dao.UserDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.Id;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.List;

@RestController
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/c")
    public void abc(){
        Class c=User.class;
        Field[] fields = c.getDeclaredFields();
        for (int x=0;x<fields.length;x++){
            Field field=fields[x];

            String zhiduanming = field.getName();
            String zhiduanLeixing = field.getType().getName();


            String aa="";
            int count = field.getAnnotations().length;
            if(count>0){
                int isId=field.getAnnotationsByType(Id.class).length;
                if(isId>0){
                    //主键
                    Annotation annotation = field.getAnnotation(Id.class);
                    int length = ((Column) annotation).length();
                }else{
                    //其他字段
                    Annotation annotation = field.getAnnotation(Column.class);
                    int length = ((Column) annotation).length();
                }


                aa="";


            }

            aa="";
        }



    }



    @RequestMapping(value = "/test")
    public void test1() throws Exception {
        final User user1 = new User("u1", 10);
        final User user2 = new User("u1", 20);
        final User user3 = new User("u3", 30);
        userDao.insertSelective(user1);
        log.info("[user1回写主键] - [{}]", user1.getId());
        userDao.insertSelective(user2);
        log.info("[user2回写主键] - [{}]", user2.getId());
        userDao.insertSelective(user3);
        log.info("[user3回写主键] - [{}]", user3.getId());
        final int count = userDao.countByUsername("u1");
        log.info("[调用自己写的SQL] - [{}]", count);

        // TODO 模拟分页
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        userDao.insertSelective(new User("u1", 22));
        // TODO 分页 + 排序 this.userMapper.selectAll() 这一句就是我们需要写的查询，有了这两款插件无缝切换各种数据库
        final PageInfo<Object> pageInfo = PageHelper.startPage(1, 10).setOrderBy("Id desc").doSelectPageInfo(() -> this.userDao.selectAll());
        log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());

        PageHelper.startPage(1, 10).setOrderBy("id desc");
        final PageInfo<User> userPageInfo = new PageInfo<>(this.userDao.selectAll());
        log.info("[普通写法] - [{}]", userPageInfo);
    }
}
