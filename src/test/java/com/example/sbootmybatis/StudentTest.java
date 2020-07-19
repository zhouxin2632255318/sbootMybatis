package com.example.sbootmybatis;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class StudentTest extends AbstractJunitTest{

    @Test
    @Rollback
    public void doTest(){
        String a = "123";
        String b = "123";

        Assert.assertSame(a,b);
//        Assert.assertEquals 对比两个值相等
//        Assert.assertNotEquals 对比两个值不相等
//        Assert.assertSame 对比两个对象的引用相等
//        Assert.assertArrayEquals 对比两个数组相等
//        Assert.assertTrue 验证返回是否为真
//        Assert.assertFlase 验证返回是否为假
//        Assert.assertNull 验证null
//        Assert.assertNotNull 验证非null
    }
}
