package RealHomework2.Week20.PrintfEnum;

enum Currency {
    IRR,
    VND,
    IDR,
    GNF,
    LAK,
    SLL
}

public class Currencies {
    public static void main(String[] args) {
        Currency[] currencies = Currency.values();
        for (Currency currency : currencies) {
            System.out.println(currency + " at index " + currency.ordinal());

            switch (currency) {
                case IRR:
                    System.out.println("The Iranian Rial is the least valued currency in the world. It is the lowest " +
                            "currency to USD. For the simplification of calculations, Iranians regularly use the term " +
                            "‘Toman’. 1 Toman equals 10 Rials.");
                    break;
                case VND:
                    System.out.println("The second cheapest currency in the world is the Vietnamese Dong. " +
                            "Vietnam is still on the way of complete progress from a centralized economy to a market economy. " +
                            "As a result, the Vietnamese Dong is a currency worth the least. " +
                            "Extremely devalued in terms of other world currencies, " +
                            "it has one of the lowest currency exchange rates across all countries except Iran.");
                    break;
                case IDR:
                    System.out.println("Indonesian Rupiah: As a result of the low values of banknotes that were of an old-style, " +
                            "the presidential decree of 5th September 2016, issued 7 new banknotes. " +
                            "Their denominations ranged from one thousand to hundred thousand Rupiahs. " +
                            "hough Indonesia is an economically stable and developed country in Southeast Asia, " +
                            "the Rupiah has a very low exchange rate.");
                    break;
                case GNF:
                    System.out.println("One of the most inflated currencies, the Guinean Franc is the official currency of Guinea. " +
                            "An African country with a high inflation rate, increasing poverty, and the prevalence of gangsters, " +
                            "Guinea has been suffering from a currency devaluation for a long time. " +
                            "The most astonishing aspects of this country are the natural treasures like gold, " +
                            "aluminium, and diamonds that are found in abundance here. With all such resources, " +
                            "the currency should be one of great value. Sadly, this is not the case.");
                    break;
                case LAK:
                    System.out.println("As the only currency on the list of cheapest currency in the world that did not devalue is the Laotian Kip. " +
                            "As the only currency that was initially introduced at a very low rate, " +
                            "this currency has been suffering from a very low exchange rate for many years.");
                    break;
                case SLL:
                    System.out.println("Sierra Leonean Leone: A very poor African country, Sierra Leone is continually prone to many setbacks and sufferings. " +
                            "With a very low level of economic and social development, " +
                            "the currency has been going through consistent devaluation for many years.");
                    break;
            }
        }
    }
}
