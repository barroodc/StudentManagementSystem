package com.chrisportfolio.StudentManagementSystem.utils.jaxbmarshallers;

import com.chrisportfolio.StudentManagementSystem.model.Admissions;
import com.chrisportfolio.StudentManagementSystem.model.ExamType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbExamTypeMarshaller {

     /*
    public static void main(String[] args) {
       ExamType examType = new ExamType();
       jaxbObjectToXML(examType);
    }
     */

   /* public static void jaxbObjectToXML(ExamType examType) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ExamType.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(examType, new File("examtype.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    */
}
