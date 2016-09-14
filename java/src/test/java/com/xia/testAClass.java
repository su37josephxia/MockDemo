package com.xia;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;


public class testAClass {

    IB iB;
    AClass aClass;
    BClass bClass;

    @Test
    public void testdoMethod01() {
        //•使用 EasyMock 生成 Mock 对象；
        iB = EasyMock.createMock(IB.class);

        //设定 Mock 对象的预期行为和输出
        EasyMock.expect(iB.doMethod()).andReturn("I am Mock").times(1);

        //将 Mock 对象切换到 Replay 状态
        EasyMock.replay(iB);

        //调用 Mock 对象方法进行单元测试
        aClass = new AClass();
        aClass.setB(iB);
        String getStr = aClass.doMethod();



        //对 Mock 对象的行为进行验证
        Assert.assertEquals(getStr, "I am Mock");
        EasyMock.verify(iB);

    }


    @Test
    public void testdoMethod02() {
        //•使用 EasyMock 生成 Mock 对象；
        bClass = EasyMock.createMock(BClass.class);
        //设定 Mock 对象的预期行为和输出
        EasyMock.expect(bClass.doMethod()).andReturn("I am Mock").times(1);


        //将 Mock 对象切换到 Replay 状态
        EasyMock.replay(bClass);

        //调用 Mock 对象方法进行单元测试
        aClass = new AClass();
        aClass.setB(bClass);
        String getStr = aClass.doMethod();

        //对 Mock 对象的行为进行验证
        Assert.assertEquals(getStr, "I am Mock");
        EasyMock.verify(bClass);

    }

}