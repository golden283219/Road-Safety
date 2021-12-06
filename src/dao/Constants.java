package dao;

/**
 * Class to keep constants used through out the application
 * 
 * @author
 *
 */
public class Constants {

	// Class level constants - change database parameters
	public static final String dbUrl = "jdbc:mysql://localhost:3306/accident";
	public static final String dbUser = "root";
	public static final String dbPassword = "12345678";
	//////////////////////////////////////////////////////
	

	
	// Text box dashboard screen - place the text below in double quotes
	public static final String DASHBOARD_TEXT_BOX1 = "Firstly, in the top right-hand side, it is named Vehicle and it shows collectively the accidents that happened in 2009 through to 2016. Analysing the vehicles involved they’re listed as Car, Bus, Motorcycle, cycle and other. Collectively they come out as large numbers and put them into percentages. Car accidents are the highest taking up nearly 3 / 4 of accidents. "
	+ "Beside that, the next pie chart involves casualty through 2009 and 2016. Specifically, the participants involved in an accident. We have Adult, middle-aged, senior, child, teenager and young adult. Again, those number have been converted to percentages, rather than a whole round figure, and those numbers are compared to other participants.";
	//public static final String DASHBOARD_TEXT_BOX3 = "Beside that, the next pie chart involves casualty through 2009 and 2016. Specifically, the participants involved in an accident. We have Adult, middle-aged, senior, child, teenager and young adult. Again, those number have been converted to percentages, rather than a whole round figure, and those numbers are compared to other participants. ";
	
	public static final String DASHBOARD_TEXT_BOX2 = "The first bar graph shows total casualties collectively through 2009 to 2016. As we are looking into accidents that happened individual in a set year the bar chart shows the total number of casualties and depending on the number, depicts a bar to show us the representation of casualties in that year. Below it lists the dates, and beside that we have the total number of casualties."
	+"Beside that to the right, the bar chart shows the gender of casualties whether they were female or male. That participated in an accident. The dataset shows accidents and specifically one graph shows genders, and the application takes in the data, and splits them into two groups male or female for each year. The graph shows female drivers are more cautious then male and have consistently maintained that.";
	//public static final String DASHBOARD_TEXT_BOX4 = "Beside that to the right, the bar chart shows the gender of casualties whether they were female or male. That participated in an accident. The dataset shows accidents and specifically one graph shows genders, and the application takes in the data, and splits them into two groups male or female for each year. The graph shows female drivers are more cautious then male and have consistently maintained that. ";
	
	// Text box text predict screen - place the text below in double quotes
	public static final String PREDICT_TEXT_BOX = "The graph to the left shows monthly predictions with the help of Weka, the application predicts based on the data given and the data at its disposal and analysing monthly the accidents that could happen in the next 12 months. The application uses linear regression here to predict monthly, the amount of causalities that can happen in a given month. Below the x-axis shows the month, and the y-axis shows the accidents forecasted in a given month. As more datasets become available, we can add the data to the application, and the application can forecast the accidents the can happen over the next 12 months ahead. This is a prediction by the system based on previous data, and we cannot say these accidents are going to happen.";

	
	// validation rules
	public static final String REGEX_USERNAME = "[A-za-z0-9]*";
	public static final String REGEX_NAME = "[A-Za-z ]{3,}";
	public static final String REGEX_PASSWORD = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	public static final String REGEX_EMAIL = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
	public static final String REGEX_PHONE = "[0-9]*";
	
	//stats name on facts screen - edit fact names replace value in double quotes with the fact name
	public static String dummy1 = "fact1";
	public static String dummy2 = "fact2";
	public static String dummy3 = "fact3";
	public static String dummy4 = "fact4";
	public static String dummy5 = "fact5";
	public static String dummy6 = "fact6";
	public static String dummy7 = "fact7";
	public static String dummy8 = "fact8";
	public static String dummy9 = "fact9";
	public static String dummy10 = "fact10";
	public static String dummy11 = "fact11";
	public static String dummy12 = "fact12";
	public static String dummy13 = "fact13";
	public static String dummy14 = "fact14";
	public static String dummy15 = "fact15";
	public static String dummy16 = "fact16";
	public static String dummy17 = "fact17";
	public static String dummy18 = "fact18";
	public static String dummy19 = "fact19";
	public static String dummy20 = "fact20";
	public static String dummy21 = "fact21";
	public static String dummy22 = "fact22";
	
