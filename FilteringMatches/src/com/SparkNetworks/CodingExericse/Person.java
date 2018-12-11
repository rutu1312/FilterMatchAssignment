package com.SparkNetworks.CodingExericse;
import javax.xml.bind.annotation.XmlRootElement;
import org.json.simple.JSONObject;

 
@XmlRootElement
public class Person {
	private String display_name;
	private String job_title;
	private String main_photo;
	private String religion;
	private int age;
	private double height_in_cm;
	private double compatibility_score;
	private int contacts_exchanged;	
	private boolean favourite;
	private JSONObject city; 	 

	public Person(String display_name,String job_title,String main_photo,String religion,
	int age, double height_in_cm,double compatibility_score,int contacts_exchanged,
	boolean favourite,JSONObject city){
		this.display_name=display_name;
		this.job_title=job_title;
		this.main_photo=main_photo;
		this.religion=religion;
		this.age=age;
		this.height_in_cm=height_in_cm;
		this.compatibility_score=compatibility_score;
		this.contacts_exchanged=contacts_exchanged;
		this.city=city;
		this.favourite=favourite;
	}
	
	public void setDisplayName(String display_name)
	{
		this.display_name=display_name;
	}
	public void setJobTitle(String job_title)
	{
		this.job_title=job_title;
	}
	public void setMainPhoto(String main_photo)
	{
		this.main_photo = main_photo;
	}
	public void setReligion(String religion)
	{
		this.religion = religion;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setHeightInCm(double height_in_cm)
	{
		this.height_in_cm=height_in_cm;
	}
	public void setCompatibilityScore(double compatibility_score)
	{
		this.compatibility_score = compatibility_score;
	}
	public void setContactsExchanged(int contacts_exchanged)
	{
		this.contacts_exchanged = contacts_exchanged;
	}
	public void setFavourite(boolean favourite)
	{
		this.favourite = favourite;
	}
	public void setCity(JSONObject city)
	{
		this.city = city;
	}
	public String getDisplayName()
	{
		return display_name;
	}
	public String getJobTitle()
	{
		return job_title;
	}
	public String getMainPhoto()
	{
		return main_photo;
	}
	public String getReligion()
	{
		return religion;
	}
	public int getAge()
	{
		return age;
	}
	public double getHeightInCm()
	{
		return height_in_cm;
	}
	public double getCompatibilityScore()
	{
		return compatibility_score;
	}
	public int getContactsExchanged()
	{
		return contacts_exchanged;
	}
	public boolean getFavourite()
	{
		return favourite;
	}
	public JSONObject getCity()
	{
		return city;
	}

}
