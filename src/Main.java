import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Client c1=new Client(1, LocalDate.now(),"Iris","Vilaseca",26);
        Client c2=new Client(2, LocalDate.now(), "William","Smith",45);
        Client c3=new Client(3,LocalDate.now(),"John", "Doe",35);
        ArrayList<Client> clientArrayList=new ArrayList<Client>();
        clientArrayList.add(c1);
        clientArrayList.add(c2);
        clientArrayList.add(c3);
        Clients clients=new Clients(clientArrayList);
        clients.orderByAgeDescending();
        Iterator<Client> newClientIterator= clients.iterator();
        while(newClientIterator.hasNext()){
            System.out.println(newClientIterator.next());
        }
    }
}