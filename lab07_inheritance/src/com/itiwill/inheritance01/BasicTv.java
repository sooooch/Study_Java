package com.itiwill.inheritance01;

public class BasicTv {
	// 상수 정의:
	public static final int MIN_CHANNEL = 0;
	public static final int MAX_CHANNEL = 2;
	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 2;

	// 필드
	private boolean powerOn;// 전원 상태(true > on , false > off )
	private int channel;// 현재 채널 번호
	private int volume;// 음량

	// 생성자
	public BasicTv() {
	}

	public BasicTv(boolean powerOn, int channel, int volume) {
		this.powerOn = powerOn;
		this.channel = channel;
		this.volume = volume;
	}

	// 메서드

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;

	}

	public boolean isPowerON() { // boolean 이면 보통 get 대신 is를 사용
		return powerOn;
	}

	public void setPowerON(boolean powerON) {
		this.powerOn = powerON;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	/**
	 * TV가 켜져 있으면 끄고, TV가 꺼져 있는 켬 powerOn의 값이 true이면 false 변경, powerOn의 값이 false이면
	 * true로 변경
	 * 
	 * @return powreOn의 값
	 */
	public boolean powerOnOff() {

		if (powerOn) {
			powerOn = false;
			System.out.println("tv off");
		} else {
			powerOn = true;
			System.out.println("tv on");
			System.out.println("ch: " + channel);

		}

		return powerOn;
	}

	/**
	 * channerlup 현재 채널의 값을 1 증가 만약 현재 채널 값이 채널의 최댓값인 경우, 채널의 최솟값으로 변경.
	 * 
	 * @return 바뀐 현재 채널값
	 */

	public int channerup() {
		if (powerOn) {
			if (channel >= MAX_CHANNEL) {
				channel = MIN_CHANNEL;
			} else {
				channel++;
			}
			System.out.println("ch: " + channel);
		}
		return channel;
	}

	/**
	 * channerldown 현재 채널의 값을 1 감소 만약 현재 채널 값이 채널의 최솟값인 경우, 채널의 최값으로 변경.
	 * 
	 * @return 바뀐 현재 채널값
	 */

	public int channerdown() {
		if (powerOn) {
			if (channel == MIN_CHANNEL) {
				channel = MAX_CHANNEL;
			} else {
				channel--;
			}
			System.out.println("ch: " + channel);
		}
		return channel;

	}

	/**
	 * volumeup 현재 음량의 값을 1 감소 만약 현재 음량 값이 음량의 최댓값인 경우, 음량의 최댓값으로 변경.
	 * 
	 * @return 바뀐 현재 채널값
	 */

	public int volumeup() {
		if (powerOn) {
			if (volume < MAX_VOLUME) {

				volume++;
			}
			System.out.println("VOL: " + volume);
		}
		return volume;
	}

	/**
	 * volumedown 현재 음량의 값을 1 감소 만약 현재 음량이 채널의 최솟값인 경우, 음량을 변경하지않음
	 * 
	 * @return 바뀐 현재 채널값
	 */
	public int volumedown() {

		if (powerOn) {
			if (volume > MIN_VOLUME) {
				volume--;
			}

		}
		System.out.println("VOL: " + volume);

		return volume;
	}

}
