package com.netflix.simianarmy.aws.janitor;

import java.util.Date;

import com.amazonaws.services.ec2.model.Volume;
import com.netflix.simianarmy.client.aws.AWSClient;

public class HetMoet {
	Volume volume;
	String instance;
	String owner;
	Date lastDetachTime;
	AWSClient awsClient;

	public HetMoet(Volume volume, String instance, String owner, Date lastDetachTime, AWSClient awsClient) {
		this.volume = volume;
		this.instance = instance;
		this.owner = owner;
		this.lastDetachTime = lastDetachTime;
		this.awsClient = awsClient;

		// TODO Auto-generated constructor stub
	}

}
