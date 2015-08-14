package ru;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .serializeSpecialFloatingPointValues()
                /*.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setExclusionStrategies(new ExclusionStrategy[]{new HashCodeCalcExclusionStrategy()})
                .setDateFormat(DATE_FORMAT).registerTypeAdapter(JAXBElement.class, new JAXBElementSerializer())*/
                .setPrettyPrinting()
                .create();

        String responseFromUrl = "[{\"title\":\"Телефон\",\"subs\":[{\"id\":157291,\"title\":\"Мобильная связь\"},{\"id\":524624,\"title\":\"Городской телефон\"},{\"id\":157298,\"title\":\"IP-телефония\"}]},{\"title\":\"Интернет и ТВ\",\"subs\":[{\"id\":157292,\"title\":\"Проводной интернет\"},{\"id\":178472,\"title\":\"Телевидение\"},{\"id\":524625,\"title\":\"Беспроводной интернет\"}]},{\"title\":\"Развлечения\",\"subs\":[{\"id\":522695,\"title\":\"Музыка и фильмы\"}]},{\"title\":\"Оплата квитанций\",\"subs\":[{\"id\":179845,\"title\":\"ЖКХ\"}]},{\"title\":\"Игры и общение\",\"subs\":[{\"id\":157297,\"title\":\"Игры\",\"subs\":[{\"id\":525000,\"title\":\"Жанры:Казуальные\"},{\"id\":525001,\"title\":\"Жанры:Онлайн-игры\"},{\"id\":525002,\"title\":\"Жанры:Action и шутеры\"},{\"id\":525003,\"title\":\"Жанры:Ролевые игры\"},{\"id\":525005,\"title\":\"Жанры:Стратегии\"},{\"id\":525006,\"title\":\"Жанры:Приключения\"},{\"id\":525008,\"title\":\"Жанры:Симуляторы\"},{\"id\":525171,\"title\":\"Жанры:Порталы и сервисы\"},{\"id\":525265,\"title\":\"Жанры:Игровые артефакты\"}]},{\"id\":524626,\"title\":\"Социальные сети\"},{\"id\":522901,\"title\":\"Знакомства\"}]},{\"title\":\"Финансы\",\"subs\":[{\"id\":522747,\"title\":\"Погашение кредитов\"}]},{\"title\":\"Бытовые покупки\",\"subs\":[{\"id\":288993,\"title\":\"Красота, здоровье, спорт\"}]},{\"title\":\"Путешествия\",\"subs\":[{\"id\":523297,\"title\":\"Билеты на транспорт\"},{\"id\":524634,\"title\":\"Турагентства\"}]},{\"title\":\"Сайты\",\"subs\":[{\"id\":160550,\"title\":\"Реклама\"},{\"id\":233554,\"title\":\"Хостинг и домены\"}]},{\"title\":\"А также:\",\"subs\":[{\"id\":179843,\"title\":\"Благотворительность\"},{\"id\":524635,\"title\":\"Онлайн-аукционы\"},{\"id\":522887,\"title\":\"Прочее\"}]}]";
        SomeBean[] someBeans = gson.fromJson(responseFromUrl, SomeBean[].class);
        //add to db

        System.out.println(gson.toJson(someBeans));
    }

}
