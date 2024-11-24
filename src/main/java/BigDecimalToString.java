/*
Написать функцию, возвращающую прописное написание стоимости (до тысяч 99 999.99).
Входной параметр переменная типа bigDecimal
 */

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.math.BigDecimal;
import java.util.Locale;

public class BigDecimalToString {
    /**
     * Метод возвращает переданное число прописью
     */
    public String getCostToSting(BigDecimal amount) {
        RuleBasedNumberFormat strFormat = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                RuleBasedNumberFormat.SPELLOUT);
        return strFormat.format(amount.doubleValue());
    }


}
