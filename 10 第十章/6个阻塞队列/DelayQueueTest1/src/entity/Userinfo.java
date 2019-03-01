package entity;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Userinfo implements Delayed {

	private long delayNanoTime;// —”≥Ÿµƒƒ…√Î
	private String username;

	public Userinfo(long delayTime, String username) {
		super();
		this.username = username;

		TimeUnit unit = TimeUnit.SECONDS;
		delayNanoTime = System.nanoTime() + unit.toNanos(delayTime);
	}

	public String getUsername() {
		return username;
	}

	@Override
	public int compareTo(Delayed o) {
		if ((this.getDelay(TimeUnit.NANOSECONDS) - o
				.getDelay(TimeUnit.NANOSECONDS)) < 0) {
			return -1;
		}
		if ((this.getDelay(TimeUnit.NANOSECONDS) - o
				.getDelay(TimeUnit.NANOSECONDS)) > 0) {
			return 1;
		}
		return 0;
	}

	public long getDelayNanoTime() {
		return delayNanoTime;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(delayNanoTime - System.nanoTime(),
				TimeUnit.NANOSECONDS);
	}

}
