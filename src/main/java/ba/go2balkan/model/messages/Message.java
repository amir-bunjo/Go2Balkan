package ba.go2balkan.model.messages;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
@Table(name="message")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer account;

	@Column(name="account_sender")
	private Integer accountSender;

	private Integer client;

	@Column(name="client_sender")
	private Integer clientSender;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	private Boolean deleted;

	@Column(name="is_read")
	private Boolean isRead;

	@Column(name="message_body")
	private String messageBody;

	private Integer notification;

	@Column(name="parent_message_id")
	private Integer parentMessageId;

	@Column(name="sender_deleted")
	private Boolean senderDeleted;

	private String subject;

	public Message() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Integer getAccountSender() {
		return this.accountSender;
	}

	public void setAccountSender(Integer accountSender) {
		this.accountSender = accountSender;
	}

	public Integer getClient() {
		return this.client;
	}

	public void setClient(Integer client) {
		this.client = client;
	}

	public Integer getClientSender() {
		return this.clientSender;
	}

	public void setClientSender(Integer clientSender) {
		this.clientSender = clientSender;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public String getMessageBody() {
		return this.messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public Integer getNotification() {
		return this.notification;
	}

	public void setNotification(Integer notification) {
		this.notification = notification;
	}

	public Integer getParentMessageId() {
		return this.parentMessageId;
	}

	public void setParentMessageId(Integer parentMessageId) {
		this.parentMessageId = parentMessageId;
	}

	public Boolean getSenderDeleted() {
		return this.senderDeleted;
	}

	public void setSenderDeleted(Boolean senderDeleted) {
		this.senderDeleted = senderDeleted;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}