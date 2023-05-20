package com.propertyeditors.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class FacebookAccount {
	private File profilePicture;
	private URL fbLink;
	private String[] followers;
	private Date dob;

	public void setProfilePicture(File profilePicture) {
		this.profilePicture = profilePicture;
	}

	public void setFbLink(URL fbLink) {
		this.fbLink = fbLink;
	}

	public void setFollowers(String[] followers) {
		this.followers = followers;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "FacebookAccount [profilePicture=" + profilePicture + ", fbLink=" + fbLink + ", followers="
				+ Arrays.toString(followers) + ", dob=" + dob + "]";
	}

}
