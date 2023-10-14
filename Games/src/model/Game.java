package games.model;

public class Game {
	
	private final String info;
	private final String weekday;
	private final String date;
	private final String time;
	private final String home;
	private final String away;
	private final int homeGoals;
	private final int awayGoals;
	
	private Game(String info, String weekday, String date, String time, String home, String away, int homeGoals, int awayGoals) {
		this.info = info;
		this.weekday = weekday;
		this.date = date;
		this.time = time;
		this.home = home;
		this.away = away;
		this.homeGoals = homeGoals;
		this.awayGoals = awayGoals;
	}
	
	public static Game fromString(String s) {
		String[] parts = s.split(",");
		String info = parts[0].trim();
		String[] dateParts = parts[1].split("\\|");
		String weekday = dateParts[0].trim();
		String date = dateParts[1].trim();
		String time = dateParts[2].replace(" Uhr", "").trim();
		String home = parts[2].trim();
		String away = parts[4].trim();
		String[] goalsParts = parts[3].split(":");
		int homeGoals = Integer.parseInt(goalsParts[0].trim());
		int awayGoals = Integer.parseInt(goalsParts[1].trim());
		return new Game(info, weekday, date, time, home, away, homeGoals, awayGoals);
	}
	
	public String getInfo() {
		return info;
	}
	
	public String getWeekday() {
		return weekday;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}
	
	public String getHome() {
		return home;
	}
	
	public String getAway() {
		return away;
	}
	
	public int getHomeGoals() {
		return homeGoals;
	}
	
	public int getAwayGoals() {
		return awayGoals;
	}
	
	public int goalCount() {
		return homeGoals + awayGoals;
	}
	
	@Override
	public String toString() {
		return "Game{" +
				"info='" + info + '\'' +
				", weekday='" + weekday + '\'' +
				", date='" + date + '\'' +
				", time='" + time + '\'' +
				", home='" + home + '\'' +
				", away='" + away + '\'' +
				", homeGoals=" + homeGoals +
				", awayGoals=" + awayGoals +
				'}';
	}
	
}
