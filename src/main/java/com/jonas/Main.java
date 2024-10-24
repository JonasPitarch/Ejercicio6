package com.jonas;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonFile = "src/main/resources/musica.json";

            Festival festival = mapper.readValue(new File(jsonFile), Festival.class);

            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
            String xml="src/main/resources/musica.xml";
            xmlMapper.writeValue(new File(xml), festival);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

