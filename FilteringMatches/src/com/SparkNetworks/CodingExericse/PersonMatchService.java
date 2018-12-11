package com.SparkNetworks.CodingExericse;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

@Path("/PersonMatchService")
public class PersonMatchService {
   // @CrossOrigin(origins = "http://localhost:9000")
    @GET
    @Path("/matchs")
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject getTrackInJSON() {
        List<Person> listPerson = new ArrayList<Person>();
        JSONObject Leeds=new JSONObject();
        Leeds.put( "name", "Leeds");
        Leeds.put( "lat", 53.801277);
        Leeds.put( "lon", -1.548567);
        Person p1 = new Person("Caroline","Corporate Lawyer","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Atheist",41,153,76,2,true,Leeds);
        
        JSONObject Solihull=new JSONObject();
        Solihull.put( "name", "Solihull");
        Solihull.put( "lat", 52.412811);
        Solihull.put( "lon", -1.778197);
        Person p2 = new Person("Sharon","Doctor","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Islam",47,161,97,0,false,Solihull);
        
        JSONObject Cardiff=new JSONObject();
        Cardiff.put( "name", "Cardiff");
        Cardiff.put( "lat", 51.481583);
        Cardiff.put( "lon", -3.179090);
        Person p3 = new Person("Natalia","Project Manager","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",38,144,47,5,false,Cardiff);
        
        JSONObject Eastbourne=new JSONObject();
        Eastbourne.put( "name", "Eastbourne");
        Eastbourne.put( "lat", 50.768036);
        Eastbourne.put( "lon", 0.290472);
        Person p4 = new Person("Marta","Finance","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Agnostic",55,140,95,0,false,Eastbourne);
        
        JSONObject London=new JSONObject();
        London.put( "name", "London");
        London.put( "lat", 51.509865);
        London.put( "lon", -0.118092);
        Person p5 = new Person("Maria","CEO","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",43,175,88,0,false,London);
        
        Person p6 = new Person("Stephanie","Project Manager","",
                "Christian",39,153,87,4,false,London);

        Person p7 = new Person("Claire","GP","http://thecatapi.com/api/images/get?format=src&type=gif",
                "Atheist",48,167,83,6,false,London);
       
        JSONObject Swindon=new JSONObject();
        Swindon.put( "name", "Swindon");
        Swindon.put( "lat", 51.568535);
        Swindon.put( "lon", -1.772232);
        Person p8 = new Person("Colette","Doctor - Hospital","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",39,177,89,2,false,Swindon);
        
        
        JSONObject Oxford=new JSONObject();
        Oxford.put( "name", "Oxford");
        Oxford.put( "lat", 51.752022);
        Oxford.put( "lon", -1.257677);
        Person p9 = new Person("Caroline","Marketing Consultant","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Atheist",43,160,91,1,false,Oxford);
        
        JSONObject Salisbury=new JSONObject();
        Salisbury.put( "name", "Salisbury");
        Salisbury.put( "lat", 51.068787);
        Salisbury.put( "lon", -1.794472);
        Person p10 = new Person("Kate","Psychologist","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Buddhist",42,160,97,10,false,Salisbury);
        
        JSONObject Weymouth=new JSONObject();
        Weymouth.put( "name", "Weymouth");
        Weymouth.put( "lat", 50.614429);
        Weymouth.put( "lon", -2.457621);
        Person p11 = new Person("Katie","Lawyer","",
        		                "Atheist",40,148,94,0,false,Weymouth);


        JSONObject Bournemouth=new JSONObject();
        Bournemouth.put( "name", "Bournemouth");
        Bournemouth.put( "lat", 50.614429);
        Bournemouth.put( "lon", -2.457621);
        Person p12 = new Person("Clare","Accountant","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",40,144,90,8,false,Bournemouth);
        
        JSONObject Plymouth=new JSONObject();
        Plymouth.put( "name", "Plymouth");
        Plymouth.put( "lat", 50.614429);
        Plymouth.put( "lon", -2.457621);
        Person p13 = new Person("Laura","Lawyer","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",39,160,89,0,false,Plymouth);
        
        JSONObject Inverness=new JSONObject();
        Inverness.put( "name", "Inverness");
        Inverness.put( "lat", 57.477772);
        Inverness.put( "lon", -4.224721);
        Person p14 = new Person("Katlin","Barrister","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Jewish",39,153,87,0,true,Inverness);

        JSONObject Aberdeen=new JSONObject();
        Aberdeen.put( "name", "Aberdeen");
        Aberdeen.put( "lat", 57.149651);
        Aberdeen.put( "lon", -2.099075);
        Person p15 = new Person("Tracy","Lawyer","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",39,153,87,0,false,Aberdeen);

        JSONObject Ayr=new JSONObject();
        Ayr.put( "name", "Ayr");
        Ayr.put( "lat", 55.458565);
        Ayr.put( "lon", -4.629179);
        Person p16 = new Person("Angie","Accountant","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Atheist",50,153,93,8,true,Ayr);


        JSONObject Belfast=new JSONObject();
        Belfast.put( "name", "Belfast");
        Belfast.put( "lat", 54.607868);
        Belfast.put( "lon", -5.926437);
        Person p17 = new Person("Samantha","Project Manager","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",32,161,89,0,false,Belfast);
        
        JSONObject Londonderry=new JSONObject();
        Londonderry.put( "name", "Londonderry");
        Londonderry.put( "lat", 55.006763);
        Londonderry.put( "lon", -7.318268);
        Person p18 = new Person("Elizabeth","Dentist","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Islam",41,145,83,4,true,Londonderry);
        
        Person p19 = new Person("Emma","Banker","http://thecatapi.com/api/images/get?format=src&type=gif",
        		                "Christian",40,150,73,0,false,Leeds);
        
        Person p20 = new Person("Diana","Consultant","http://thecatapi.com/api/images/get?format=src&type=gif",
                "Atheist",44,153,50,0,false,London);
        
        Person p21 = new Person("Kysha","Lawyer","",
                "Islam",45,144,88,10,true,London);
        
        Person p22 = new Person("Anne","Marketing Consultant","http://thecatapi.com/api/images/get?format=src&type=gif",
                "Jewish",38,170,88,0,false,Swindon);
       
        Person p23 = new Person("Daniela","Doctor","http://thecatapi.com/api/images/get?format=src&type=gif",
                "Christian",37,177,76,0,false,Bournemouth);
        
        Person p24 = new Person("Katherine","Lawyer","http://thecatapi.com/api/images/get?format=src&type=gif",
                "Atheist",39,177,99,50,true,London);
        
        JSONObject Harlow=new JSONObject();
        Harlow.put( "name", "Harlow");
        Harlow.put( "lat", 51.772938);
        Harlow.put( "lon", 0.102310);
        Person p25 = new Person("Susan","Project Manager","http://thecatapi.com/api/images/get?format=src&type=gif",
                "Christian",25,166,88,0,false,Harlow);




        
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        listPerson.add(p5);
        listPerson.add(p6);
        listPerson.add(p7);
        listPerson.add(p8);
        listPerson.add(p9);
        listPerson.add(p10);
        listPerson.add(p11);
        listPerson.add(p12);
        listPerson.add(p13);
        listPerson.add(p14);
        listPerson.add(p15);
        listPerson.add(p16);
        listPerson.add(p17);
        listPerson.add(p18);
        listPerson.add(p19);
        listPerson.add(p20);
        listPerson.add(p21);
        listPerson.add(p22);
        listPerson.add(p23);
        listPerson.add(p24);
        listPerson.add(p25);
        
        JSONObject returnArray=new JSONObject();
        returnArray.put( "matches", listPerson);
        
        
        return returnArray;
        
    }

}
