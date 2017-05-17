/**
 * Write a description of class State here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface State
{
    public String getMessage();
    public void onButtonClick(int buttonId);
    public void setState();        
}
