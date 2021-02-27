package x.canoe;



import java.time.LocalDateTime;
import java.util.*;

public class CanoeOffice {


    private List<CanoeRental> canoeRental;

    public void addRental(CanoeRental x){
        canoeRental.add(x);
    }

    public String findRentalByName(String name){
        for(CanoeRental x:canoeRental){
            if(x.equals(name)&& x.getEndTime()==null){
                String out= x.toString();
                return out;

            }
        }
        return "Can not find";
    }


    public void closeRentalByName(String name, LocalDateTime endTime){
        for(CanoeRental x:canoeRental){
            if(x.equals(name)&& x.getEndTime()==null){
                x.setEndTime(endTime);

            }
        }
    }

   public double getRentalPriceByName(String name, LocalDateTime endTime){
      List <CanoeRental> canoeRentals=List.copyOf(canoeRental);
        for(CanoeRental x:canoeRental){
            if(x.equals(name)&& x.getEndTime()==null){
               double Price= x.calculateRentalSum()*(x.getCanoeType().getPrice());
               return Price;
            }
        }
        throw new IllegalArgumentException("Not found");
    }

    public List<CanoeRental> listClosedRentals(){
        List <CanoeRental> result= new ArrayList<>();
        for(CanoeRental x:canoeRental){
            if(x.getEndTime()!=null){
               result.add(x);
            }
        }
        Collections.sort(result);
        return result;

    }

public Map<CanoeType, Integer> countRentals(){
    Map<CanoeType, Integer> select= new HashMap<>();
    for(CanoeRental x:canoeRental){
        if (!select.containsKey(x.getCanoeType())) {
            select.put(x.getCanoeType(), 0);
        }
        select.put(x.getCanoeType(),select.get(x.getCanoeType())+1);
    }

    return select;
}
    }

