package DAY4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer; 
import java.util.TimerTask;
 
interface ReminderTask
{
	void remind(String message);
}

public class TaskRemainder {
	public static void main(String[] args) {
		
		String [] reminderHours = {"7:00","10:00","16:00","21:33"};
		
			String[] displayMessage = {"Time for Breakfast", 
								"Time to go to office", 
								"Time for lunch", 
								"Time for Dinner"};
			
			
			ReminderTask reminderTask = (message) ->{
				System.out.println("Reminder: It's "+ message);
			};
			
			
			Timer timer = new Timer(); 
			TimerTask timerTask = new TimerTask() {
				
				@Override
				public void run() {					
					String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
					
					for(int i=0;i<reminderHours.length;i++)
					{
						
						if(currentTime.equals(reminderHours[i]))
						{
							reminderTask.remind(displayMessage[i]);
						}	
					}
				}
			};
			
			timer.schedule(timerTask, 0 , 60000);
			
			System.out.println("Remainder is started");
			
		}

	}
