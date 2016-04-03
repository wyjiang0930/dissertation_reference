package mapper.manager;

import cn.hpu.yuan.ssm.mapper.manager.NewsManagerMapper;
import cn.hpu.yuan.ssm.model.pojo.NewsPo;
import common.MapperContanst;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yuan on 16-4-1.
 * 后台管理 - 新闻管理 - 单元测试
 */
public class NewsManagerTest {


    private ApplicationContext context;
    private NewsManagerMapper newsManagerMapper;

    @Before
    public void setUp(){
        context=new ClassPathXmlApplicationContext(MapperContanst.APPLIACTION_CONTEXT_LOCATION);
        newsManagerMapper= (NewsManagerMapper) context.getBean("newsManagerMapper");
    }


    /**
     * 通过id , 查询新闻（不包含内容）
     */
    @Test
    public void findNewsById(){
        NewsPo newsById = newsManagerMapper.findNewsById(2);
        System.out.printf("新闻测试结果  ： "+newsById.toString());
    }





}
