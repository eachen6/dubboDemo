package consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.api.service.IUserService;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        IUserService iUserService = context.getBean(IUserService.class);
        System.out.println("consumer");
        System.out.println(iUserService.getInfoCount());
    }
}
