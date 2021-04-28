package Country;

import Population.Person;

import java.util.ArrayList;
import java.util.List;

public class Map
{
    private List<Settlement> settlements;

    public Map()
    {
        settlements = new ArrayList<Settlement>();
    }

    public boolean addSettelmentToMap(Settlement s)
    {
        return settlements.add(s);
    }

    public boolean removeSettelmentToMap(Settlement s)
    {
        return settlements.remove(s);
    }

    public Settlement getSettelmentFromMapByIndex(int i)
    {
        return settlements.get(i);
    }

    public int getSettlementAmount (){
        return settlements.size();
    }

    @Override
    public String toString() {
        return "Map{" +
                "settlements=" + settlements +
                '}';
    }
}