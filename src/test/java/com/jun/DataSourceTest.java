package com.jun;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Created by JUN on 2017/5/15.
 */
public class DataSourceTest {
    private ApplicationContext ctx;
    @Before
    public void before(){
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @After
    public void after(){
        ctx=null;
    }
    @Test
    public void test(){
        DataSource dataSource=(DataSource)ctx.getBean("dataSource");
        Assert.assertNotNull(dataSource);
    }
}
