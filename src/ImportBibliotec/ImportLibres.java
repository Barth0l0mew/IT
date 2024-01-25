package ImportBibliotec;

import com.github.moneytostr.MoneyToStr;
import org.efaps.number2words.Converter;
import org.efaps.number2words.IConverter;

import java.util.Locale;

public class ImportLibres {
    public static void main(String[] args) {
        IConverter converter = Converter.getMaleConverter(Locale.ENGLISH);
        String text = converter.convert(2023);
        System.out.println(text);
        MoneyToStr moneyToStr = new MoneyToStr(MoneyToStr.Currency.RUR, MoneyToStr.Language.RUS, MoneyToStr.Pennies.NUMBER);
        System.out.println(moneyToStr.convert(777.77D));
    }
}
