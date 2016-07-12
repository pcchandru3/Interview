package com.pcn.interview;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




//# MyService-log-20160630-14.log
//[Info][2016-06-30 14:12:13][42fds3Gan23Jf2J][MyService] Rendering UI module “AddressBox"
//[Debug][2016-06-30 14:12:13][42fds3Gan23Jf2J][MyService] Retrieving customer shipping address
//[Debug][2016-06-30 14:12:14][42fds3Gan23Jf2J][MyService] Grabbing shipping address for customer session “42fds3Gan23Jf2J"
//[Error][2016-06-30 14:12:25][42fds3Gan23Jf2J][MyService] Unable to retrieve shipping address for session “42fds3Gan23Jf2J"
//[Info][2016-06-30 14:12:27][45jsB9sjam543m2][MyService] Rendering UI module “AddressBox"
//[Debug][2016-06-30 14:12:27][45jsB9sjam543m2][MyService] Retrieving customer shipping address
//[Debug][2016-06-30 14:12:27][45jsB9sjam543m2][MyService] Grabbing shipping address for customer session “45jsB9sjam543m2"
//[Error][2016-06-30 14:12:28][42fds3Gan23Jf2J][AddressService] Customer not found for session “42fds3Gan23Jf2J"
//[Debug][2016-06-30 14:12:29][45jsB9sjam543m2][AddressService] Shipping address found for session “45jsB9sjam543m2"
//[Info][2016-06-30 14:12:29][45jsB9sjam543m2][MyService] Returning customer shipping address to “AddressBox"
//...
//


public class LogParser {
	
	public class LogData {
		 
		 public String sTag;
		 public String sTimeStamp;
		 public String sService;
		 public String sMessage;
		 
		 
		    
		}
	
	
	

    public List<LogData> logData = new ArrayList<LogData>(); 
    
    
    public LogData getLogInfo(String sServiceName){
        for(LogData l : logData){
            if(l.sTag.equals(sServiceName)){
                // logic 
                
                // extract and returnt he logData object
            }
        }
        
        
        
        
    }
    
    
    public void getErrorData() {
        
        for(LogData l : logData){
            if(l.sTag.equals("Error"){
                // logic 
            }
        }
        
        
    }
    
    
    
    public void parseLogLine(String s){
        
        String[] aLogData = s.replaceAll("\\[", "").split("\\]");
        LogData temp = new LogData();
        
        temp.sTag = aLogData[0];
        temp.sTimeStamp = aLogData[1];
        
        
        logData.add(temp);
        
        
    
    }
    
    public void readLog() {
        
        
        try {
            
            
            Scanner s = new Scanner(new File("\\path\\to\\file\\logfile.txt"));
            
            while(s.hasNext()){
                String line = s.nextLine();
                parseLogLine(line);
            }
            
            
            
        } catch(Exception e){
            // handle exceptions
        }
    }
	
	
	

}
