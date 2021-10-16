import java.io.IOException;
import java.util.concurrent.TimeoutException;

public interface Comcli {
	
	String send(String request, int requestTimeout) throws TimeoutException, IOException;

}
