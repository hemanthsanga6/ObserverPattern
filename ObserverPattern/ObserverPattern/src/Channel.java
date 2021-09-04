import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class Channel {
   private ArrayList<Subscriber> subs= new ArrayList<>();
   private String title;
   
   public void subscribe(Subscriber sub)
   {
       subs.add(sub);   
   }
   public void unSubscribe(Subscriber sub)
   {
       int i = subs.indexOf(sub);
       if(i>=0)
       {
       subs.remove(sub);    
       }
       
   }
   public void notifySubscribers()
   {
     for(Subscriber sub : subs)
     {
         sub.update();
     }
   }
   public void upload(String title)
   {
       this.title=title;
       notifySubscribers();
   }
}
