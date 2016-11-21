package demo;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hi")
public class Hi {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hi world1!";
    }
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getXMLMessage(){
        return "Hi world2!";
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage(){
        return "Hi world3!";
    }
}