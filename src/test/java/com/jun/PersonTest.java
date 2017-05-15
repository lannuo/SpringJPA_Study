package com.jun;

import com.jun.jpa.entities.Person;
import com.jun.jpa.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JUN on 2017/5/15.
 */
public class PersonTest {
    private ApplicationContext ctx;
    private PersonService service;
    {
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        service=ctx.getBean(PersonService.class);
    }
    @Test
    public void testSave(){
        Person person=new Person();
        person.setName("王武");
        person.setAge(18);
        service.save(person);
        System.out.println(service.getClass().getName());
    }

}
