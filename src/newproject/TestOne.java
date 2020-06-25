package newproject;

public class TestOne 
{
String domainName;

// public constructor
public TestOne(){
    domainName = "programiz.com";
}
}
class run
{
public static void main(String[] args) 
{
	// object is created in another class
    TestOne companyObj = new TestOne();
    System.out.println("Domain name = "+ companyObj.domainName);
}
}
