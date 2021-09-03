package com.io.stream.workshp.day37;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AddressBookIOServiceFile {
	public String iOFileName = "src/main/java/resources/iOfile.txt";

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

}
