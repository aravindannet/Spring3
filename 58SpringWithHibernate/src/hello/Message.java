package hello;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="messages")

public class Message {
	
private Long id;
private String text;

public Message()
{
	}

@Id
@Column(name="message_id")

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}

public String toString(){
	return text;
}

}
