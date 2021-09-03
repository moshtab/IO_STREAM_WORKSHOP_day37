package com.io.stream.workshp.day37;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class AddressBookIOServiceFile {
	public String iOFileName = "src/main/java/resources/iOfile.txt";
	public String csvFileName = "src/main/java/resources/CSVFile.csv";
	public String jsonFileName = "src/main/java/resources/jsonFile.json";

	public void writeIOData(List<Contact> list) {
		StringBuffer empBuffer = new StringBuffer();
		list.forEach(contact -> {
			String data = contact.toString().concat("\n");
			empBuffer.append(data);
		});
		try {
			Files.write(Paths.get(iOFileName), empBuffer.toString().getBytes());
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

	public void readIOData() {
		System.out.println("Reading IO file");
		try {
			System.out.println(new String(Files.readAllBytes(Paths.get(iOFileName))));
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

	public void writeCSVData(List<Contact> list) {
		try (Writer writer = Files.newBufferedWriter(Paths.get(csvFileName));) {
			StatefulBeanToCsv<Contact> beanToCsv = new StatefulBeanToCsvBuilder<Contact>(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
			try {
				beanToCsv.write(list);
			} catch (CsvDataTypeMismatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CsvRequiredFieldEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void readCSVData() {
		System.out.println("Reading csv data");
		Path path = Paths.get(csvFileName);
		try (Reader reader = Files.newBufferedReader(path); CSVReader csvReader = new CSVReader(reader);) {
			List<String[]> list = csvReader.readAll();

			for (String[] record : list) {

				System.out.println("FirstName :" + record[0]);
				System.out.println("LastName :" + record[1]);
				System.out.println("City :" + record[2]);
				System.out.println("State :" + record[3]);
				System.out.println(" email :" + record[4]);
				System.out.println("phoneNumber :" + record[5]);
				System.out.println("zip :" + record[6]);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvException e) {
			e.printStackTrace();
		}

	}

	public void writeJasonData(List<Contact> list) {
		Gson gson = new Gson();
		String jason = gson.toJson(list);
		try {
			FileWriter writer = new FileWriter(jsonFileName);
			writer.write(jason);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
