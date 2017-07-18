package wildflyswarm.mail;

public class Mail {

  private String to;
  private String subject;
  private String content;

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Mail mail = (Mail) o;

    if (to != null ? !to.equals(mail.to) : mail.to != null) return false;
    if (subject != null ? !subject.equals(mail.subject) : mail.subject != null) return false;
    return content != null ? content.equals(mail.content) : mail.content == null;
  }

  @Override
  public int hashCode() {
    int result = to != null ? to.hashCode() : 0;
    result = 31 * result + (subject != null ? subject.hashCode() : 0);
    result = 31 * result + (content != null ? content.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Mail{" +
      "to='" + to + '\'' +
      ", subject='" + subject + '\'' +
      ", content='" + content + '\'' +
      '}';
  }

}
