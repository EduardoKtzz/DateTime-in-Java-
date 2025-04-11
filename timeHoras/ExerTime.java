package timeHoras;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ExerTime {

	public static void main(String[] args) {

		//LOCAL
		System.out.println();
		System.out.println();
		LocalDate d01 = LocalDate.now();
		System.out.println("Data Atual sem formatação: " + d01);

		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data e hora sem formatação: " + d02);

		//GLOBAL
		Instant d03 = Instant.now();
		System.out.println("Data e hora global sem formatação:" + d03);

		//ESCOLHENDO A DATA
		LocalDate d04 = LocalDate.parse("2025-04-06");
		System.out.println("Data escolhida: " + d04);

		//FORMATANDO DATAS
		System.out.println("-------------------");

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d05 = LocalDate.parse("06/05/2025", formato);
		System.out.println("Data Brasil: " + d05.format(formato));

		System.out.println();

		//COVERTER GLOBAL PARA LOCAL
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println("Conversão: " + r1);

		//PEGAR UMA PARTE DA DATA
		System.out.println("---------------------");
		System.out.println("Dia: " + d04.getDayOfMonth());
		System.out.println("Mês: " + d04.getMonthValue());
		System.out.println("Ano: " + d04.getYear());
		System.out.println("Horas: " + d02.getHour());
		System.out.println("Minutos: " + d02.getMinute());

		//CALCULO COM DATA
		//MINUS - PARA SUBTRAIR
		//PLUS - SOMAR
		System.out.println("----------------------");
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextYearLocalDate = d04.plusYears(2);
		LocalDateTime nextDaysLocalDate = d02.minusDays(7);

		System.out.println("Data de antigamente: " + pastWeekLocalDate);
		System.out.println("Data no futuro: " + nextWeekLocalDate);
		System.out.println("Data ano futuro: " + nextYearLocalDate);
		System.out.println(nextDaysLocalDate);


		//DURAÇÂO ENTRE DATAS
		System.out.println("-------------------------");
		Duration t1 = Duration.between(nextDaysLocalDate, d02);
		System.out.println("Quantos dias se passaram desde 06-04-2024: " + t1.toDays() + " dias!");

	}

}
