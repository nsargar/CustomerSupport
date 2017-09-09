package Model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MessageHolder {
	
	
	private String messageSender;
	private String messageReceiver;
	private String message;
	private Timestamp sentTime;

	public MessageHolder(){}
	
	public MessageHolder(String messageSender, String messageReceiver, String message, Timestamp sentTime) {
		// TODO Auto-generated constructor stub
		this.messageSender=messageSender;
		this.messageReceiver=messageReceiver;
		this.message=message;
		this.sentTime=sentTime;
	}
}
