package first_sprint;

public interface Subject {
	public void AcceptRefund(Observer o);
    public void RejectRefund(Observer o);
    public void notifyObservers();
	
}
