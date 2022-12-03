package first_sprint;

import java.io.IOException;

public interface Subject {
	public void AcceptRefund(Observer o);
    public void RejectRefund(Observer o);
    public void notifyObservers() throws IOException;
	
}