	//stat value on facts screen - edit fact values.
	public static String dummyVal1 = "2008 – 2009: There are 10 DVLA local services network, area enforcement centres in Leeds.";
	public static String dummyVal2 = "2009 - CRASH is introduced it’s a system for; secure collection, validation, transmission and storage of road traffic collision reports to meet police business needs and Department of Transport statistical requirements.";
	public static String dummyVal3 = "2009 - Mobile devices where available will allow data entry at the scene of a collision - police will no longer have to fill in paper forms. This has reduced time and effort for police.";
	public static String dummyVal4 = "2009 - The provisional number of killed or seriously injured (KSI) casualties in 2009 was 1,860, 8 per cent below the final 2008 estimate.";
	public static String dummyVal5 = "2009 - Rural roads present challenges for cyclists as the risk of being killed is much higher than for other roads.";
	public static String dummyVal6 = "In January 2010, to help DVLA identify fraudulent attempts to exchange an invalid driver licence. Machines were put in place to check those identities were true, carried out by police. ";
	public static String dummyVal7 = "2012 - Department for Transport - Reported accidents in Leeds; 9 accidents involved signal violation, 405 wet or flood accidents, 20 snow or ice accidents, 14 fatal accidents, 20 serious accidents and 1643 slight accidents. ";
	public static String dummyVal8 = "2013 - Areas with the highest rates of cycling were expected to have the lowest injury rate per unit exposure. This is based on the ‘strength in numbers’ more cyclists are riding around together.";
	public static String dummyVal9 = "2013 - It has been estimated that switching from car to bicycle use will result in 3-14 months of additional life from the increase in physical activity.";
	public static String dummyVal10 = "In 2013, 785 fatalities were car occupants, 398 were pedestrian, 331 were motorcyclists, 109 were cyclists and 90 were others.";
	public static String dummyVal11 = "Yorkshire Police and West Yorkshire Fire and Rescue Service are often at the front line of the most serious road traffic collisions.";
	public static String dummyVal12 = "In 2014, Analysis of road collision reports and speed survey results showed the speed limit was widely ignored and that this was a major contributory factor in many of the killed and serious injury collisions.";
	public static String dummyVal13 = "Pedestrians accounted for three quarters of the increase in fatalities between 2013 and 2014. Pedestrian fatalities increased by 12 percent from 398 in 2013 to 446 in 2014.";
	public static String dummyVal14 = "Increases in car and taxi traffic can lead to an increase in accidents and casualties as there are more vehicles on the roads. And the number of seriously injured pedestrians in 2014 is 1.3 per cent higher than in 2013.";
	public static String dummyVal15 = "In 2015, reported accidents in the city of Leeds were; dry accidents accounted for 1466, wet or flood were 497, snow or ice were 16, fatal accidents were 15, serious accidents were 292, slight accidents were 1672. According to the department of transport.";
	public static String dummyVal16 = "There was a total of 186,209 casualties of all severities in 2015. This is around 4 per cent lower than in 2014 and the second lowest level on record.";
	public static String dummyVal17 = "Behaviour of drivers, riders and pedestrians affect road casualty numbers. Depending on the mood they are in or tiredness.";
	public static String dummyVal18 = "A total of 409 pedestrians were killed in 2015, down from 446 in 2014, and just above the low of 398 in 2013.";
	public static String dummyVal19 = "There has been a statistically significant decrease in the number of causalities of all severities in road traffic accidents between 2015 and 2016.";
	public static String dummyVal20 = "The distance people travel is a factor that affects road casualty numbers. Weather also influences the number of road casualties.";
	public static String dummyVal21 = "A total of 816 car occupants were killed in 2016, up 8 per cent from the 754 in 2015. A total of 448 pedestrians were killed in 2016, up from 408 in 2015. Overall pedestrian casualties decreased by 2 per cent between 2015 and 2016.";
	public static String dummyVal22 = "In 2016, there were 5,140 seriously injured pedestrians in 2016. The number of slightly injured casualties decreased by 4 per cent to 17,962. And there were 533 older deaths in 2016, up from 492 deaths in 2015.";
	
	
	
