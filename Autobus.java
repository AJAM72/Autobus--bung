public class Autobus
{
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;
    public void setKennzeichen(String newKennzeichen)
    {
        kennzeichen = newKennzeichen;
    }
    public void setSitzplatze(int newSitzplatze)
    {
        sitzplatze = newSitzplatze;
    }
    public void setAnhanger(boolean newAnhanger)
    {
      anhanger = newAnhanger;  
    }
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    public int getSitzplatze()
    {
        return sitzplatze;
    }
    public boolean getAnhanger()
    {
        return anhanger;
    }
    public Autobus(String newKennzeichen, int newSitzplatze, boolean newAnhanger)
    {
        setKennzeichen(newKennzeichen);
        setSitzplatze (newSitzplatze);
        setAnhanger   (newAnhanger);
    }
    public Autobus(String newKennzeichen, int newSitzplatze)
    {
        setKennzeichen(newKennzeichen);
        setSitzplatze(newSitzplatze);
        setAnhanger(false);
    }
    public Autobus(String newKennzeichen)
    {
        setKennzeichen(newKennzeichen);
        setSitzplatze(29);
        setAnhanger(false);
    }
    public Autobus()
    {
      setKennzeichen("W-1234A");
      setSitzplatze(29);
      setAnhanger(false);
    }
    

}