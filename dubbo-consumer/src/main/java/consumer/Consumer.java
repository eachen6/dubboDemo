package consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.api.service.IUserService;
import com.api.service.InfoService;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        InfoService infoService = context.getBean(InfoService.class);
        System.out.println("consumer");
        
        while (true) {
			try {
				System.out.println(infoService.getMyInfo(1).toString());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//        IUserService iUserService = context.getBean(IUserService.class);
//        System.out.println(iUserService.getInfoCount());
    }
}
