package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.Homework;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbHomeworkMarshaller {

        /*
    public static void main(String[] args) {
       Homework homework = new Homework();
       jaxbObjectToXML(homework);
    }
     */

   /* public static void jaxbObjectToXML(Homework homework) {


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Homework.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(homework, new File("homework.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    */
}
