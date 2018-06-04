package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class DummyBotTest {

	/**
	 * Тест ответа на вопрос "Привет, Бот".
	 */
	@Test
	public void whenGreetBot() {
		DummyBot bot = new DummyBot();
		assertThat(
				bot.answer("Привет, Бот."),
				is("Привет, Умник.")
		);
	}

	/**
	 * Тест ответа на вопрос "Пока".
	 */
	@Test
	public void whenBuyBot() {
		DummyBot bot = new DummyBot();
		assertThat(
				bot.answer("Пока."),
				is("До скорой встречи.")
		);
	}

	/**
	 * Тест ответа на другой вопрос.
	 */
	@Test
	public void whenUnknownBot() {
		DummyBot bot = new DummyBot();
		assertThat(
				bot.answer("Сколько будет 2 + 2?"),
				is("Это ставит меня в тупик. Спросите другой вопрос.")
		);
	}
}