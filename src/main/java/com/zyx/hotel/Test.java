package com.zyx.hotel;

public class Test {

	public static void main(String[] args) {
		ChuShi cs=new ChuShi("����","����001");
		Waiter w1=new Waiter("����","����002");
		Waiter w2=new Waiter("����","����003");
		JingLi jl=new JingLi("����","����000",10000.123);
		
		cs.work("����");
		cs.VIP("����");
		
		w1.work("����");
		w1.VIP("����");
		w2.work("����");
		w2.VIP("����");
		
		jl.work("����");

	}

}
