import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Clients implements Iterable<Client> {
    private ArrayList<Client> clients=new ArrayList<>();

    public Clients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void orderBySurnameDescending(){
        clients.sort(new ComparatorOrderBySurnameDescending());
    }
    public void orderByAgeAscending(){
        clients.sort(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                if(c1.getAge()==c2.getAge()){
                    return 0;
                }else if(c1.getAge()>c2.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
    }
    public void orderByAgeDescending(){
        clients.sort(new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                if(c1.getAge()==c2.getAge()){
                    return 0;
                }else if(c2.getAge()>c1.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
    };

    @Override
    public Iterator<Client> iterator() {
        return clients.iterator();
    }

    class ComparatorOrderBySurnameDescending implements Comparator<Client> {

        @Override
        public int compare(Client o1, Client o2) {
            return o2.compareTo(o1);
        }
    }
}
