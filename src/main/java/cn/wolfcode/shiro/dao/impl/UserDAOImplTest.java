package cn.wolfcode.shiro.dao.impl;

import cn.wolfcode.shiro.dao.IUserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author 16033
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:mvc.xml")
public class UserDAOImplTest {

    @Autowired
    private IUserDAO userDAO;

    @Test
    public void getUserByUsername() {
        System.out.println(userDAO.getUserByUsername("zhangsan"));
    }
}