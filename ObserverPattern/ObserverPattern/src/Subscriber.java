public class Subscriber {
    private String name;
    private String title;
    private Channel channel = new Channel();
    public Subscriber(String name)
    {
        super();
        this.name=name;
    }
    public void update()
    {
    System.out.println(name+" Video Uploaded");
    }
    public void subscribeChannel(Channel ch)
    {
        channel = ch;
    }
            
}
