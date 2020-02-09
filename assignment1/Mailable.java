interface Mailable
{
    public void sendMail();

    default public void markRead()
    {
        System.out.println("markRead vitra ko");
    }
}

class Message implements Mailable
{
    public void sendMail()
    {
        System.out.println("Mail Sent");
    }
}

class MailDemo
{
    public static void main(String[] args)
    {
        Message m = new Message();
        m.markRead();
        m.sendMail();
    }
}