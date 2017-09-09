package Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.Message;
import Model.MessageHolder;

@Controller
public class MessageController {
	
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Message conversate(MessageHolder msgH)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msgH);
		return new Message("Hello"+msgH.getMessage()+"!");
	}
	
	@RequestMapping("/home")
	public String getView()
	{
		return "index";
	}

}
