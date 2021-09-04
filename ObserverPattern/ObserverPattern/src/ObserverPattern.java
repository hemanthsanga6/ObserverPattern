public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Channel sanga = new Channel();
        
        Subscriber s1 = new Subscriber("sub1");
        Subscriber s2 = new Subscriber("sub2");
        Subscriber s3 = new Subscriber("sub3");
        Subscriber s4 = new Subscriber("sub4");
        Subscriber s5 = new Subscriber("sub5");
        
        sanga.subscribe(s1);
        sanga.subscribe(s2);
        sanga.subscribe(s3);
        sanga.subscribe(s4);
        sanga.subscribe(s5);
        
        s1.subscribeChannel(sanga);
        s2.subscribeChannel(sanga);
        s3.subscribeChannel(sanga);
        s4.subscribeChannel(sanga);
        s5.subscribeChannel(sanga);
        
        sanga.upload("SSUP");
        sanga.unSubscribe(s2);
        sanga.upload("HOW IS IT GOING");
        
        
        
    }
    
}
