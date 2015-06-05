package org.bca.introcs.u4.Graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JPanel;

public class StillClock extends JPanel {
	private int hour, minute, second;

	public StillClock() {
		// construct a default clock with the current time
		setCurrentTime();
	}

	public StillClock(int hour, int minute, int second) {
		// construct a default clock with the current time
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		repaint();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		repaint();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// initialize clock parameters
		int clockRadius = (int) (Math.min(getWidth(), getHeight()) * .8 * .5);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;

		// draw circle
		g.setColor(Color.BLACK);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius,
				2 * clockRadius, 2 * clockRadius);
		g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
		g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
		g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
		g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);

		// draw second hand
		int sLength = (int) (clockRadius * 0.8);
		int xSecond = (int) (xCenter + sLength
				* Math.sin(second * (2 * Math.PI / 60)));
		int ySecond = (int) (yCenter - sLength
				* Math.cos(second * (2 * Math.PI / 60)));
		g.setColor(Color.red);
		g.drawLine(xCenter, yCenter, xSecond, ySecond);

		// draw minute hand
		int mLength = (int) (clockRadius * 0.65);
		int xMinute = (int) (xCenter + mLength
				* Math.sin(minute * (2 * Math.PI / 60)));
		int yMinute = (int) (yCenter - mLength
				* Math.cos(minute * (2 * Math.PI / 60)));
		g.setColor(Color.blue);
		g.drawLine(xCenter, yCenter, xMinute, yMinute);
		
		//draw hour hand
		int hLength = (int) (clockRadius * 0.5);
		int xHour = (int) (xCenter + hLength
				* Math.sin(hour * (2 * Math.PI / 60)));
		int yHour = (int) (yCenter - hLength
				* Math.cos(hour * (2 * Math.PI / 60)));
		g.setColor(Color.green);
		g.drawLine(xCenter, yCenter, xHour, yHour);
	}

	public void setCurrentTime() {
		// construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();

		// set current time
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
	}

	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}
}
