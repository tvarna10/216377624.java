import java.util.HashMap;
import java.util.Map;
import java.util.List;


//The Class representing the HTTP Request
class HttpRequest {

	//Request line   
	String Mtd;
	String URL;
	String Ver; 
	
	// Header Line
	Map<String,String> headers = new HashMap<>();
	
	//Entity body 
	String body;
}

//The Class Representing of a HTTP Response 
class HttpResponse {
	
	//Status Line 
	String vers; 
	int stsCode; 
	String phrase; 
	
	//Header line
	Map<String, String> headers= new HashMap<>();
	
	//Entity body
	String body; 
	
}

//class representing a DNS message
class DNSMessage{
	
	//12 byte field
	int identifier; 
	int flags;
	int numofQuestions;
	int numofAnswersRRs;
	int numofAutoritiyRRs; 
	int numofAdditionalRRs;
	
	//Variable-length fields
	String questionName; 
	int questionType;
	int questionClass;
	
	//Answer name
	String answerName;
	int answerType; 
	int answerClass; 
	int answerTTL;
	int answerDataLength;
	String answerData;
	
	//Variable-length fields
	List<DNSQues> questions;//name, type field for a query
	List<DNSResRec> answers;//RR in response to query
	List<DNSResRec> authority;// records for authoritative servers
	List<DNSResRec> additionalInformation;//Additional "helpful" info that may be used
	
	
	//inner classes for the fields above
	static class DNSQues {
		String name;
		int type;
		int classcode;
	}
	
	static class DNSResRec {
	String name;
	int type;
	int classcode;
	int ttl;
	int rdLength;
	byte[] rData;	
	}
			
}
