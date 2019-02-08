package com.ncu.processors;
import java.io.*;
import org.json.simple.*;
//public class csvprocessor{
 public class csvprocessor{
public boolean processCSV(String csvFileName,String jsonFileName){
	try{
		FileReader fr=new FileReader(csvFileName); 
		BufferedReader br = new BufferedReader(fr);
		String headerLine = br.readLine();
		String[] keyNames = headerLine.split(",");
		@SuppressWarnings("unchecked")
		int i=0;
		/*while (i<keyNames.length){
			System.out.println(keyNames[i]);
			i++;
		}*/
		String line;
		
		JSONArray jsonArry = new JSONArray();
		FileWriter fw = new FileWriter(jsonFileName);
		BufferedWriter bw = new BufferedWriter(fw);
		while ((line = br.readLine()) != null) {
			JSONObject jObj = new JSONObject();
			String[] dataLine = line.split(",");
			for(i=0;i<dataLine.length;i++){
				jObj.put(keyNames[i],dataLine[i]);
			}
			jsonArry.add(jObj);
		}
		bw.write(jsonArry.toJSONString());
		bw.flush();
	}
	catch(Exception e){
		System.out.println(e);
		return (false);
	}
	return (true);
 }
}

class testprocessorcsv{
	public static void main(String[] args){
		csvprocessor cv = new csvprocessor();
		try{
			System.out.println(cv.processCSV("example.csv","jsonfile.json"));
		}
		catch(Exception e){}
	}
}

