package Study;

	class Tv {
		String color;
		boolean power;
		int channel;
		
		void power() {power=!power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	}

	class TvTest {
		public static void main(String [] args) {
			Tv t = new Tv();
			t.channel=99;
			t.channelDown();
			System.out.println("현재 채널은" + t.channel + "입니다.");		
		}
	}