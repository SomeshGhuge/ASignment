package Assignemnt15;
//1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
//1.2 Design the below method into Policy class and which return the policy object
//public Policy getPolicyDetails() 
//1.3 Input should be taken from user and print that data into getPolicyDetails () method.

import java.util.Scanner;
public class Policy {
    private int policyid;
    private String policyname;
    private String policytype;
    private int premiumamount;
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public String getPolicytype() {
		return policytype;
	}
	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}
	public int getPremiumamount() {
		return premiumamount;
	}
	public void setPremiumamount(int premiumamount) {
		this.premiumamount = premiumamount;
	}
     
	public Policy getpolicydetails() {
		Scanner scanner=new Scanner(System.in);
		Policy policy = new Policy();
		System.out.println("Enter policy Id");
		int a =scanner.nextInt();
		System.out.println("Enter policy Name");
		String b =scanner.next();
		System.out.println("Enter policy Type");
		String c =scanner.next();
		System.out.println("Enter policy Premium amount");
		int d =scanner.nextInt();
		
		policy.setPolicyid(a);
		policy.setPolicyname(b);
		policy.setPolicytype(c);
		policy.setPremiumamount(d);
		return policy;
	}
	public String toString() {
		return "Your policy Id is = "+policyid+"\nYour Policy Name is "+policyname+
				"\n Your policy type is "+policytype+"\nPolicy Premiun amount is "+premiumamount
				;
		
	}
	public static void main(String[]args) {
		Policy policy1=new Policy();
		Policy policy2=policy1.getpolicydetails();
	    System.out.println(policy2);
//		int q=policy2.getPolicyid();
//		String w=policy2.getPolicyname();
//		String r=policy2.getPolicytype();
//		int t=policy2.getPremium_amount();
//		System.out.println("Your policy id is "+policy2.getPolicyid());
//		System.out.println("Your policy name is "+w);
//		System.out.println("Your policy type is "+r);
//		System.out.println("Your policy premium amount is "+t);
	}
     
}
