package com.lec.ex06_lifo_fifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {

		Queue<Message> message = new LinkedList<>();
		
		message.offer(new Message("Send Twitter", "홍길동"));
		message.offer(new Message("Send Mail", "홍길순"));
		message.offer(new Message("Send Facebook", "홍길자"));
		message.offer(new Message("Send Facebook", "홍길자"));  // 중복 가능
		message.offer(new Message("Send Kakaotalk", "홍길녀"));
		
		System.out.println(message.size());
		System.out.println();
		
		while(!message.isEmpty()) {
			Message msg = message.poll();
			System.out.println(msg.to + ":" + msg.msg);
		}
		System.out.println();
		
		message.offer(new Message("Send Twitter", "홍길동"));
		message.offer(new Message("Send Mail", "홍길순"));
		message.offer(new Message("Send Facebook", "홍길자"));
		System.out.println(message.size());
		System.out.println();
		
		while(!message.isEmpty()) {
			Message msg = message.poll();
			switch(msg.msg) {
			case "Send Mail": System.out.println(msg.to + "에게 메일을 보냈습니다.");
			case "Send Facebook": System.out.println(msg.to + "에게 페이스북 메시지를 보냈습니다.");
			case "Send Twitter": System.out.println(msg.to + "에게 트위터 메시지 보냈습니다.");
			case "Send Kakaotalk": System.out.println(msg.to + "에게 카카오톡 메시지 보냈습니다.");
			}
		}
		
	}

}

class Message {
	
	public String msg;
	public String to;
	
	public Message(String msg, String to) {
		this.msg = msg;
		this.to = to;
	}
	
	
	
}








