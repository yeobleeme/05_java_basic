package exercise;

class SutdaDeck {

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		/* (1)배열 SutdaCard 를 적절히 초기화 하시오. */
		for (int i = 0; i < CARD_NUM; i++) {
			if (i == 0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard(i + 1, true);
			} else {
				cards[i] = new SutdaCard(i%10 + 1, false);
			}
		}

	}
	
//	1. 메서드명 : shuffle
//	기능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다. 
//	(Math.random() 사용)
//	반환타입 : 없음
//	매개변수 : 없음
	void shuffle() {
		int idx = 0;
		SutdaCard tmp;
		for(int i=0; i<CARD_NUM; i++) {
			idx = (int) Math.random() % CARD_NUM;
			tmp = cards[idx];
			cards[idx] = cards[i];
			cards[i] = tmp;
		}
	}
	
//	2. 메서드명 : pick
//	기능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//	반환타입 : SutdaCard
//	매개변수 : int index - 위치
	public SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) 
			return null;
		return cards[index];
	}
	
	
//	3. 메서드명 : pick 
//	기능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다. 
//	(Math.random() 사용)
//	반환타입 : SutdaCard
//	매개변수 : 없음   
	SutdaCard pick() {
		int idx = (int) Math.random() % CARD_NUM;
		return cards[idx];
	}
	
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}



class Exercise7_1and2 {
	public static void main(String args[]) {

		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");

		
		System.out.println();
		System.out.println(deck.pick(0));
		
	}

}







