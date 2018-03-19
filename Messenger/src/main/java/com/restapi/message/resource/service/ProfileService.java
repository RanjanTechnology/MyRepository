package com.restapi.message.resource.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.restapi.message.resource.database.DatabaseClass;
import com.restapi.message.resource.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfile();
	
	public ProfileService() {
		profiles.put("Priyaranjan", new Profile(1L, "Priyaranjan", "Priyaranjan", "Singh"));
		profiles.put("Ranjan", new Profile(2L, "Ranjan", "Ranjan", "Singh"));
	}

	public List<Profile> getProfile() {

		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String ProfileName) {
		return profiles.get(ProfileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);

		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getId() <= 0)
			return null;

		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String ProfileName) {
		return profiles.remove(ProfileName);
	}
}
