package com.treats.euc.model;

import java.util.UUID;

public class EucFlow {

	private UUID id;
	private String description;
	private UUID documentTemplateID;
	private String sql;  // select tadlno from mpesptp
	private String output; //Email or local hdd
	private EucSchedule eucSchedule;
	
	
	
}
