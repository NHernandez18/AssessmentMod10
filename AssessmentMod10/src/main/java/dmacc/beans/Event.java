package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Dec 11, 2023
 */
@Entity
public class Event {
	@Id
	@GeneratedValue
	private long id;
	private String type;
	private String date;
	private int attendeesAllowed;
	@Autowired
	private Performers performer;
	
	public Event() {
		super();
		this.attendeesAllowed = 500;
	}

	public Event(String type) {
		super();
		this.type = type;
	}

	public Event(String type, String date, int attendeesAllowed) {
		super();
		this.type = type;
		this.date = date;
		this.attendeesAllowed = attendeesAllowed;
	}

	public Event(long id, String type, String date, int attendeesAllowed) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.attendeesAllowed = attendeesAllowed;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAttendeesAllowed() {
		return attendeesAllowed;
	}

	public void setAttendeesAllowed(int attendeesAllowed) {
		this.attendeesAllowed = attendeesAllowed;
	}

	public Performers getPerformer() {
		return performer;
	}

	public void setPerformer(Performers performer) {
		this.performer = performer;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", type=" + type + ", date=" + date + ", attendeesAllowed=" + attendeesAllowed
				+ ", performer=" + performer + "]";
	}

}
