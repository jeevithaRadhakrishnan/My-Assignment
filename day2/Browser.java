package week1.day2;

public class Browser {
	
	float browserVersion=91.0f;
	
	public void launchBrowser()
	{
		System.out.println("browser launched successfully");
	
	}
	

	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Browser chrome=new Browser();
		Browser edge=new Browser();

chrome.launchBrowser();
chrome.loadUrl();
System.out.println(chrome.browserVersion); 
edge.launchBrowser();
edge.loadUrl();
edge.browserVersion=92.0f;
System.out.println(edge.browserVersion); 




	}

}
