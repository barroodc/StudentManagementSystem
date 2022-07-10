package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Homework;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class JaxbHomeworkMarshaller {

    public static void main(String[] args) {
        Calendar calcHomeworkOne = Calendar.getInstance();
        calcHomeworkOne.set(Calendar.YEAR, 2022);
        calcHomeworkOne.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calcHomeworkOne.set(Calendar.DAY_OF_MONTH, 15);
        Date assignedDate = calcHomeworkOne.getTime();

        Calendar calcHomeworkOneDueDate = Calendar.getInstance();
        calcHomeworkOneDueDate.set(Calendar.YEAR, 2022);
        calcHomeworkOne.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calcHomeworkOne.set(Calendar.DAY_OF_MONTH, 19);
        Date dueDate = calcHomeworkOneDueDate.getTime();

       Homework homework = new Homework(3306L, "Fall Semester", "Calculus 1", assignedDate, dueDate, 0.0,
               "n/a", "Matt Amaticas", "Do practice problems from Ch.1");
       jaxbObjectToXML(homework);
    }

    public static void jaxbObjectToXML(Homework homework) {


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Homework.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(homework, new File("homework.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }


}
