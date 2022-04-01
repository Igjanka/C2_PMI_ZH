import java.util.ArrayList;

public class Team
{
    protected ArrayList<String[]> member = new ArrayList<>();

    public void newMember(String name, String position)
    {

        String[]part = new String[2];
        part[0] = name;
        part[1] = position;
        member.add(part);

    }

    public void leaveTeam(String name)
    {
        for (int i = 0; i < member.size(); i++)
        {
            if(member.get(i)[0] == name)
            {
                member.remove(i);

            }
        }

    }
    public String getMembers()
    {
        String result = "";

        return result;
    }

}
