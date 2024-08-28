package ex8;

public class TV {
	boolean power;
	int channel;
	int volume;
	
	void OnOff() {
		power = !power;
	}
	
	void setCh(int ch) {
		if (ch<100) {
			channel = ch;
		}
		else {
			channel = 1;
		}
	}
	
	void volumeUp() {
		volume++;
		System.out.println("현재 volume : "+volume);
	}
	void volumeDown() {
		volume--;
		System.out.println("현재 volume : "+volume);
	}
	
	TV(boolean p, int c, int v){
		power = p;
		if (c<100) {
			channel = c;
		}
		else {
			channel = 1;
		}
		volume = v;
	}
	
	void info() {
		System.out.println("power : "+power);
		System.out.println("channel : "+channel);
		System.out.println("volume : "+volume);
	}
}
