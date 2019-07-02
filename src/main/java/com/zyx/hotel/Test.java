package com.zyx.hotel;

public class Test {

	public static void main(String[] args) {
		ChuShi cs=new ChuShi("张三","富豪001");
		Waiter w1=new Waiter("李四","富豪002");
		Waiter w2=new Waiter("王五","富豪003");
		JingLi jl=new JingLi("刘六","富豪000",10000.123);
		
		cs.work("张三");
		cs.VIP("张三");
		
		w1.work("李四");
		w1.VIP("李四");
		w2.work("王五");
		w2.VIP("王五");
		
		jl.work("刘六");

	}

}