	//preventions on facts screen
	public static final String FACTS_TEXT_BOX = "Solutions to prevent future accidents!"
			+ "\r\n" + "\r\n" + "- Drive predictably! Follow your lane, indicate and wait your turn, obey traffic rules, continue driving to not put other drivers in danger."
			+ "\r\n" + "\r\n" + "- Turn on your headlights to be visible in bad weather, or night time when driving. So, you can be seen coming."
			+ "\r\n" + "\r\n" + "- Make sure your vehicle has MOT covered to ensure all aspects of the vehicle are in check, otherwise you are breaking the law, and endangering the people, vehicles around you if you begin driving."
	        + "\r\n" + "\r\n" + "- Don’t not drive intoxicated or under the influence of drinking alcohol or drug usage. Always drive sober, and clear of drinking or drug abuse. Drink driving increase the likelihood of an accident happening. "
			+ "\r\n" + "\r\n" + "- Tiredness as well increase the likelihood of an accident happening. Know your limits, and drive and stop where appropriate."
	        + "\r\n" + "\r\n" + "- Be aware and pay attention to the road, reduce distraction in the car and ignore items till the engine is turned off. Inattentive driving accounts for more accidents then drink driving. Never use your cell phone. "
			+ "\r\n" + "\r\n" + "- Ignoring road rules is an upcoming cause for road accidents, patience is key when driving and following the rules of road can help a person stay well clear of accidents. Follow speed limits."
	        + "\r\n" + "\r\n" + "- Uneducated drivers; drivers learnt the rules when applying for a license however some drivers learnt abroad, and some drivers still don’t know what certain signs display. And some don’t practice basic rules like safety seat belt for the driver. "
			+ "\r\n" + "\r\n" + "- Ignore aggressive or impatient drivers or be aware of drivers driving recklessly on the roads. "
	        + "\r\n" + "\r\n" + "- Avoid construction areas, pedestrians are more likely to access the roads as diversion to the road they’re used to, be aware of their presence. "
			+ "\r\n" + "\r\n" + "- The driving instructors instruct you to keep hands at 10 to 2, to be ready, and to be ready to stop abruptly, look, and listen. Be aware of blind spots, including those in rear view mirrors and behind windshield pillars or highway road signs. Also, when at an intersection making a right-hand turn, look both directions at least twice before proceeding. Vehicles can appear almost out of nowhere very quickly."
	        + "\r\n" + "\r\n" + "- Count to three before entering an intersection on a green light. Look both ways and be sure no one is trying to speed through a yellow light. Proceed when ready and all is clear."
			+ "\r\n" + "\r\n" + "- Be aware of large vehicles! As they have many blind spot both cyclists and vehicles are warned of driving closely. "
			+ "\r\n" + "\r\n" + "- Keep at least one hand on the wheel at all times. Reduce distractions within the car, and always maintain control of the vehicle. There are many dangers including humps, pot holes, or a blown tire can send vehicles into another lane or cause accidents."
			+ "\r\n" + "\r\n" + "- Always be on the lookout for kids and animals. They have a habit of appearing between parked vehicles or when cars are driving on the roads. Slow down at all times ready for a sudden stop."
			+ "\r\n" + "\r\n" + "- Perform regular checks ahead of a break down. Checking and keeping tires inflated, avoid break downs as traffic is created, and cars on the roads are stalled which increases likelihood of an accident happening."
			+ "\r\n" + "\r\n" + "- Always when reversing look backwards or modern vehicles indicate when a vehicle is close by making a noise within the car to alert drivers. Going to accidents by not looking backwards, can have effects on both drivers. Don’t depend on mirrors alone, see what’s behind and reverse appropriately."
			+ "\r\n" + "\r\n" + "- Don’t be a space invader and do not tailgate, as the likelihood of an accident increases, you won’t be ready for sudden stops. Tailgating is a serious cause of accidents, begin journeys early enough so you don’t speed. Always leave enough space between the vehicles ahead."
			+ "\r\n" + "\r\n" + "- No one owns the roads, so treat drivers with respect, as behaviour is another leading to cause to why accidents occur. Report any suspicious driving to relevant authorities such as police."
			+ "\r\n" + "\r\n" + "- Be reactive and responsive, as some people get lost in their thoughts while driving. And easily lose focus and concentration which may make you change your lane at the wrong time or run into a cyclist. Companies out there are always helping drivers to stay concentrate when driving and alert to passengers’ distress."
			+ "\r\n" + "\r\n" + "- Careful when driving on Icey roads. And be aware of drivers in the night, beep drivers who forget to turn on headlights. "
			+ "\r\n" + "\r\n" + "- Be careful when driving in bad weather, always use wind screen wipers. And be visible in the tough conditions.";
	
}
