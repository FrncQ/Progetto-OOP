package Eventribe.Controller;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;


/**
 * Questa classe servirà per gestire tutte le richieste possibili che il client può fare
 * 
 * @author Franco Quinteros
 * @author Yassin Ammar
 * 
 */
public class Controller {
	
	private String OAuth_code = "3NDX46HV2JHVUMCTL7TL";
	private String url = "https://www.eventbrite.com/e/registrazione-apertura-techlab-08-03-2022-290241659617?keep_tld=1";
	
	
	
//	@GetMapping Client client = ClientBuilder.newClient();
//	Response response = client.target("https://www.eventbriteapi.com/v3/venues/{venue_id}/")
//			.request(MediaType.TEXT_PLAIN_TYPE)
//			.header("Authorization", "Bearer 3NDX46HV2JHVUMCTL7TL")
//			.get();
//	
	@GetMapping (value="/event")
	public void getEvent(){
		Client client = ClientBuilder.newClient();
		Response response = client.target(url)
		.request(MediaType.TEXT_PLAIN_TYPE)
		.header("Authorization", OAuth_code)
		.get();
		
		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
	}

}



