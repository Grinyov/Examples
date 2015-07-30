package exception.polymorph;

import java.text.ParseException;

/**
 * Created by green on 31.07.2015.
 *
 *
 */
public class StoneAction {
    public void buildHouse(Stone stone) {
        try {
            stone.build("some info");
// предусмотрена обработка ParseException и его подклассов
        } catch(ParseException e) {
            System.err.print(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
