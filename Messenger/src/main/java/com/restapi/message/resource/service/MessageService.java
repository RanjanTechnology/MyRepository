package com.restapi.message.resource.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.restapi.message.resource.database.DatabaseClass;
import com.restapi.message.resource.exception.DataNotFoundException;
import com.restapi.message.resource.model.Message;


public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessage();
	
	public MessageService() {
		
		Message m1 = new Message(101, "Hi Ranjan", "Priyaranjan");
		Message m2 = new Message(102, "welcome to restful services", "Priyaranjan");
		messages.put(1L, m1);
		messages.put(2L, m2);
	}

	public List<Message> getMessage(){
		
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessageForYear(int year){
		
		List<Message> messageForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		
		for(Message message : messages.values()){
			cal.setTime(message.getCreated());
			if(cal.get(Calendar.YEAR) == year){
				messageForYear.add(message);
			}
		}
		return messageForYear;
	}
	
    public List<Message> getAllMessagePeginated(int start, int size){
    	
    	ArrayList<Message> list = new ArrayList<Message>(messages.values());
		
    	if(start + size > list.size())
    		return new ArrayList<Message>();
    	
		return list.subList(start, start + size);
	}
	
	public Message getMessage(long id){
		Message message = messages.get(id);
		if(message == null){
			throw new DataNotFoundException("Message with ID "+id+" not found");
		}
		return message;
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		
		return message;
	}
	public Message updateMessage(Message message){
		if(message.getId() <= 0)
			return null;
		
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
