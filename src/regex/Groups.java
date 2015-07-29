package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * группы и квантификаторы
 *
 * В первом случае к первой группе относятся все возможные символы, но при
 этом остается минимальное количество символов для второй группы.
 Во втором случае для первой группы выбирается наименьшее количество
 символов, т. к. используется слабое совпадение.
 В третьем случае первой группе будет соответствовать вся строка, а для вто-
 рой не остается ни одного символа, так как вторая группа использует слабое
 совпадение.
 В четвертом случае строка не соответствует регулярному выражению, т. к. для
 двух групп выбирается наименьшее количество символов.
 */
public class Groups {
    public static void main(String[ ] args) {
        String input = "abdcxyz";
        simpleMatches ("([a-z]*)([a-z]+)", input);
        simpleMatches ("([a-z]?)([a-z]+)", input);
        simpleMatches ("([a-z]+)([a-z]*)", input);
        simpleMatches ("([a-z]?)([a-z]?)", input);
    }
    public static void simpleMatches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) {
            System.out.println("First group: " + matcher.group(1));
            System.out.println("Second group: " + matcher.group(2)+ "\n");
        } else {
            System.out.println("nothing\n");
        }
    }
}
