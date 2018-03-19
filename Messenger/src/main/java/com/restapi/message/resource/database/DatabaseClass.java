package com.restapi.message.resource.database;

import java.util.HashMap;
import java.util.Map;

import com.restapi.message.resource.model.Message;
import com.restapi.message.resource.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessage() {
		return messages;
	}
	public static Map<String, Profile> getProfile() {
		return profiles;
	}
	
	
}
