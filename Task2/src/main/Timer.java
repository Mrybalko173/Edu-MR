package main;

/**Class for timer
 * @author mikhail.rybalko
 *
 */
public class Timer {
	
	long start;
	long end;
	float time;
	
	public void startTimer(){
		start = System.nanoTime();
	}
	
	public void stopTimer(){
		end = System.nanoTime();
		this.time = ((float)(this.end - this.start))/1000000000;
	}
	
	public float getSeconds(){
		return time;
	}
}
