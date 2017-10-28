package example.entity;

public class Bank
{
    private String id;
    private String name;
    private int minCreditScore;

    public Bank()
    {
    }

    public Bank( String id, String name, int minCreditScore)
    {
        this.id = id;
        this.name = name;
        this.minCreditScore = minCreditScore;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMinCreditScore()
    {
        return minCreditScore;
    }

    public void setMinCreditScore(int minCreditScore)
    {
        this.minCreditScore = minCreditScore;
    }

    @Override
    public String toString()
    {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minCreditScore=" + minCreditScore +
                '}';
    }
}
